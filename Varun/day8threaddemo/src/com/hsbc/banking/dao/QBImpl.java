package com.hsbc.banking.dao;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.hsbc.banking.models.Answer;
import com.hsbc.banking.models.Question;

public class QBImpl implements QBDao{

	private File file;
	private FileInputStream fileInputStream;
	private FileOutputStream fileOutputStream;
	private ObjectInputStream objectInputStream;
	private ObjectOutputStream objectOutputStream;
	
	public QBImpl() throws IOException
	{
		file=FileHelper.createFile();
	}
	
	
	@Override
	public boolean addQuestions(List<Question> questions) throws IOException {
		// TODO Auto-generated method stub
		fileOutputStream=new FileOutputStream(file,true);
		objectOutputStream=new ObjectOutputStream(fileOutputStream);
		for(Question question: questions)
			objectOutputStream.writeObject(question);
		
		objectOutputStream.close();
		fileOutputStream.close();
		return true;
		
	}
	
	@Override
	public List<Question> getQuestions() throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		fileInputStream=new FileInputStream(file);
		objectInputStream=new ObjectInputStream(fileInputStream);
		List<Question> questions=new ArrayList<Question>();
		Question question=null;
		try
		{
			while((question=(Question) objectInputStream.readObject())!=null)
					questions.add(question);				
			
		}
		catch(EOFException exception)
		{
			
		}
		objectInputStream.close();
		fileInputStream.close();
		return questions;
	}

	

}

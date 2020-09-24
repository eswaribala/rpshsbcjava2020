package com.hsbc.banking.bl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.hsbc.banking.dao.QBDao;
import com.hsbc.banking.dao.QBImpl;
import com.hsbc.banking.exceptions.FileCreationException;
import com.hsbc.banking.exceptions.QuestionCreationException;
import com.hsbc.banking.exceptions.QuestionRetrievalException;
import com.hsbc.banking.models.Question;

public class QBBLImpl implements QBBL {

	private QBDao qbDao;
	
	public QBBLImpl() throws FileCreationException
	{
		try {
			qbDao=new QBImpl();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new FileCreationException("Check Permissions");
		}
	}
	
	
	@Override
	public boolean addQuestions(List<Question> questions) throws QuestionCreationException {
		// TODO Auto-generated method stub
		boolean status=false;
		try {
			status=qbDao.addQuestions(questions);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new QuestionCreationException("Check Question Object");
		} 
		return status;
	}

	@Override
	public List<Question> getQuestions() throws QuestionRetrievalException {
		// TODO Auto-generated method stub
		List<Question> questions;
		try {
			questions=qbDao.getQuestions();
		} catch (ClassNotFoundException|IOException e) {
			// TODO Auto-generated catch block
			throw new QuestionRetrievalException("File Corrupted");
		} 
		return questions;
	}

}

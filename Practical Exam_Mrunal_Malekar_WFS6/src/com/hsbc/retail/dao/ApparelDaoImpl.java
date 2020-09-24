package com.hsbc.retail.dao;

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


import com.hsbc.retail.models.Apparel;


public class ApparelDaoImpl implements ApparelDao {

	
	
	private File file;
	private FileOutputStream fileOutputStream;
	private FileInputStream fileInputStream;

	private ObjectOutputStream objectOutputStream;
	private ObjectInputStream objectInputStream;
	
public ApparelDaoImpl() throws IOException
{
	file=filehelper.createFile();
}
	@Override
	public boolean addApparel(List<Apparel> apparellist) throws IOException {
		// TODO Auto-generated method stub
		///apparel dao layer
		boolean status=false;
		fileOutputStream=new FileOutputStream(file,true);
		objectOutputStream=new ObjectOutputStream(fileOutputStream);
		for(Apparel a:apparellist)
		{
			objectOutputStream.writeObject(a);
			status=true;
			
		}
		
		objectOutputStream.close();
		fileOutputStream.close();
		return status;
		
		
		
	}

	@Override
	public List<Apparel> getAllApparels() throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		fileInputStream=new FileInputStream(file);
		objectInputStream=new ObjectInputStream(fileInputStream);
		List<Apparel> apparellist =new ArrayList<Apparel>();
		Apparel v=null;
		try {
			
				while((v=(Apparel)objectInputStream.readObject())!=null)
				{
					apparellist.add(v);
				}
		}
				catch(EOFException exception)
				{
					
				}
		
		finally {
			objectInputStream.close();
			fileInputStream.close();
		}
		return apparellist;
		
	}

}

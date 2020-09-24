package com.hsbc.ecommerce.dao;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;

import com.hsbc.ecommerce.models.Category;
import com.hsbc.ecommerce.models.SubCategory;

public class CategoryImpl implements CategoryDao{

	private File file;
	private FileOutputStream fileOutputStream;
	private FileInputStream fileInputStream;
	private ObjectOutputStream objectOutputStream;
	private ObjectInputStream objectInputStream;	
	public CategoryImpl(String fileName,int level) throws IOException
	{
		file=FileHelper.createFile(fileName,level);
			
		
	}
		
	@Override
	public boolean addCategory(Category[] categories) throws IOException {
		// TODO Auto-generated method stub
		boolean status=false;
		fileOutputStream=new FileOutputStream(file,true);//append mode		
		objectOutputStream=new ObjectOutputStream(fileOutputStream);
		for(int i=0;i<categories.length;i++)	
		   objectOutputStream.writeObject(categories[i]);
		objectOutputStream.close();
		fileOutputStream.close();
		status=true;
		return status;
	}
	
	public int getObjectCount() throws IOException, ClassNotFoundException
	{
		
		
		fileInputStream=new FileInputStream(file);	
		objectInputStream=new ObjectInputStream(fileInputStream);
		Category category=null;
		int count=0;
		try
		{
		while(objectInputStream.readObject()!=null)
		{
			count++;
		}
		}
		catch(EOFException exception)
		{
			
		}
		catch(StreamCorruptedException exception)
		{
			System.out.println(exception.getMessage());
		}
		finally
		{
			objectInputStream.close();
			fileInputStream.close();
		}
		
		return count;
	}
	

	@Override
	public Category[] getAllCategories() throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		int count=getObjectCount();
		Category[] categories=new Category[count];	
		
		int pos = 0;
		Category category = null;
		fileInputStream=new FileInputStream(file);	
		objectInputStream=new ObjectInputStream(fileInputStream);
		try {
			while ((category = (Category) objectInputStream.readObject()) != null) {
				categories[pos] = category;
				pos++;
				
			}
		} catch (EOFException exception) {

		} 
		catch(StreamCorruptedException exception)
		{
			System.out.println(exception.getMessage());
		}
		finally
		{
			objectInputStream.close();
			fileInputStream.close();
		}
		
		
		 
		return categories;
	}

	@Override
	public boolean addSubCategory(SubCategory[] subCategories) throws IOException {
		// TODO Auto-generated method stub
		boolean status=false;
		fileOutputStream=new FileOutputStream(file,true);//append mode		
		objectOutputStream=new ObjectOutputStream(fileOutputStream);
		for(int i=0;i<subCategories.length;i++)	
		   objectOutputStream.writeObject(subCategories[i]);
		objectOutputStream.close();
		fileOutputStream.close();
		status=true;
		return status;
	}

	@Override
	public SubCategory[] getAllSubCategories() throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		int count=getObjectCount();
		SubCategory[] categories=new SubCategory[count];	
		
		int pos = 0;
		SubCategory category = null;
		fileInputStream=new FileInputStream(file);	
		objectInputStream=new ObjectInputStream(fileInputStream);
		try {
			while ((category = (SubCategory) objectInputStream.readObject()) != null) {
				categories[pos] = category;
				pos++;
				
			}
		} catch (EOFException exception) {

		} 
		catch(StreamCorruptedException exception)
		{
			System.out.println(exception.getMessage());
		}
		finally
		{
			objectInputStream.close();
			fileInputStream.close();
		}
		
		
		 
		return categories;
	}

}

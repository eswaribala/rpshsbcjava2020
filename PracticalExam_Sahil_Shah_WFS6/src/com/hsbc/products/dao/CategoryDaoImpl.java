package com.hsbc.products.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.hsbc.products.bl.SubCategorySorter;
import com.hsbc.products.model.Category;
import com.hsbc.products.model.SubCategory;
/**
 * 
 * @author Sahil Shah
 *
 */

//This layer basically works to retrive and store data in files.
public class CategoryDaoImpl implements CategoryDao{

	private File file;
	private FileInputStream fileInputStream;
	private FileOutputStream fileOutputStream;
	private ObjectInputStream objectInputStream;
	private ObjectOutputStream objectOutputStream;
	
	public CategoryDaoImpl() throws IOException {
		
		//file creation
		file=FileHelper.createFile();
		
	}

	//to add category
	@Override
	public boolean addCategory(List<Category> categories) throws IOException  {
		
		fileOutputStream=new FileOutputStream(file,true);
		objectOutputStream=new ObjectOutputStream(fileOutputStream);
		for(Category category : categories)
		{
			objectOutputStream.writeObject(category);
		}
		objectOutputStream.close();
		fileOutputStream.close();
		
		
		return true;
	}

	//to retrieve all categories
	@Override
	public List<Category> getAllCategories() throws IOException {
		fileInputStream=new FileInputStream(file);
		objectInputStream=new ObjectInputStream(fileInputStream);
		List<Category> categoryList=new ArrayList<Category>();
		Category category=null;		
		try {
			while((category=(Category) objectInputStream.readObject())!=null)
			 	categoryList.add(category);
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
		objectInputStream.close();
		fileInputStream.close();
		return categoryList;
	}

	//add sub category
	@Override
	public boolean addSubCategory(List<SubCategory> subCategories) throws IOException {

		fileOutputStream=new FileOutputStream(file,true);
		objectOutputStream=new ObjectOutputStream(fileOutputStream);
		for(SubCategory category : subCategories)
		{
			objectOutputStream.writeObject(category);
		}
		objectOutputStream.close();
		fileOutputStream.close();
		
		
		return true;

	}

	// get all sub category
	@Override
	public List<SubCategory> getAllSubCategories() throws IOException {
		fileInputStream=new FileInputStream(file);
		objectInputStream=new ObjectInputStream(fileInputStream);
		List<SubCategory> subCategoryList=new ArrayList<SubCategory>();
		SubCategory category=null;		
		try {
			while((category=(SubCategory) objectInputStream.readObject())!=null)
			 	subCategoryList.add(category);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}			
		objectInputStream.close();
		fileInputStream.close();
		return subCategoryList;
	}

	//comparing and returning top 3
	@Override
	public List<SubCategory> MaxInAllCategories() throws IOException {
		
		List<SubCategory> subCategoryList=getAllSubCategories();
		List<Category> categoryList=getAllCategories();
		for(Category c:categoryList)
		{
			Collections.sort(subCategoryList);
			for(int i=0;i<3;i++)
				System.out.println(subCategoryList.indexOf(i));
		}
		
		return null;
	}
	
	

}

package com.hsbc.ecommerce.bl;

import java.io.IOException;

import com.hsbc.ecommerce.dao.CategoryDao;
import com.hsbc.ecommerce.dao.CategoryImpl;
import com.hsbc.ecommerce.exceptions.FileCreateException;
import com.hsbc.ecommerce.models.Category;
import com.hsbc.ecommerce.models.SubCategory;

public class CategoryBLImpl implements CategoryBL{

	private CategoryDao categoryDao;
	
	public CategoryBLImpl(String fileName,int level) throws FileCreateException
	{
		try {
			categoryDao=new CategoryImpl(fileName,level);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//re throwing
			throw new FileCreateException("Problem in creating the file, "
					+ "Check file Name and Location ");
		}
	}
	@Override
	public boolean addCategory(Category[] categories) throws IOException {
		// TODO Auto-generated method stub
		return categoryDao.addCategory(categories);
	}

	@Override
	public Category[] getAllCategories() throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		return categoryDao.getAllCategories();
	}
	@Override
	public boolean addSubCategory(SubCategory[] subCategories) throws IOException {
		// TODO Auto-generated method stub
		return categoryDao.addSubCategory(subCategories);
	}
	@Override
	public SubCategory[] getAllSubCategories() throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		return categoryDao.getAllSubCategories();
	}

}

package com.hsbc.products.bl;

import java.io.IOException;
import java.util.List;

import com.hsbc.products.Exceptions.CategoryCreationException;
import com.hsbc.products.Exceptions.CategoryRetrievalException;
import com.hsbc.products.dao.CategoryDao;
import com.hsbc.products.dao.CategoryDaoImpl;
import com.hsbc.products.model.Category;
import com.hsbc.products.model.SubCategory;

/**
 * 
 * @author Sahil Shah
 *
 */
public class CategoryBlImpl implements CategoryBl{

	private CategoryDao categoryDao;
	public CategoryBlImpl() throws IOException {
		
		categoryDao=new CategoryDaoImpl();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean addCategory(List<Category> categories) throws CategoryCreationException {
		// TODO Auto-generated method stub
		boolean stat=false;
		try {
			stat=categoryDao.addCategory(categories);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new CategoryCreationException("Error in creating object check your inputs");
		}
		return stat;
	}

	@Override
	public List<Category> getAllCategories() throws CategoryRetrievalException {
		// TODO Auto-generated method stub
		try {
			return categoryDao.getAllCategories();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new CategoryRetrievalException("error in retriving Category");
		}
	}

	@Override
	public boolean addSubCategory(List<SubCategory> subCategories) throws IOException {
		// TODO Auto-generated method stub
		return categoryDao.addSubCategory(subCategories);
	}

	@Override
	public List<SubCategory> getAllSubCategories() throws IOException {
		// TODO Auto-generated method stub
		return categoryDao.getAllSubCategories();
	}

	@Override
	public List<Category> getMaxOfSubCategory() {
		return null;
		
		
		
	}


}

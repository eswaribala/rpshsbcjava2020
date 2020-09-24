package com.hsbc.products.bl;

import java.io.IOException;
import java.util.List;

import com.hsbc.products.Exceptions.CategoryCreationException;
import com.hsbc.products.Exceptions.CategoryRetrievalException;
import com.hsbc.products.model.Category;
import com.hsbc.products.model.SubCategory;

public interface CategoryBl {
	
	boolean addCategory(List<Category> categories) throws CategoryCreationException;
	List<Category> getAllCategories() throws CategoryRetrievalException; 
	boolean addSubCategory(List<SubCategory> subCategories) throws IOException;
	List<SubCategory> getAllSubCategories() throws IOException;
	List<Category> getMaxOfSubCategory();

}

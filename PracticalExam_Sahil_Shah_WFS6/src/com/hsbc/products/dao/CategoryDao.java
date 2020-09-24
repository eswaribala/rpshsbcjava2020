package com.hsbc.products.dao;

import java.io.IOException;
import java.util.List;

import com.hsbc.products.model.Category;
import com.hsbc.products.model.SubCategory;

/**
 * 
 * @author SAhil Shah
 *
 */
public interface CategoryDao {
	
	boolean addCategory(List<Category> categories) throws IOException;
	List<Category> getAllCategories() throws IOException; 
	boolean addSubCategory(List<SubCategory> subCategories) throws IOException;
	List<SubCategory> getAllSubCategories() throws IOException; 
	List<SubCategory> MaxInAllCategories() throws IOException;

}

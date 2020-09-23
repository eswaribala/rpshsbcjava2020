package com.hsbc.ecommerce.dao;

import java.io.IOException;

import com.hsbc.ecommerce.models.Category;
import com.hsbc.ecommerce.models.SubCategory;

public interface CategoryDao {
	
	boolean addCategory(Category[] categories) throws IOException;
	Category[] getAllCategories() throws ClassNotFoundException, IOException;
	boolean addSubCategory(SubCategory[] subCategories) throws IOException;
	SubCategory[] getAllSubCategories() throws ClassNotFoundException, IOException;
}

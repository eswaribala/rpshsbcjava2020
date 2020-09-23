package com.hsbc.ecommerce.views;

import java.io.IOException;
import java.util.Random;

import com.hsbc.ecommerce.bl.CategoryBL;
import com.hsbc.ecommerce.bl.CategoryBLImpl;
import com.hsbc.ecommerce.exceptions.FileCreateException;
import com.hsbc.ecommerce.models.Category;
import com.hsbc.ecommerce.models.SubCategory;

public class SubCategoryApp {
	private static CategoryBL categoryBl;
	//capture custom exception
	static
	{
		try {
			categoryBl=new CategoryBLImpl("Category.txt",2);
		} catch (FileCreateException e) {
			
			System.out.println(e.getMessage());
		}
	}
	
	private static void addSubCategories()
	{
	
		SubCategory[] categories =new SubCategory[100];
		for(int i=0;i<categories.length;i++)
		{
		  categories[i]=new SubCategory();
		  categories[i].setCategoryId(new Random().nextInt(100000));
		  categories[i].setName("Garments"+i);
		  categories[i].setSubCategoryId(new Random().nextInt(100000));
		  categories[i].setSubCategoryName("MenGarments"+i);
		   
	  }
		
		
		try {
			categoryBl.addSubCategory(categories);
			
		  } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Store the n number of objects
		//retrieve all objects
		addSubCategories();
		try {
			for(SubCategory category : categoryBl.getAllSubCategories())
			{
				System.out.println(category);
				
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	 }

}

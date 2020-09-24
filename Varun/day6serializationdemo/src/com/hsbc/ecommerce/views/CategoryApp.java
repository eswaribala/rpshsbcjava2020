package com.hsbc.ecommerce.views;

import java.io.IOException;
import java.util.Random;

import com.hsbc.ecommerce.bl.CategoryBL;
import com.hsbc.ecommerce.bl.CategoryBLImpl;
import com.hsbc.ecommerce.exceptions.FileCreateException;
import com.hsbc.ecommerce.models.Category;

public class CategoryApp {

	private static CategoryBL categoryBl;
	//capture custom exception
	static
	{
		try {
			categoryBl=new CategoryBLImpl("Category.txt",1);
		} catch (FileCreateException e) {
			
			System.out.println(e.getMessage());
		}
	}
	
	private static void addCategories()
	{
	
		Category[] categories =new Category[100];
		for(int i=0;i<categories.length;i++)
		{
		  categories[i]=new Category();
		  categories[i].setCategoryId(new Random().nextInt(100000));
		  categories[i].setName("Garments"+i);
		 
	  }
		
		
		try {
			categoryBl.addCategory(categories);
			
		  } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Store the n number of objects
		//retrieve all objects
		addCategories();
		try {
			for(Category category : categoryBl.getAllCategories())
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

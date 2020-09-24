package com.hsbc.products.views;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hsbc.products.Exceptions.CategoryCreationException;
import com.hsbc.products.Exceptions.CategoryRetrievalException;
import com.hsbc.products.bl.CategoryBl;
import com.hsbc.products.bl.CategoryBlImpl;
import com.hsbc.products.model.Category;
import com.hsbc.products.model.SubCategory;

/**
 * 
 * @author Sahil Shah
 *
 */
//app retirves and creates user driven input for category and SubCategory
public class ProductsApp {

	//declaring business layer instance to call necessary method
	private static CategoryBl categoryBl;
	private static Scanner sc=new Scanner(System.in);
	static
	{
		try {
			categoryBl=new CategoryBlImpl();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void addCategory()
	{
		//get category detials from user input
		List<Category> categories=new ArrayList<Category>();
		Category category=null;
		for(int i=0;i<3;i++)
		{
			category=new Category();
			System.out.println("enter the categoryId");
			category.setCategoryId(sc.nextInt());
			System.out.println("enter the category Name");
			category.setName(sc.next());
			categories.add(category);
		}
		try {
			System.out.println(categoryBl.addCategory(categories));
		} catch (CategoryCreationException e) {
			e.printStackTrace();
		}
			
	}
	private static void addSubCategory()
	{

		//get Subcategory detials from user input
		List<SubCategory> categories =new ArrayList<SubCategory>();
		SubCategory subCategory=null;
		System.out.println("how many rows");
		int row=sc.nextInt();
		for(int i=0;i<row;i++)
		{
			subCategory.setCategoryId(i);
			subCategory.setItemCode(sc.nextInt());
			subCategory.setName(sc.next());
			categories.add(subCategory);
		}
		try {
			System.out.println(categoryBl.addSubCategory(categories));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static List<Category> getallCategory()
	{
		List<Category> c=null;
		try {
			c =categoryBl.getAllCategories();
		} catch (CategoryRetrievalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}
	public ProductsApp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addCategory();
		addSubCategory();
		getallCategory();
	}

}

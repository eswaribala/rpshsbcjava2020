package com.hsbc.ecommerce.views;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hsbc.ecommerce.bl.ProductsBL;
import com.hsbc.ecommerce.bl.ProductsBLImpl;
import com.hsbc.ecommerce.models.Apparel;

public class ProductsApp {
	private static ProductsBL productsBL;
	
	public static void addApparelProducts() {
		 
		
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the fileName");
		String fileName=sc.nextLine();
		productsBL=new ProductsBLImpl(fileName);
		
	

	}

}

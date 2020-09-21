package com.hsbc.banking.utility;

import java.util.Scanner;

import com.hsbc.banking.models.Product;

public class RetailPriceCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//develop solution using switch case to calculate retail price
	    //prices of three different products
		float[] priceList= {22.50f,9.98f,44.5f};
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter number of products");
		byte productCount=scanner.nextByte();
		scanner.nextLine();
		
		//create array of products
		Product[] products=new Product[productCount];
		
	    
		for(int i=0;i<productCount;i++)
		{
		
		//Read Product Id and Quantity as pair of values
	    System.out.println("Enter Product Id,name and Quantity(id,name['Laptop',"
	    		+ "'Mobile','TV'],qty)");
	    String input=scanner.nextLine();
	    //split the values using delimiter
	    String[] inputArray=input.split(",");
	   
	    products[i]=new Product();
	    products[i].setProductId(Byte.parseByte(inputArray[0]));
	    products[i].setProductName(inputArray[1]);
	    products[i].setQuantity(Byte.parseByte(inputArray[2]));	    
	    
	    //switch by product name
	    
	    switch(products[i].getProductName())
	    {
	    case "Laptop":products[i].setRetailPrice(products[i].getQuantity()*
	    		priceList[products[i].getProductId()-1]);
	    break;
	    
	    case "Mobile":products[i].setRetailPrice(products[i].getQuantity()*
	    		priceList[products[i].getProductId()-1]);
	    break;
	    
	    case "TV":products[i].setRetailPrice(products[i].getQuantity()*
	    		priceList[products[i].getProductId()-1]);
	    break;
	    default:
	    	products[i].setRetailPrice(products[i].getQuantity()*1);
	    
	    }
	    
	    
	   
	    
		}
		
		//print results
		//Enhanced for loop
		for(Product product : products)
		{
			 System.out.println("Product Retail Price.......");
			 System.out.println("Product Id="+product.getProductId());			    
			 System.out.println("Product Quantity="+product.getQuantity());
			 System.out.println("Product Retail Price="+product.getRetailPrice());
		}
		
		
		
		
		
		
		
	}

}

package com.hsbc.banking.utility;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import com.hsbc.banking.interfaces.Greeting;
import com.hsbc.banking.models.Product;

public class Cart implements Greeting {

	@Override
	public String message(String value) {
		// TODO Auto-generated method stub
		return null;
	}

	//default overriding is optional
	/*
	 * @Override public String wishList(String value) { // TODO Auto-generated
	 * method stub return Greeting.super.wishList(value); }
	 */

	private static List<Product> getAllProducts()
	{
		List<Product> productList=new ArrayList<>();
	
		Product product=null;
		for(int i=0;i<100;i++)
		{
			product=new Product();
			product.setName("Product"+i);
			product.setDop(LocalDate.of(2000+new Random().nextInt(19)+1, 
					new Random().nextInt(10)+1, new Random().nextInt(27)+1));
			productList.add(product);
		}
        return productList;		
	}
	
	
	public static void main(String[] args)
	{
	
		//lambda function
		//definition for abstract method
	Greeting greeting=(parameter)->{
             return "Modified"+parameter;			
		};
		
		greeting.message("I am thrilled to learn");
		
		//Runnable lambda;
		//override the run method
		Runnable runnable=()->{
			System.out.println("Executing run method...");
		};
		
		new Thread(runnable).start();
		
		//comparator	
		
		List<Product> productList=getAllProducts();
		Collections.sort(productList,(p1,p2)->{
			
			return p1.getDop().compareTo(p2.getDop());
		});
		
		for(Product product:productList)
		{
			System.out.println(product.getName()+","+product.getDop().toString());
		}
	}
	
}

package com.hsbc.ecommerce.dao;


import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.util.ArrayList;
import java.util.List;

import com.hsbc.ecommerce.models.Products;

public class ProductsDaoImpl  implements ProductsDao{
	private File file;
	private FileInputStream fileInputStream;
	private FileOutputStream  fileOutputStream;
	
	private ObjectOutputStream objectOutputStream;
	private ObjectInputStream objectInputStream;
	
	
	public ProductsDaoImpl(String fileName) throws IOException{
		file=FileHelper.createFile(fileName);
		
	}
	
	@Override
	public boolean addProduct(List<Products>  products) throws IOException  {
		// TODO Auto-generated method stub
	fileOutputStream=new FileOutputStream(file,true);
	objectOutputStream=new ObjectOutputStream(fileOutputStream);
	
		for(Products p:products)
		objectOutputStream.writeObject(p);

	
	
	fileOutputStream.close();
	objectOutputStream.close();
		
		return true;
	}

	@Override
	public List<Products> getAllProducts(String category) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		List<Products> products=new ArrayList<Products>();	
		
		Products product = null;
		fileInputStream=new FileInputStream(file);	
		objectInputStream=new ObjectInputStream(fileInputStream);

			while ((product = (Products) objectInputStream.readObject()) != null) 
				products.add(product);
				
				
	
			objectInputStream.close();
			fileInputStream.close();
		
		
		
		 
		return products;
		
		
	
	}


}

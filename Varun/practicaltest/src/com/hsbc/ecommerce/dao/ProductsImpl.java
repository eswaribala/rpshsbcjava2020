package com.hsbc.ecommerce.dao;

import com.hsbc.ecommerce.models.Apparels;
import com.hsbc.ecommerce.models.Electronics;
import com.hsbc.ecommerce.models.FoodItems;
import com.hsbc.ecommerce.models.Product;

import java.io.*;
import java.util.List;

public class ProductsImpl implements ProductsDao {
	// creating different files for each type
	private File fileApparels;
	private File fileElectronics;
	private File fileFoodItems;

	private FileOutputStream fileOutputStream;
	private FileInputStream fileInputStream;
	private ObjectOutputStream objectOutputStream;
	private ObjectInputStream objectInputStream;

	public ProductsImpl() throws IOException
	{
		fileApparels = FileHelper.createFile("Apparels");
		fileElectronics = FileHelper.createFile("Electronics");
		fileFoodItems = FileHelper.createFile("FoodItems");
	}

	@Override
	public boolean addFoodItems(List<Product> foodItemsList) throws IOException {
		fileOutputStream=new FileOutputStream(fileFoodItems,true);
		objectOutputStream=new ObjectOutputStream(fileOutputStream);
		for(Product foodItem : foodItemsList)
		{
			objectOutputStream.writeObject(foodItem);
		}
		objectOutputStream.close();
		fileOutputStream.close();
		return true;
	}

	@Override
	public boolean addApparels(List<Product> apparelsList) throws IOException {
		fileOutputStream=new FileOutputStream(fileApparels,true);
		objectOutputStream=new ObjectOutputStream(fileOutputStream);
		for(Product apparel : apparelsList)
		{
			objectOutputStream.writeObject(apparel);
		}
		objectOutputStream.close();
		fileOutputStream.close();
		return true;

	}

	@Override
	public boolean addElectronics(List<Product> electronicsList) throws IOException {
		fileOutputStream=new FileOutputStream(fileElectronics,true);
		objectOutputStream=new ObjectOutputStream(fileOutputStream);
		for(Product electronic : electronicsList)
		{
			objectOutputStream.writeObject(electronic);
		}
		objectOutputStream.close();
		fileOutputStream.close();
		return true;
	}

	@Override
	public Product getAllProducts(String itemType) {
		return null;
	}
}

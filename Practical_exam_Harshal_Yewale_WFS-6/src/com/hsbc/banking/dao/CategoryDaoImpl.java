/**
 * @Harshal_Kamlesh_Yewale
 * 
 * Implementation class for all Categories for adding new items and retrieve data
 */
package com.hsbc.banking.dao;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.hsbc.banking.models.Apparel;
import com.hsbc.banking.models.Electronics;
import com.hsbc.banking.models.FoodItems;

public class CategoryDaoImpl implements CategoryDao {
	
	//declaring file handling using objects
	private File file;
	private FileOutputStream fileOutputStream;
	private FileInputStream fileInputStream;
	private ObjectOutputStream objectOutputStream;
	private ObjectInputStream objectInputStream;
	
	//using file helper class selecting directory path and creating new file
	public CategoryDaoImpl(String dirPath, String fileName) throws IOException 
	{
		file=FileHelper.createFile(dirPath, fileName);
		
	}
	
	
	
	//Implemeting methods from interface CategoryDao
	@Override
	public boolean addNewApparelItem(List<Apparel> apparel) throws IOException {
		// TODO Auto-generated method stub
		
		fileOutputStream=new FileOutputStream(file,true);
		objectOutputStream=new ObjectOutputStream(fileOutputStream);
		for(Apparel a : apparel)
		{
			objectOutputStream.writeObject(a);
		}
		objectOutputStream.close();
		fileOutputStream.close();
		
		
		return true;
	}

	@Override
	public List<Apparel> retrieveApparelItems() throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		fileInputStream=new FileInputStream(file);
		objectInputStream=new ObjectInputStream(fileInputStream);
		List<Apparel> apparelList=new ArrayList<Apparel>();
		Apparel apparel=null;		
		try
		{
			
			while((apparel=(Apparel) objectInputStream.readObject())!=null)
			 	apparelList.add(apparel);			
					
		}
		catch(EOFException exception)
		{
			
		}
		finally
		{
		objectInputStream.close();
		fileInputStream.close();
		}
		
		return apparelList;
	}
		
	

	@Override
	public boolean addNewElectronicsItem(List<Electronics> electronics) throws IOException {
		// TODO Auto-generated method stub
		fileOutputStream=new FileOutputStream(file,true);
		objectOutputStream=new ObjectOutputStream(fileOutputStream);
		for(Electronics e : electronics)
		{
			objectOutputStream.writeObject(e);
		}
		objectOutputStream.close();
		fileOutputStream.close();
		
		
		return true;
	}

	@Override
	public List<Electronics> retrieveElectronicsItems() throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		fileInputStream=new FileInputStream(file);
		objectInputStream=new ObjectInputStream(fileInputStream);
		List<Electronics> electronicsList=new ArrayList<Electronics>();
		Electronics electronics=null;		
		try
		{
			
			while((electronics=(Electronics) objectInputStream.readObject())!=null)
			 	electronicsList.add(electronics);			
					
		}
		catch(EOFException exception)
		{
			
		}
		finally
		{
		objectInputStream.close();
		fileInputStream.close();
		}
		
		return electronicsList;
	}

	@Override
	public boolean addNewFoodItem(List<FoodItems> foodItems) throws IOException {
		// TODO Auto-generated method stub
		fileOutputStream=new FileOutputStream(file,true);
		objectOutputStream=new ObjectOutputStream(fileOutputStream);
		for(FoodItems f : foodItems)
		{
			objectOutputStream.writeObject(f);
		}
		objectOutputStream.close();
		fileOutputStream.close();
		
		
		return true;
	}

	@Override
	public List<FoodItems> retrieveFoodItems() throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		fileInputStream=new FileInputStream(file);
		objectInputStream=new ObjectInputStream(fileInputStream);
		List<FoodItems> foodItemList=new ArrayList<FoodItems>();
		FoodItems foodItems=null;		
		try
		{
			
			while((foodItems=(FoodItems) objectInputStream.readObject())!=null)
				foodItemList.add(foodItems);			
					
		}
		catch(EOFException exception)
		{
			
		}
		finally
		{
		objectInputStream.close();
		fileInputStream.close();
		}
		
		return foodItemList;

	}

}

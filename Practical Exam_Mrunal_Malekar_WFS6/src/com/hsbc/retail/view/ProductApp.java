package com.hsbc.retail.view;

import java.awt.Window.Type;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


import com.hsbc.retail.bl.ApparelBL;
import com.hsbc.retail.bl.ApparelBLImpl;
import com.hsbc.retail.bl.ApparelSorter;
import com.hsbc.retail.exceptions.ApparelException;
import com.hsbc.retail.exceptions.ApparelRetreivalException;
import com.hsbc.retail.exceptions.FileCreationException;
import com.hsbc.retail.models.Apparel;
import com.hsbc.retail.models.material;

public class ProductApp {
	private static ApparelBL b1;
	static
	{
	
			try {
				b1=new ApparelBLImpl();
			} catch (FileCreationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
}
	
	
	
	private static void addApparels()     ///Addition of apparels
	{
		ArrayList<Apparel> apparelList=new ArrayList<Apparel>();
		apparelList.ensureCapacity(3);
		Apparel v1=null;
		Scanner s=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
		    v1=new Apparel();
			System.out.println("Enter item code");
			v1.setItemCode(s.nextInt());
			s.nextLine();
			System.out.println("Enter name");
			v1.setItemName(s.nextLine());
			System.out.println("Enter quantity sold");
			v1.setQuantity(s.nextInt());
			s.nextLine();
			System.out.println("Enter size");
			v1.setSize(s.nextLine());
			//s.nextLine();
			System.out.println("Enter material");
			//p.setGender(GENDER.valueOf(gender));
			v1.setMaterialtype(material.valueOf(s.nextLine()));
			apparelList.add(v1);
			
		}
		System.out.println(apparelList.size());
		
		
			try {
				System.out.println(b1.addApparel(apparelList));
			} catch (ApparelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		
		
	}
	
	private static void getAllApparels()
	{ ////retreival of apparels
		
		
		  List<Apparel> apparelList=new ArrayList<Apparel>(); 
				
					
						try {
							for(Apparel a:b1.getAllApparels())
							{
								System.out.println(a);
								System.out.println(a.getItemCode());
								System.out.println(a.getItemName());
								System.out.println(a.getQuantity());
								System.out.println(a.getSize());
								System.out.println(a.getUnitPrice());
								System.out.println(a.getMaterialtype());
							}
						} catch (ApparelRetreivalException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					 
				
			 
		
		
						System.out.println("after sorting quantity");
						  //List<Apparel> apparelList=new ArrayList<Apparel>(); //sorting
						 
							try {
								apparelList=b1.getAllApparels();
							} catch (ApparelRetreivalException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						
							
					///////sorting	in ascending order///
							
						  Collections.sort(apparelList,new ApparelSorter());
						  for(Apparel a:apparelList)
						  {
							  
							  System.out.println("Quantity"+a.getQuantity());
							  System.out.println("Name"+a.getItemName());
								//System.out.println(a.getQuantity());
								System.out.println("Size"+a.getSize());
								System.out.println("Price"+a.getUnitPrice());
								System.out.println("material"+a.getMaterialtype());
						  }
						 
		 
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//addApparels();
		getAllApparels(); //to get apparels
	
	}
}

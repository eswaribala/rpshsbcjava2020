package com.hsbc.insurance.utility;

import java.time.LocalDate;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import com.hsbc.insurance.models.Claim;
import com.hsbc.insurance.models.Fuel;
import com.hsbc.insurance.models.Vehicle;

public class ClaimApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer,Claim> claimData=new Hashtable<Integer,Claim>();
		for(int i=0;i<100;i++)
		{
			claimData.put(new Random().nextInt(100000), 
					new Claim(new Random().nextInt(100000),
							new Vehicle("TN-02"+new Random().nextInt(10000),
									"Hyundai",
									LocalDate.of(2000+new Random().nextInt(19)+1, 
											new Random().nextInt(10)+1, 
											new Random().nextInt(27)+1),
									"AH"+new Random().nextInt(100000),	
									"HY"+new Random().nextInt(100000),
									Fuel.PETROL,"Blue"),1000+new Random().nextInt(200000),
							LocalDate.now()));
		}
		
		
		//Read key and value
		Set<Map.Entry<Integer,Claim>> set= claimData.entrySet();
		Iterator<Map.Entry<Integer,Claim>> itr=set.iterator();
		while(itr.hasNext())
		{
		  Map.Entry<Integer,Claim> record=itr.next();
		  System.out.print(record.getKey()+",");
		  System.out.println(record.getValue());		  
		  
		}
		
		
		//read the claim data
		for(int key:claimData.keySet())
			System.out.print(key+",");
				
		System.out.println("\n");
		//read all the values
		for(Claim claim:claimData.values())
			System.out.println(claim);
		
		
	}

}

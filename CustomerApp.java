package com.hsbc.banking.utility;

import com.hsbc.banking.models.Customer;
import com.hsbc.banking.models.GoldCustomer;
import com.hsbc.banking.models.PlatinumCustomer;
import com.hsbc.banking.models.SilverCustomer;

public class CustomerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SilverCustomer silverCustomer=new SilverCustomer(345695,"Ajith");
		silverCustomer.setWithdrawLimit(50000);  
		silverCustomer.setMobileNo(35926926L);
	    System.out.println(silverCustomer);
		
		
		GoldCustomer goldCustomer=new GoldCustomer(345694,"Param");
		goldCustomer.setSeasonalOffer(2);	   
	    goldCustomer.setMobileNo(35926925L);
	    System.out.println(goldCustomer);
		
		PlatinumCustomer platinumCustomer=new PlatinumCustomer(345698,"Bala");
		platinumCustomer.setNoServiceCharge(false);  
		platinumCustomer.setMobileNo(35926925L);
	    System.out.println(platinumCustomer);
	    
	    //compiletime polymorphism
	    //runtime polymorphism
		
	} 

}

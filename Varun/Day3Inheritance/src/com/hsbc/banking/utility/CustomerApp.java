package com.hsbc.banking.utility;

import com.hsbc.banking.models.GoldCustomer;
import com.hsbc.banking.models.PlatinumCustomer;
import com.hsbc.banking.models.SilverCustomer;

public class CustomerApp {
	public static void main(String[] args) {
		GoldCustomer goldCustomer = new GoldCustomer(542135, "Varun");
		goldCustomer.setSeasonalOffer(2);
//		goldCustomer.setCustomerId(542135);
		goldCustomer.setMobileNo(9371006227L);
//		goldCustomer.setName("Varun");
		System.out.println(goldCustomer);
		
		SilverCustomer silverCustomer = new SilverCustomer(416546, "Alpha");
		silverCustomer.setWithdrawalLimit(1000);
//		goldCustomer.setCustomerId(542135);
		silverCustomer.setMobileNo(9371006227L);
//		goldCustomer.setName("Varun");
		System.out.println(silverCustomer);

		PlatinumCustomer platinumCustomer = new PlatinumCustomer(416656, "Beta");
		platinumCustomer.setServiceCharges(3);
//		goldCustomer.setCustomerId(542135);
		platinumCustomer.setMobileNo(9371006227L);
//		goldCustomer.setName("Varun");
		System.out.println(platinumCustomer);
	}
}

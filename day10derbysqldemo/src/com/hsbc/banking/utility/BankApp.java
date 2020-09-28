package com.hsbc.banking.utility;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.hsbc.banking.bl.BankBL;
import com.hsbc.banking.bl.BankBLImpl;
import com.hsbc.banking.exceptions.DBConnCreationException;
import com.hsbc.banking.models.Bank;


public class BankApp {

	private static BankBL bankBL;
	static
	{
		bankBL=new BankBLImpl();
	}
	
	private static void addBanks()
	{		
		List<Bank> bankList=new ArrayList<Bank>();
		Bank bank=null;
		for(int i=0;i<100;i++)
		{
			bank=new Bank();
			bank.setBankId(i);
			bank.setBankName("bank"+new Random().nextInt(1000));
			bank.setCountryName("Country"+new Random().nextInt(1000));			
			bankList.add(bank);			
		}
		
		try {
			bankBL.addBanks(bankList);
		} catch (DBConnCreationException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
	
	private static void getAllBanks()
	{
		try {
			for(Bank bank :bankBL.getAllBanks())
			{				
				System.out.println(bank.getBankName());
			}
		} catch (DBConnCreationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void updateBank()
	{
		Bank bank=new Bank();
		bank.setBankId(21);
		bank.setBankName("bank"+new Random().nextInt(1000));
		bank.setCountryName("Country"+new Random().nextInt(1000));	
		try {
			System.out.println(bankBL.updateBank(bank));
		} catch (DBConnCreationException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
	
	private static void deleteBank()
	{
		
		try {
			System.out.println(bankBL.deleteBankById(20));
		} catch (DBConnCreationException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
	
	private static void getBankById()
	{
		Bank bank=null;
		try {
			bank=bankBL.getBankById(21);
			System.out.println(bank.getBankName());
		} catch (DBConnCreationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//addBanks();
		//getAllBanks();
		//deleteBank();
		//getBankById();
		updateBank();
	}

}

package com.hsbc.insurance.views;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.hsbc.insurance.bl.PolicyHolderBL;
import com.hsbc.insurance.bl.PolicyHolderBLImpl;
import com.hsbc.insurance.models.Address;
import com.hsbc.insurance.models.Gender;
import com.hsbc.insurance.models.PolicyHolder;

public class PolicyHolderApp {
   private static Scanner scanner = new Scanner(System.in);
   private static PolicyHolderBL policyHolderBL;
   
   public PolicyHolderApp()
   {
	   //runtime polymorphism
	   policyHolderBL=new PolicyHolderBLImpl();
   }
   
	private static void menu()
	{
		 
		System.out.println("Policy Holder Admin Menu");
		System.out.println("-----------------------------------------");
		System.out.println("1.Add Policy Holder");
		System.out.println("2.Update Policy Holder");
		System.out.println("3.Delete Policy Holder");
		System.out.println("4.Read All Policy Holder Information");
		System.out.println("5.Show Policy Holder By Id");
		System.out.println("6.Show Sorted Policy Holders Information");
		System.out.println("99.Exit");		
	}
	
	public static void choiceImpl(int option)
	{
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		switch(option)
		{
		case 1:
			System.out.println("Add Policy Holder...");
			PolicyHolder policyHolder=new PolicyHolder();
			System.out.println("Enter Policy Name of Insured");
			policyHolder.setNameOfInsured(scanner.nextLine());
			System.out.println("Enter Policy DOB(02-12-1988)");
			String dob=scanner.nextLine();			
			policyHolder.setDob(LocalDate.parse(dob, formatter));
			System.out.println("Enter Policy From Date(02-12-2020)");
			String fromDate=scanner.nextLine();			
			policyHolder.setFromDate(LocalDate.parse(fromDate, formatter));
			System.out.println("Enter Policy To Date(02-12-2025)");
			String toDate=scanner.nextLine();			
			policyHolder.setToDate(LocalDate.parse(toDate, formatter));
			System.out.println("Enter Phone No(10 digits)");
			policyHolder.setPhoneNo(scanner.nextLong());
			scanner.nextLine();
			System.out.println("Enter Email");
			policyHolder.setEmail(scanner.nextLine());
			System.out.println("Enter Gender (MALE,FEMALE,TRANSGENDER)");
			String gender=scanner.nextLine();	
			policyHolder.setGender(Gender.valueOf(gender));			
			//Address
			//set address size
			Address[] addressList=new Address[2];
			for(int i=0;i<2;i++)
			{
				//create address object
				addressList[i]=new Address();
				System.out.println("Enter House No");
				addressList[i].setHouseNo(scanner.nextLine());
				System.out.println("Enter Street Name");
				addressList[i].setStreetName(scanner.nextLine());
				System.out.println("Enter City");
				addressList[i].setCity(scanner.nextLine());
				System.out.println("Enter State");
				addressList[i].setState(scanner.nextLine());
				System.out.println("Enter Pincode");
				addressList[i].setPincode(scanner.nextLong());
				scanner.nextLine();
				
			}
			
			policyHolder.setAddressList(addressList);
			
			if( policyHolderBL.addPolicyHolder(policyHolder))
				System.out.println("Record Added.....");
			else
				System.out.println("Error in input..., Record not added");
			
			
			
			
			break;
		case 2:
			System.out.println("Update Policy Holder...");
			break;
		case 3:
			System.out.println("Delete Policy Holder...");
			break;
		case 4:
			System.out.println("Get all Policy Holders...");
			break;
		case 5:
			System.out.println("Get Policy Holder By Id...");
			break;
		case 6:
			System.out.println("Sorted List of Policy Holders...");
			break;
		
		}
		
	}
	
	
	
	public static void cls() 
	  {
	        try {
				new ProcessBuilder("cmd", "", "cls").inheritIO().start().waitFor();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice=0;		
		
		do
		{
			
          menu();               
          System.out.println("Do you want to continue(1..98)");
          choice=scanner.nextInt();
          scanner.nextLine();
          choiceImpl(choice);
		}
		while(choice!=99);
		
		scanner.close();
	}

}

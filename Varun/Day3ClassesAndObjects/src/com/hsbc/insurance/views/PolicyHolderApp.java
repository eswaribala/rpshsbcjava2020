package com.hsbc.insurance.views;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.hsbc.insurance.bl.PolicyHolderBL;
import com.hsbc.insurance.bl.PolicyHolderBLImpl;
import com.hsbc.insurance.models.Address;
import com.hsbc.insurance.models.Gender;
import com.hsbc.insurance.models.PolicyHolder;

public class PolicyHolderApp {

	private static boolean continueFlag = true;

	static Scanner scanner = new Scanner(System.in);
	private static PolicyHolderBL policyHolderBL;
	   
	public PolicyHolderApp()
	{
		//runtime polymorphism
		policyHolderBL=new PolicyHolderBLImpl();
	}
	
	// calling this method shows the menu 
	private static void menu() {
		System.out.println("---Policy holder admin menu---");
		System.out.println("1. Add policy holder");
		System.out.println("2. Update policy holder");
		System.out.println("3. Delete policy holder");
		System.out.println("4. Read all policy holder information");
		System.out.println("5. Show policy holder by I.D.");
		System.out.println("6. Show sorted policy holders information");
		System.out.println("99. Exit menu");
	}
	public static void selectOption(byte choice) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		switch(choice) {
			case 1:
				System.out.println("Add Policy Holder...");
				PolicyHolder policyHolder=new PolicyHolder();
				System.out.println("Enter Policy Name of Insured");
				policyHolder.setNameOfInsured(scanner.nextLine());
				System.out.println("Enter Policy DOB(02-12-1988)");
				String dob=scanner.nextLine();			
				policyHolder.setDateOfBirth(LocalDate.parse(dob, formatter));
				System.out.println("Enter Policy From Date(02-12-2020)");
				String fromDate=scanner.nextLine();			
				policyHolder.setFromDate(LocalDate.parse(fromDate, formatter));
				System.out.println("Enter Policy To Date(02-12-2025)");
				String toDate=scanner.nextLine();			
				policyHolder.setToDate(LocalDate.parse(toDate, formatter));
				System.out.println("Enter Phone No(10 digits)");
				policyHolder.setPhoneNum(scanner.nextLong());
				scanner.nextLine();
				System.out.println("Enter Email");
				policyHolder.setEmailAddr(scanner.nextLine());
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
					addressList[i].setHouseNum(scanner.nextLine());
					System.out.println("Enter Street Name");
					addressList[i].setStreetName(scanner.nextLine());
					System.out.println("Enter City");
					addressList[i].setCity(scanner.nextLine());
					System.out.println("Enter State");
					addressList[i].setState(scanner.nextLine());
					System.out.println("Enter Pincode");
					addressList[i].setPincode(scanner.nextInt());
					scanner.nextLine();
					
				}
				
				policyHolder.setAddress(addressList);
				
				policyHolderBL.addPolicyHolder(policyHolder);
				break;
			case 2:
				System.out.println("Update policy holder");
				break;
			case 3:
				System.out.println("Delete policy holder");
				break;
			case 4:
				System.out.println("Read all policy holder information");
				for(PolicyHolder policyHolderObj:policyHolderBL.getAllPolicyHolders()) {
					System.out.println(policyHolderObj);
				}
				break;
			case 5:
				System.out.println("Show policy holder by I.D.");
				int policyNo = scanner.nextInt();
				scanner.nextLine();
				System.out.println(policyHolderBL.getPol);
				break;
			case 6:
				System.out.println("Show sorted policy holders information");
				break;
			case 99:
				continueFlag = false;
				break;
		}
	}
	public static void main(String[] args){
		byte choice = 0;
		do{
			//cls();
			//Runtime.getRuntime().exec("clear");
			menu();
			choice = scanner.nextByte();
			scanner.nextLine();
			selectOption(choice); 
		}while(continueFlag);
		System.out.println("Thank you for using the application!");
		scanner.close();
	}
}

package com.hsbc.banking.utility;

import java.time.LocalDate;
import java.util.Scanner;

import com.hsbc.banking.models.Customer;

class CustomerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("HSBC Freshers!!!!");
		
		//Create Read environment
		Scanner scanner=new Scanner(System.in);		
				
		//create Customer Object
		Customer customer=new Customer();
		
        //assign values to customer
		System.out.println("Enter Customer Id.....");
		customer.setCustomerId(scanner.nextLong());
		//After reading number add newline
        scanner.nextLine(); 		
        System.out.println("Enter First Name.....");
        customer.setFirstName(scanner.nextLine());
        System.out.println("Enter Last Name.....");
        customer.setLastName(scanner.nextLine());
        System.out.println("Enter Mobile No.....");
        customer.setMobileNo(scanner.nextLong());
        //System.out.println("Enter DOB....");
        customer.setDob(LocalDate.of(1970, 12, 2));
        
        //Read the data
        
        System.out.println("Customer Details.....");
        System.out.println("Customer ID="+customer.getCustomerId());
        System.out.println("First Name="+customer.getFirstName());
        System.out.println("Last Name="+customer.getLastName());
        System.out.println("Mobile No="+customer.getMobileNo());
        System.out.println("DOB="+customer.getDob().toString());
        
		
		//delinking the object
		
		
		
	}

}

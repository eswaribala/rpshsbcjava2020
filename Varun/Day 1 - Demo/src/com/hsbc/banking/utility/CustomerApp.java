package com.hsbc.banking.utility;

import java.time.LocalDate;
import java.util.Scanner;

import com.hsbc.banking.models.Customer;

public class CustomerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HSBC Freshers");
		
		// create read environment
		Scanner scanner = new Scanner(System.in);
		
		// create Customer object
		Customer customer = new Customer();
		
		//assign values
		
		System.out.println("Enter Customer ID:-");
		customer.setCustomerId(scanner.nextLong());
		// after reading number add new line
		scanner.nextLine();
		
		System.out.println("Enter First Name:-");
		customer.setFirstName(scanner.nextLine());
		System.out.println("Enter Last Name:-");
		customer.setLastName(scanner.nextLine());
		System.out.println("Enter Mobile No.:-");
		customer.setMobileNo(scanner.nextLong());
		customer.setDob(LocalDate.of(1998,12,30));
		
		// after reading number add new line
		// scanner.nextLine();
		
		// read the data
		System.out.println("Customer Details:-");
		System.out.println("Customer ID:"+customer.getCustomerId());
		System.out.println("Customer ID:"+customer.getFirstName());
		System.out.println("Customer ID:"+customer.getLastName());
		System.out.println("Customer ID:"+customer.getDob());
		System.out.println("Customer ID:"+customer.getMobileNo());
	}

}

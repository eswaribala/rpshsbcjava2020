package com.hsbc.banking.utility;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.hsbc.banking.bl.CustomerBL;
import com.hsbc.banking.bl.CustomerBLImpl;
import com.hsbc.banking.exceptions.DOBException;
import com.hsbc.banking.models.Customer;

public class FileWriterDemo {

	private static CustomerBL customerBL;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner =new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		Customer customer=new Customer();
        System.out.println("Enter Directory Path");
		String dirPath=scanner.nextLine();
		System.out.println("Enter File Name");
		String fileName=scanner.nextLine();		
		try {
			customerBL=new CustomerBLImpl(dirPath,fileName);
			System.out.println("Enter Name");
			customer.setName(scanner.nextLine());
			System.out.println("Enter DOB(02-12-1980)");
			String dob=scanner.nextLine();			
			customer.setDob(LocalDate.parse(dob, formatter));
			customerBL.addCustomer(customer);			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DOBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			scanner.close();
		}
		
	}

}

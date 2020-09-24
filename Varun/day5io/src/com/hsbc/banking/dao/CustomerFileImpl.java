package com.hsbc.banking.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.hsbc.banking.exceptions.DOBException;
import com.hsbc.banking.models.Customer;

public class CustomerFileImpl implements CustomerDao{

	private File file;
	private FileWriter fileWriter;
	private BufferedWriter bufferedWriter;
	private LineNumberReader lineNumberReader;
	private FileReader fileReader;
	public CustomerFileImpl(String dirPath, String fileName) throws IOException
	{
		file=FileHelper.createFile(dirPath, fileName);
		fileWriter=new FileWriter(file,true);//append mode
		fileReader=new FileReader(file);
	}
	
	
	@Override
	public boolean addCustomer(Customer customer) throws DOBException, IOException {
		// TODO Auto-generated method stub
		boolean status=true;
		
		if(customer.getDob().isAfter(LocalDate.now()))
		{
		    status=false;
			throw new DOBException("DOB cannot be greater than today...");
		
		}
		else
		{
			bufferedWriter=new BufferedWriter(fileWriter);
			bufferedWriter.append(String.valueOf(customer.getCustomerId()));
			bufferedWriter.append(",");
			bufferedWriter.append(customer.getName());
			bufferedWriter.append(",");
			bufferedWriter.append(customer.getDob().toString());
			bufferedWriter.newLine();
			bufferedWriter.close();
			
			status=true;
		}
		
		
		
		return status;
	}


	
	@Override
	public int getNoOfRows() throws IOException {
		// TODO Auto-generated method stub
		int count=0;
		String line=null;
		lineNumberReader=new LineNumberReader(fileReader);
		while((line=lineNumberReader.readLine())!=null)
				{
			        count++;
				}
		lineNumberReader.close();
		return count;
	}


	@Override
	public Customer[] getAllCustomers() throws IOException {
		// TODO Auto-generated method stub
		Customer[] customerList=new Customer[getNoOfRows()];
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		Customer customer;
		String line=null;
		String[] customerData;
		lineNumberReader=new LineNumberReader(fileReader);
		int pos=0;
		while((line=lineNumberReader.readLine())!=null)
				{
			        customer=new Customer();
			        customerData=line.split(",");
			        customer.setCustomerId(Long.parseLong(customerData[0]));
			        customer.setName(customerData[1]);
			        customer.setDob(LocalDate.parse(customerData[2], formatter));
			        customerList[pos]=customer;
			        pos++;
				}
		lineNumberReader.close();
		
		return customerList;
	}

}

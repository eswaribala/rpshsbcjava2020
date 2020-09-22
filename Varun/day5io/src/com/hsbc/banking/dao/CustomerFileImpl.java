package com.hsbc.banking.dao;

import java.io.*;
import java.time.LocalDate;

import com.hsbc.banking.exceptions.DOBException;
import com.hsbc.banking.models.Customer;

public class CustomerFileImpl implements CustomerDao{

	private File file;
	private FileWriter fileWriter;
	private BufferedWriter bufferedWriter;
	private LineNumberReader lineNumberReader;
	private FileReader fileReader;
	private BufferedReader bufferedReader;

	public CustomerFileImpl(String dirPath, String fileName) throws IOException
	{
		file=FileHelper.createFile(dirPath, fileName);
		fileWriter = new FileWriter(file , true); // append mode
		fileReader = new FileReader(file);
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
			bufferedWriter.write(String.valueOf(getNumberOfRows() + 1));
			bufferedWriter.append(",");
			bufferedWriter.write(customer.getName());
			bufferedWriter.append(",");
			bufferedWriter.write(customer.getDob().toString());
			bufferedWriter.newLine();
			bufferedWriter.close();
			
			status=true;
		}

		return status;
	}

	@Override
	public int getNumberOfRows() throws IOException {
		lineNumberReader = new LineNumberReader(fileReader);
		int count = 0;
		String line;
		while ((line = lineNumberReader.readLine())!=null){
			count++;
		}
		lineNumberReader.close();
		return count;
	}

	@Override
	public void displayAllCustomers() throws IOException {
		bufferedReader = new BufferedReader(fileReader);
		String line = "";
		while ((line = bufferedReader.readLine()) != null) {
			// use comma as separator
			String[] customerData = line.split(",");
			System.out.println("Customer [CustomerID= " + customerData[0] + " , CustomerName=" + customerData[1] + ", CustomerDOB=" + customerData[2] + "]");
		}
	}
}

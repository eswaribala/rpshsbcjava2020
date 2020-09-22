package com.hsbc.banking.bl;

import java.io.IOException;

import com.hsbc.banking.dao.CustomerDao;
import com.hsbc.banking.dao.CustomerFileImpl;
import com.hsbc.banking.exceptions.DOBException;
import com.hsbc.banking.models.Customer;

public class CustomerBLImpl implements CustomerBL{

	private static long customerId;
	private CustomerDao customerDao;
	public CustomerBLImpl(String dirPath, String fileName) throws IOException
	{
		customerDao=new CustomerFileImpl(dirPath,fileName);
	}
	
	@Override
	public boolean addCustomer(Customer customer) throws DOBException, IOException {
		// TODO Auto-generated method stub

		customer.setCustomerId(customerId);		
		return customerDao.addCustomer(customer);
		
	}

	@Override
	public int getNumberOfRows() throws IOException {
		return customerDao.getNumberOfRows();
	}

	@Override
	public void displayAllCustomers() throws IOException {
		customerDao.displayAllCustomers();
	}

}

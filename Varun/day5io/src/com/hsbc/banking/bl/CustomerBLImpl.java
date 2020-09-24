package com.hsbc.banking.bl;

import java.io.IOException;

import com.hsbc.banking.dao.CustomerDao;
import com.hsbc.banking.dao.CustomerFileImpl;
import com.hsbc.banking.exceptions.DOBException;
import com.hsbc.banking.models.Customer;

public class CustomerBLImpl implements CustomerBL{

	
	private CustomerDao customerDao;

	public CustomerBLImpl(String dirPath, String fileName) throws IOException
	{
		customerDao=new CustomerFileImpl(dirPath,fileName);
		
	}
	
	@Override
	public boolean addCustomer(Customer customer) throws DOBException, IOException {
		// TODO Auto-generated method stub
		
		customer.setCustomerId(getNoOfRows()+1);		
		return customerDao.addCustomer(customer);
		
	}

	@Override
	public int getNoOfRows() throws IOException {
		// TODO Auto-generated method stub
		return customerDao.getNoOfRows();
	}

	@Override
	public Customer[] getAllCustomers() throws IOException {
		// TODO Auto-generated method stub
		return customerDao.getAllCustomers();
	}

}

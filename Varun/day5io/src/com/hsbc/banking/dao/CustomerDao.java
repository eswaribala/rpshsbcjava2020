package com.hsbc.banking.dao;

import java.io.IOException;

import com.hsbc.banking.exceptions.DOBException;
import com.hsbc.banking.models.Customer;

public interface CustomerDao {

	boolean addCustomer(Customer customer) throws DOBException, IOException;
	int getNoOfRows() throws IOException;
	Customer[] getAllCustomers() throws IOException;
	
}

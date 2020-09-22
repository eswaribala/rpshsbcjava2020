package com.hsbc.banking.bl;

import java.io.IOException;

import com.hsbc.banking.exceptions.DOBException;
import com.hsbc.banking.models.Customer;

public interface CustomerBL {
	boolean addCustomer(Customer customer) throws DOBException, IOException;
	int getNumberOfRows() throws IOException;
	void displayAllCustomers() throws IOException;
}

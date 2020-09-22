package com.hsbc.banking.models;

import java.time.LocalDate;

/**
 * @author Varun Gujarathi
 * @version 1.0
 */
/*
 * Created model class Customer, with CustomerId, FirstName, Lastname, DOB, MobileNo.
 */

public class Customer {
	private long customerId;
	private String firstName;
	private String lastName;
	private LocalDate dob;
	private long mobileNo;
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
}	

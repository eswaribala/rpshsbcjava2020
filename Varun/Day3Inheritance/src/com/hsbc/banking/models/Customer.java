package com.hsbc.banking.models;

public class Customer {
	protected int customerId;
	protected String name;
	protected long mobileNo;
	public Customer(int id, String name) {
		// TODO Auto-generated constructor stub
		this.customerId = id;
		this.name = name;
	}
//	// getters and setters
//	public int getCustomerId() {
//		return customerId;
//	}
//	public void setCustomerId(int customerId) {
//		this.customerId = customerId;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	
}

package com.hsbc.banking.models;

public class Customer {

	protected int customerId;
	protected String name;
	protected long mobileNo;
	public Customer(int id,String name)
	{
		this.customerId=id;
		this.name=name;
	}
	
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", mobileNo=" + mobileNo + "]";
	}
	
	
}

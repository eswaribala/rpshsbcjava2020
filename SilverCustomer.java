package com.hsbc.banking.models;

public class SilverCustomer extends Customer{

	public SilverCustomer(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	private int withdrawLimit;

	public int getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(int withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	@Override
	public String toString() {
		return "SilverCustomer [withdrawLimit=" + withdrawLimit + ", toString()=" + super.toString() + "]";
	}
	
	
	
}

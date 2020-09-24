package com.hsbc.banking.models;

public class SilverCustomer extends Customer{
	
	public SilverCustomer(int id, String name) {
		super (id, name);
	}

	protected int withdrawalLimit;

	public int getWithdrawalLimit() {
		return withdrawalLimit;
	}

	public void setWithdrawalLimit(int withdrawalLimit) {
		this.withdrawalLimit = withdrawalLimit;
	}
	
	@Override
	public String toString() {
		return "Customer ID = " + this.customerId + " Withdrawal Limit = " + this.withdrawalLimit;
	}
}

package com.hsbc.banking.models;

public class PlatinumCustomer extends Customer {

	public PlatinumCustomer(int id, String name) {
		super (id, name);
	}
	protected int serviceCharges;
	
	public int getServiceCharges() {
		return serviceCharges;
	}

	public void setServiceCharges(int serviceCharges) {
		this.serviceCharges = serviceCharges;
	}

	@Override
	public String toString() {
		return "Customer ID = " + this.customerId + " Service Charges = " + this.serviceCharges;
	}

}

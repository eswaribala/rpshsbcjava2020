package com.hsbc.banking.models;

public class PlatinumCustomer extends Customer{
	
	public PlatinumCustomer(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	private boolean noServiceCharge;

	public boolean isNoServiceCharge() {
		return noServiceCharge;
	}

	public void setNoServiceCharge(boolean noServiceCharge) {
		this.noServiceCharge = noServiceCharge;
	}

	@Override
	public String toString() {
		return "PlatinumCustomer [noServiceCharge=" + noServiceCharge + ", toString()=" + super.toString() + "]";
	}
	

}

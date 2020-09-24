package com.hsbc.banking.models;

// gold customer is customer

public class GoldCustomer extends Customer {
	
	public GoldCustomer(int id, String name) {
		super (id, name);
	}

	// specific property -  seasonal offers
	private int seasonalOffer;
	
	
	public int getSeasonalOffer() {
		return seasonalOffer;
	}


	public void setSeasonalOffer(int seasonalOffer) {
		this.seasonalOffer = seasonalOffer;
	}


	@Override
	public String toString() {
		return "Customer ID = " + this.customerId + " Seasonal Offer = " + this.seasonalOffer;
	}
	
}

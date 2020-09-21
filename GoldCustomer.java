package com.hsbc.banking.models;
//Gold Customer is a customer
public class GoldCustomer extends Customer{

	public GoldCustomer(int id, String name) {
		
		super(id, name);
		System.out.println("Gold Customer Constructor.....");
		// TODO Auto-generated constructor stub
	}


	//specific property
	private int seasonalOffer;
	
	
	public int getSeasonalOffer() {
		return seasonalOffer;
	}



	public void setSeasonalOffer(int seasonalOffer) {
		this.seasonalOffer = seasonalOffer;
	}


	@Override
	public String toString() {
		return super.toString()+
	    "Seasonal Offer="+this.seasonalOffer;
	}

	
	
	

}

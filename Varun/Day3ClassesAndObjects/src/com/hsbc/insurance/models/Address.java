package com.hsbc.insurance.models;

// address is composite data type for communication
public class Address {
	// house number (considered alpha numeric) of policy holder
	private String houseNum;
	// street name of policy holder
	private String streetName;
	// city of policy holder 
	private String city;
	// state of policy holder
	private String state;
	// in India it is only in number
	private int pincode;
	
	// getters and setters
	public String getHouseNum() {
		return houseNum;
	}
	public void setHouseNum(String houseNum) {
		this.houseNum = houseNum;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
}

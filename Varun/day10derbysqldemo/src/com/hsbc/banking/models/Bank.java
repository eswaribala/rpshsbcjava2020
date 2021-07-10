package com.hsbc.banking.models;
/**
 * 
 * @author Balasubramaniam
 * @version 1.0
 * @since 28/09/2020
 *
 */

public class Bank {
	private int bankId;
	private String bankName;
	private String countryName;
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	

}

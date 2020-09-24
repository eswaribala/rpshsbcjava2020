package com.hsbc.ecommerce.models;

import java.io.Serializable;
import java.time.LocalDate;

public class FoodItems extends Products implements Serializable{
	/**
	 * 
	 */
	
	LocalDate dateOfManufacture;
	LocalDate dateOfExpiry;
	boolean isVegetarian;
	
	public LocalDate getDateOfManufacture() {
		return dateOfManufacture;
	}
	public void setDateOfManufacture(LocalDate dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}
	public LocalDate getDateOfExpiry() {
		return dateOfExpiry;
	}
	public void setDateOfExpiry(LocalDate dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}
	public boolean isVegetarian() {
		return isVegetarian;
	}
	public void setVegetarian(boolean isVegetarian) {
		this.isVegetarian = isVegetarian;
	}
	public byte getQuantity() {
		return quantity;
	}
	public void setQuantity(byte quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "FoodItems [dateOfManufacture=" + dateOfManufacture + ", dateOfExpiry=" + dateOfExpiry
				+ ", isVegetarian=" + isVegetarian + ", quantity=" + quantity + "]";
	}
	

}

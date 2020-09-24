/**
 * @Harshal_Kamlesh_Yewale
 * 
 * Food Items Attributes
 */
package com.hsbc.banking.models;

import java.io.Serializable;
import java.time.LocalDate;

public class FoodItems extends Category implements Serializable {
	private int itemCode;
	private String itemName;
	private int unitPrice;
	private LocalDate DateOfManufacture;
	private LocalDate DateOfExpiry;
	private Vegetarian vegetarian;
	private int quantity;
	
	//implementing Getters/Setters
	public int getItemCode() {
		return itemCode;
	}
	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public LocalDate getDateOfManufacture() {
		return DateOfManufacture;
	}
	public void setDateOfManufacture(LocalDate dateOfManufacture) {
		DateOfManufacture = dateOfManufacture;
	}
	public LocalDate getDateOfExpiry() {
		return DateOfExpiry;
	}
	public void setDateOfExpiry(LocalDate dateOfExpiry) {
		DateOfExpiry = dateOfExpiry;
	}
	public Vegetarian getVegetarian() {
		return vegetarian;
	}
	public void setVegetarian(Vegetarian vegetarian) {
		this.vegetarian = vegetarian;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	//implementing toString
	@Override
	public String toString() {
		return "FoodItems [itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice
				+ ", DateOfManufacture=" + DateOfManufacture + ", DateOfExpiry=" + DateOfExpiry + ", vegetarian="
				+ vegetarian + ", quantity=" + quantity + "]";
	}
	
	
	
	

}

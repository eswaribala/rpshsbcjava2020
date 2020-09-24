package com.hsbc.retail.models;

import java.io.Serializable;
import java.time.LocalDate;

public class FoodItems implements Serializable {

	
	private int itemCode;
	private String itemName;
	private long UnitPrice;
	private LocalDate dom;
	private LocalDate doe;
	private Type foodtype;
	private int quantity;
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
	public long getUnitPrice() {
		return UnitPrice;
	}
	public void setUnitPrice(long unitPrice) {
		UnitPrice = unitPrice;
	}
	public LocalDate getDom() {
		return dom;
	}
	public void setDom(LocalDate dom) {
		this.dom = dom;
	}
	public LocalDate getDoe() {
		return doe;
	}
	public void setDoe(LocalDate doe) {
		this.doe = doe;
	}
	public Type getFoodtype() {
		return foodtype;
	}
	public void setFoodtype(Type foodtype) {
		this.foodtype = foodtype;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}

package com.hsbc.retail.models;

import java.io.Serializable;

public class Apparel implements Serializable {

	private int itemCode;
	private String itemName;
	private long UnitPrice;
	private String size;
	private material materialtype;
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
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public material getMaterialtype() {
		return materialtype;
	}
	public void setMaterialtype(material materialtype) {
		this.materialtype = materialtype;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}

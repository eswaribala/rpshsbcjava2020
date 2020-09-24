package com.hsbc.products.model;

import java.io.Serializable;

/**
 * 
 * @author Sahil Shah
 *
 */
public class SubCategory extends Category implements Serializable{
	
	private int itemCode;
	private String name;
	private int unitPrice;
	private byte warranty;
	private int quantitySold;
	@Override
	public String toString() {
		return "SubCategory [itemCode=" + itemCode + ", name=" + name + ", unitPrice=" + unitPrice + ", warranty="
				+ warranty + ", quantitySold=" + quantitySold + "]";
	}
	public int getItemCode() {
		return itemCode;
	}
	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public byte getWarranty() {
		return warranty;
	}
	public void setWarranty(byte warranty) {
		this.warranty = warranty;
	}
	public int getQuantitySold() {
		return quantitySold;
	}
	public void setQuantitySold(int quantitySold) {
		this.quantitySold = quantitySold;
	}

}

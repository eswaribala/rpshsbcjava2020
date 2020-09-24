package com.hsbc.ecommerce.models;

import java.io.Serializable;

/**
 *@author AJAY YEWALE
 *
 * */

public class Products  implements Serializable{
	/**
	 * 
	 */
	
	private String itemCode;
	private String itemName;
	private float unitPrice;
	byte quantity;
	
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public float getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}
	@Override
	public String toString() {
		return "Products [itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice + "]";
	}
	
	
}

/**
 * @Harshal_Kamlesh_Yewale
 * 
 * Electronics Attributes
 */
package com.hsbc.banking.models;

import java.io.Serializable;

public class Electronics extends Category implements Serializable{
	private int itemCode;
	private String itemName;
	private int unitPrice;
	private byte warranty;
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
	public byte getWarranty() {
		return warranty;
	}
	public void setWarranty(byte warranty) {
		this.warranty = warranty;
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
		return "Electronics [itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice
				+ ", warranty=" + warranty + ", quantity=" + quantity + "]";
	}
	
	
	

}

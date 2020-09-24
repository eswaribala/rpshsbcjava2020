/**
 * @Harshal_Kamlesh_Yewale
 * 
 * Category Class for creating inheritance
 */
package com.hsbc.banking.models;

public class Category {
	private int itemCode;
	private String itemName;
	private int unitPrice;
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	//implementing toString
	@Override
	public String toString() {
		return "Category [itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice + ", quantity="
				+ quantity + "]";
	}
	
	

}

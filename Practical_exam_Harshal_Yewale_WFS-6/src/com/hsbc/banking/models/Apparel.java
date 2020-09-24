/**
 * @Harshal_Kamlesh_Yewale
 * 
 * Apparel Attributes
 */

package com.hsbc.banking.models;

import java.io.Serializable;

public class Apparel extends Category implements Serializable {
	private int itemCode;
	private String itemName;
	private int unitPrice;
	private String size;
	private Material material;
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
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
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
		return "Apparel [itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice + ", size="
				+ size + ", material=" + material + ", quantity=" + quantity + "]";
	}
	
	
	
	

}

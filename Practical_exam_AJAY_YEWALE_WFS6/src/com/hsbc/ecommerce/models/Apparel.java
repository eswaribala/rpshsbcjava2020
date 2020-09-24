package com.hsbc.ecommerce.models;

import java.io.Serializable;

public class Apparel extends Products implements Serializable {
	/**
	 * 
	 */
	
	String size;
	Material material;
	
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
	public byte getQuantity() {
		return quantity;
	}
	public void setQuantity(byte quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Apparel [size=" + size + ", material=" + material + ", quantity=" + quantity + "]";
	}
	

}

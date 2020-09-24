/**
 * @author: Varun Rajendra Gujarathi
 * @purpose: Java file containing the generic super class Product
 * @created_on: 24/09/2020
 */
package com.hsbc.ecommerce.models;

import java.io.Serializable;

public class Product implements Serializable {
	// declaring generic properties common to all 3
	private int itemCode;
	private String itemName;
	private int unitPrice;
	private int quantity;

	// auto generated getters and setters
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
}

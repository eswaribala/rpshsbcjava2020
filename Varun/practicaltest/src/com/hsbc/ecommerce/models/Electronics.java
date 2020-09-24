/**
 * @author: Varun Rajendra Gujarathi
 * @purpose: Java file containing the 'Electronics' model
 * @created_on: 24/09/2020
 */
package com.hsbc.ecommerce.models;



// model class
public class Electronics extends Product {
	//	declaring variables that are properties of Electronics items
	private byte warranty;

	// auto generated getters and setters
	public byte getWarranty() {
		return warranty;
	}

	public void setWarranty(byte warranty) {
		this.warranty = warranty;
	}
}

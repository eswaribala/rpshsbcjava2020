package com.hsbc.ecommerce.models;

import java.io.Serializable;

public class Electronics extends Products  implements Serializable {
	/**
	 * 
	 */
	byte warranty;

	public byte getWarranty() {
		return warranty;
	}

	public void setWarranty(byte warranty) {
		this.warranty = warranty;
	}

	
}

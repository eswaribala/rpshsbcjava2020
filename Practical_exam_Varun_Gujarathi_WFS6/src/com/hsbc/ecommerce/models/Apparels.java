/**
 * @author: Varun Rajendra Gujarathi
 * @purpose: Java file containing the 'Apparels' model
 * @created_on: 24/09/2020
 */
package com.hsbc.ecommerce.models;


public class Apparels extends Product {
	// declaring variables that are properties of Apparels
	private int size;
	private Material material;

	// auto generated getters and setters
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

}

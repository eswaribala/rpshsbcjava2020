/**
 * @author: Varun Rajendra Gujarathi
 * @purpose: Java file containing the 'Food Items' model
 * @created_on: 24/09/2020
 */
package com.hsbc.ecommerce.models;

import java.time.LocalDate;

public class FoodItems extends Product {
	// declaring variables that are properties of Food Items

	private LocalDate dom;	//dom - date of manufacture
	private LocalDate doe;	//doe - date of expiry
	private boolean vegetarian;

	// auto generated getters and setters
	public LocalDate getDom() {
		return dom;
	}

	public void setDom(LocalDate dom) {
		this.dom = dom;
	}

	public LocalDate getDoe() {
		return doe;
	}

	public void setDoe(LocalDate doe) {
		this.doe = doe;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}
}

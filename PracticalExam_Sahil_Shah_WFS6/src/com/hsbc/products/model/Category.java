package com.hsbc.products.model;

import java.io.Serializable;

/**
 * 
 * @author Sahil Shah
 *
 */
public class Category implements Serializable{
	
	private int categoryId;
	private String name;
	

	public int getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}


	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", name=" + name + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Category() {
		// TODO Auto-generated constructor stub
	}

}

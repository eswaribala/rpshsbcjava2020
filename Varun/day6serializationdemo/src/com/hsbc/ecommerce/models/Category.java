package com.hsbc.ecommerce.models;

import java.io.Serializable;

//CRUD operation using serialization
public class Category implements Serializable{
	
	private int categoryId;
	private String name;
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", name=" + name + "]";
	}
	
	

}

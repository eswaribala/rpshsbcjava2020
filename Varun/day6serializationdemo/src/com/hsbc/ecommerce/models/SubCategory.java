package com.hsbc.ecommerce.models;

import java.io.Serializable;

public class SubCategory extends Category implements Serializable{
	
	private int subCategoryId;
	private String subCategoryName;
	public int getSubCategoryId() {
		return subCategoryId;
	}
	public void setSubCategoryId(int subCategoryId) {
		this.subCategoryId = subCategoryId;
	}
	public String getSubCategoryName() {
		return subCategoryName;
	}
	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}
	@Override
	public String toString() {
		return super.toString()+"SubCategory [subCategoryId=" + subCategoryId + ", subCategoryName=" + subCategoryName + "]";
	}
	
	

}

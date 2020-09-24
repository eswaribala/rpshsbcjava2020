package com.hsbc.ecommerce.bl;

import java.util.Comparator;

import com.hsbc.ecommerce.models.Product;

public class ProductSorter implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		return p1.getQuantity().compareTo(p2.getQuantity());
	}

}
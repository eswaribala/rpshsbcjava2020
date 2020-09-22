package com.hsbc.banking.utility;

import java.util.Scanner;

import com.hsbc.banking.models.Products;

public class ProductValueCalculator {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] inputArray = input.split(",");
		byte productId = Byte.parseByte(inputArray[0]);
		String productName = inputArray[1];
		byte qty = Byte.parseByte(inputArray[2]);
		System.out.println(productId + " " + qty);
		Products product = new Products();
		product.setProductId(productId);
		product.setQuantity(qty);
		switch(productName){
			case "Laptop":
				product.setRetailValue(product.getQuantity() * 22.5f);
				break;
			case "Desktop":
				product.setRetailValue(product.getQuantity() * 44.5f);
				break;
			case "Mobile":
				product.setRetailValue(product.getQuantity() * 9.98f);
				break;	
			default:
				break;
		}
		System.out.println(product.getRetailValue());
		scanner.close();
	}
}

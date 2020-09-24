package com.hsbc.ecommerce.view;

import com.hsbc.ecommerce.bl.ProductsBL;
import com.hsbc.ecommerce.bl.ProductsBLImpl;
import com.hsbc.ecommerce.exceptions.FileCreationException;

import java.time.LocalDate;
import java.util.Scanner;

public class ProductsApp {
	private static ProductsBL productsBL;

	static
	{
		try {
			productsBL=new ProductsBLImpl(;
		} catch (FileCreationException e) {
			//Business specific Exception
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter type\n1. Food Items\n2. Electronics\n3. Apparels");
		byte itemType = scanner.nextByte();
		scanner.nextLine();

		switch (itemType){
			case 1:
				System.out.println("Add Item Code");
				int itemCode = scanner.nextInt();
				System.out.println("Add Item Name");
				String itemName = scanner.nextLine();
				System.out.println("Add Unit Price");
				int unitPrice = scanner.nextInt();
				System.out.println("Add Date of Manuf");
				LocalDate dom = LocalDate.parse(scanner.nextLine());
				System.out.println("Add Date of Expiry");
				LocalDate doe = LocalDate.parse(scanner.nextLine());
				System.out.println("Vegetarian (Y/N)");
				String veg = scanner.nextLine();
				if(veg[0] == 'Y' || veg)
		}
	}
}

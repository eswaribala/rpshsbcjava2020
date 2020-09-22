package com.hsbc.banking.utility;

import java.util.Scanner;

import com.hsbc.banking.models.Person;

public class TaxCalculator {
	static double taxRate;
	static double tax;
	static Person[] person;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Taking values from user to create customer object.
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the no of persons");
		int size=scanner.nextInt();
		scanner.nextLine();
		 Person[] person=new Person[size];
		for(int i=0;i<size;i++)
		{
			person[i]=new Person();
			System.out.println("Enter gender");
			String gen=scanner.nextLine();
			person[i].setGender(gen);
			System.out.println("Enter income of a person");
			person[i].setIncome(scanner.nextDouble());
			scanner.nextLine();
			calTax(person[i].getIncome(),person[i].getGender());
			System.out.println("Enter next Inputs");
		}

	}

	private static void calTax(double income, String gen) {
		// TODO Auto-generated method stub
		if (gen.equals("Male"))
		{
			System.out.println("Comming here");
			if(income>3000000)
				tax= (income*30)/100;
			else if(income>2000000 && income<2999999)
				tax= (income*20)/100;
			if(income>1000000 && income<1999999)
				tax= (income*10)/100;
		}
		else if(gen.equals("Female"))
		{
			if(income>3000000)
				tax= (income*25)/100;
			else if(income>2000000 && income<2999999)
				tax= (income*15)/100;
			if(income>1000000 && income<1999999)
				tax= (income*5)/100;
		}
		System.out.println("tax is " + tax);
	}

}

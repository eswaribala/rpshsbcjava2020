package com.hsbc.banking.utility;
/**
 * @author varungujarathi9
 * @version 0.1
 * @description using various data types in java
 */
public class DatatypeApp {
	public int payment;
	public int connectionString;
	public static void main(String[] args) {
		//test on datatype
		byte age = 0;
		long mobileNum = 8446025911L;
		char letter = '\u0905';
		System.out.println(letter);
		
		//test variable names
		long returnable = 45L;
		final int ID = 0304;
		int id = 10;
		
		//testing literals
		int memAddr = 0xFF; //hex
		int octalMem = 056; //octal
		
		//floating number
		float usCurrency=5.67f;
		
		//boolean
		boolean bool = true; 
		
		int i=-10;
		int k=i++;
		System.out.println(k);
		
		float d=+3.4f;
		double f = d++;
		System.out.print(i=10);
	}
}

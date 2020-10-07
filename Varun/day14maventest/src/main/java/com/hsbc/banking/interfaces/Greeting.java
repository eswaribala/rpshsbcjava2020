package com.hsbc.banking.interfaces;

@FunctionalInterface
public interface Greeting {

	String message(String value); 
	//default methods
	default String wishList(String value)
	{
		return value;
	}
	
}

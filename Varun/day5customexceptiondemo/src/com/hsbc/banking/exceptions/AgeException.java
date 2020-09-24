package com.hsbc.banking.exceptions;

//if age is negative throw age exception
public class AgeException extends Exception{
	
	public AgeException(String message)
	{
		super(message);
	}

}

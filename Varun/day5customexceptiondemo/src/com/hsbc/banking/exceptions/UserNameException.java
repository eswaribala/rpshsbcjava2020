package com.hsbc.banking.exceptions;

//If username has numbers throw UserName Exception

public class UserNameException extends Exception{

	public UserNameException(String message)
	{
		super(message);
	}
	
}

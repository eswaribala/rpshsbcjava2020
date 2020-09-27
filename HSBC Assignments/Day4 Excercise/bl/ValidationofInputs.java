package edu.day4.assignment1.bl;

import java.util.regex.Pattern;

import javax.naming.InvalidNameException;

import edu.day4.assignment1.Exception.InvalidHoursException;

public class ValidationofInputs {

	private int hours;
	private String name;
	private float rate;
	
	public boolean validateHours(int hours,float rate) {
		boolean b=true;
		try
		{
			if(hours<0 || rate<0)
			{
				b=false;
				throw new InvalidHoursException("Please enter hours and rate greater than 0");
			}
		}
		catch(InvalidHoursException exception)
		{
			System.out.println(exception.getMessage());
		}
		return b;
	}
	public boolean validateName(String name)
	{
		boolean b=true;
		try
		{
			if(!Pattern.matches("[a-zA-Z]*", name))
			{
				b=false;
				throw new InvalidNameException("please enter Alphabets in name");
			}
		}
		catch(InvalidNameException exception)
		{
			System.out.println(exception.getMessage());
		}
		return b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

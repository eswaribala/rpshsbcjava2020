package com.hsbc.bank.utility;

import java.util.Scanner;

import com.hsbc.bank.model.Trainee;

/**
 * 
 * @author Sahil Shah
 *
 */

//App to find where the employee would lie in I.T slab

public class Excercise1 {

	//main function calling the calculate tax to find the slab category
	public static void main(String args[]) {
		Excercise1 e=new Excercise1();
		e.calculateTax();	
		
	}
	
	
	//function to calculate where the person lies in the tax slab;
	private void calculateTax()
	{

		//getting input from the user
		System.out.println("Enter gender and salary to know in which I.T. slab you lie");
		final long L=100000;
		Scanner sc=new Scanner(System.in);
		String l = sc.nextLine();
		String[] vec=l.split(" ");
		
		//creating Trainee object to set gender and salary
		Trainee tr=new Trainee();
		
		//assigning info recieved from user
		tr.setGender(vec[0]);
		tr.setSalary(Long.parseLong(vec[1]));
		
		long salary=tr.getSalary();
		
		//calc tax slab
		switch(tr.getGender())
		{
		//we are considering all possible options for male and female 
			case "m":
			case "Male":
			case "male": if(salary>30*L)
							System.out.println("You lie in 30% slab");
						else if(salary<=30*L && salary>20*L)
							System.out.println("You Lie in 20% slab");
						else
							System.out.println("NO need to pay taxes");
						break;
			
			case "f":
			case "Female":
			case "female":  if(salary>30*L)
								System.out.println("You lie in 30% slab");
							else if(salary<=30*L && salary>20*L)
								System.out.println("You Lie in 20% slab");
							else
								System.out.println("NO need to pay taxes");
							break;
			//to prevent abrupt ending of the program
			default: System.out.println("Sorry Invalid Entry!!");
		}

	}
}

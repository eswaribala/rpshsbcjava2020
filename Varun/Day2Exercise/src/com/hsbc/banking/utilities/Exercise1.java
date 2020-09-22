package com.hsbc.banking.utilities;

public class Exercise1 {
	public static void main(String[] args) {
		
		if(args.length > 0) {
			// get gender & salary details 
			char gender = args[0].substring(0).toUpperCase().charAt(0);
			int salary = Integer.parseInt(args[1]);
			System.out.println("Gender: " + args[0] + "; Salary: " + salary + "/-");
			
			switch(gender) {
				case 'M':
					if(salary > 3000000) {
						System.out.println("Your I.T. amount is " + salary*0.3 + "/-");
					}
					else if(salary <= 3000000 && salary > 2000000) {
						System.out.println("Your I.T. amount is " + salary*0.2 + "/-");
					}
					else if(salary <= 2000000 && salary > 1000000) {
						System.out.println("Your I.T. amount is " + salary*0.1 + "/-");
					}
					else if(salary <= 1000000) {
						System.out.println("Your I.T. amount is 0/-");
					}
					else {
						System.out.println("Salary out of bounds");
					}
					break;
				
				case 'F':
					if(salary > 3000000) {
						System.out.println("Your I.T. amount is " + salary*0.25 + "/-");
					}
					else if(salary <= 3000000 && salary > 2000000) {
						System.out.println("Your I.T. amount is " + salary*0.15 + "/-");
					}
					else if(salary <= 2000000 && salary > 1000000) {
						System.out.println("Your I.T. amount is " + salary*0.05 + "/-");
					}
					else if(salary <= 1000000) {
						System.out.println("Your I.T. amount is 0/-");
					}
					else {
						System.out.println("Salary out of bounds");
					}
					break;
					
				default:
					System.out.println("Gender unknown");
			}
		}
		else {
			System.out.println("No input given");
		}
	}
}

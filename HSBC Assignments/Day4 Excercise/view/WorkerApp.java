package edu.day4.assignment1.view;

import java.util.*;

import edu.day4.assignment1.bl.ValidationofInputs;
import edu.day4.assignment1.model.DailyWorker;
import edu.day4.assignment1.model.SalariedWorker;

public class WorkerApp {

	public static void main(String[] args)
	{

		//declaring common field of worker 
		String name=null;
		float salaryRate;
		String input=null;
		int hours;
		//get common worker information
		System.out.println("Enter worker name");
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
		System.out.println("Enter worker rate");
		salaryRate=sc.nextFloat();
		System.out.println("Enter worker hours");
		hours=sc.nextInt();
		
		//function to validate inputs;
		validateInputs(hours, salaryRate, name);
		
		//function to calculate pay of workers
		CalculatePay(hours, salaryRate, name);
			
	}
	
	public static void validateInputs(int hours,float salaryRate, String name)
	{
				//validation of user inputs for graceful execution
				ValidationofInputs validation=new ValidationofInputs();
				boolean HourRate=validation.validateHours(hours,salaryRate);
				boolean Name=validation.validateName(name);
				//terminate the program if any invalid input is encountered
				if(!Name || !HourRate)
					System.exit(0);
	}
	
	public static void CalculatePay(int hours,float salaryRate,String name)
	{

		float weeklySalary=0;
		//assigning input given by user to appropriate variables
		Scanner sc=new Scanner(System.in);
		int choice;
		//select the type of worker
		System.out.println("1. Daily Worker");
		System.out.println("2. Salaried Worker");
		System.out.println("Enter the choice of worker or 3 to exit");
		choice=sc.nextInt();
		//calculating the pay and displaying the same 
		switch(choice)
		{
			case 1:DailyWorker d=new DailyWorker(name, salaryRate, hours);
					weeklySalary=d.DailyWorkerPay();
					System.out.println("The Weekly Pay of the Daily worker is "+ weeklySalary);
					break;
				
			case 2:SalariedWorker s=new SalariedWorker(name, salaryRate,hours);
				weeklySalary=s.SalariedWorkerPay();
				System.out.println("The Weekly Pay of the Salaried worker is "+weeklySalary);
				break;
			
			default:break;
		}
	
	}
}

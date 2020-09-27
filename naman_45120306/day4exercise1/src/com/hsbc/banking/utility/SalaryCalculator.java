package com.hsbc.banking.utility;

import java.util.Scanner;

import com.hsbc.banking.models.DailyWorker;
import com.hsbc.banking.models.SalariedWorker;

public class SalaryCalculator {
	
	
	public static void main(String args[])
	{
		int hours;
		DailyWorker dailyWorker=new DailyWorker("Naman", 20);
		SalariedWorker salariedWorker=new SalariedWorker("Prakhar", 30);

		//Enter number of days for daily worker
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter  number of hours for daily worker");
		dailyWorker.setNumberOfDays(scanner.nextInt());
		
		//Enter base salary for a week
		System.out.println("Enter base salary for a week");
		double baseSalary=scanner.nextDouble();
		baseSalary +=dailyWorker.pay(dailyWorker.getNumberOfDays()*8);
		System.out.println("Final Salary" + baseSalary);
	}
}

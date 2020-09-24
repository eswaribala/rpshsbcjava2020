package com.hsbc.banking.bl;

import com.hsbc.banking.models.Worker;

public class DailyWorker extends Worker {
	
	public DailyWorker(String name, int salaryRate) {
		super(name, salaryRate);
		// TODO Auto-generated constructor stub
	}

	public void pay(Worker worker,int hours)
	{
		System.out.println("Daily Worker Details..");
		//Printing worker's name
		System.out.println("Name:"+worker.getName());
		//Calculating pay of worker
		System.out.println("Daily Worker's Salary:"+ worker.getSalaryRate()*hours);
	}
}

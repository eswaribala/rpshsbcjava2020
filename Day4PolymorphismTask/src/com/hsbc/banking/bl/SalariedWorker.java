package com.hsbc.banking.bl;

import com.hsbc.banking.models.Worker;

public class SalariedWorker extends Worker {

	public SalariedWorker(String name, int salaryRate) {
		super(name, salaryRate);
		// TODO Auto-generated constructor stub
	}

	public static void pay(Worker worker) {
		  System.out.println("Salaried Worker Details..");
		  System.out.println("Name: "+worker.getName());
		  System.out.println("Salary: "+(40*worker.getSalaryRate()));
		 }

}

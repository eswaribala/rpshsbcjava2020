package com.hsbc.banking.views;

import com.hsbc.banking.bl.DailyWorker;
import com.hsbc.banking.bl.SalariedWorker;
import com.hsbc.banking.models.Worker;

public class WorkerApp {

	/*public WorkerApp(String name, int salaryRate) {
		super(name, salaryRate);
		// TODO Auto-generated constructor stub
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Daily Worker 
		DailyWorker dailyWorker = new DailyWorker("Daily Worker",30);
		dailyWorker.pay(dailyWorker,45 );
		//Salaried Worker
		SalariedWorker salaryWorker= new SalariedWorker("Salary Worker",20);
		SalariedWorker.pay(salaryWorker);
	}

}

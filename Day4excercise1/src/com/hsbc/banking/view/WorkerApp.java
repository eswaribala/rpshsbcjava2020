package com.hsbc.banking.view;

import com.hsbc.banking.model.DailyWorker;
import com.hsbc.banking.model.SalariedWorker;

public class WorkerApp {
	
	public static void main(String[] args)
	{
		DailyWorker dailyworker = new DailyWorker("Rushabh",12);
		SalariedWorker salariedworker = new SalariedWorker("ABC",18);
		
		dailyworker.pay(50);
		salariedworker.pay();
		
	}

}

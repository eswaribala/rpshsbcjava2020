package com.hsbc.banking.model;

public class DailyWorker extends Worker {
    int rate;
	public DailyWorker(String name,int rate) {
		super(name);
		this.rate=rate;
		// TODO Auto-generated constructor stub
	}
	public void pay(int hours)
	{
		 show();
		 System.out.println("Salary"+rate*hours);
	}

}

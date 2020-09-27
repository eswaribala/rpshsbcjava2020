package com.hsbc.banking.models;

public class DailyWorker extends Worker{

	int numberOfDays;
	
	public int getNumberOfDays() {
		return numberOfDays;
	}

	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}
	
	@Override
	public double pay(int hours)
	{
		return (this.salaryRate*hours)/100;
	}
	
	public DailyWorker(String name, double salaryRate) {
		super(name, salaryRate);
		// TODO Auto-generated constructor stub
	}
	

}

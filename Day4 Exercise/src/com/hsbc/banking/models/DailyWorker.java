package com.hsbc.banking.models;

public class DailyWorker extends Worker 
{
	public DailyWorker()
	{
		
	}

	public DailyWorker(String name, float salaryRate) 
	{
		super(name, salaryRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "DailyWorker [ With working hours =" + getNoOfWorkingHours()
				+ ",  Name=" + getName() + ", and SalaryRate=" + getSalaryRate() + "Pay of workers=" + getOutput() + "]";
	}

	
}

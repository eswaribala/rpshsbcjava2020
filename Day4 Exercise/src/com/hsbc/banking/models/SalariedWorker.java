package com.hsbc.banking.models;

public class SalariedWorker extends Worker
{
	
	public SalariedWorker()
	{
		
	}
	
	public SalariedWorker(String name, float salaryRate)
	{
		super(name, salaryRate);
		
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SalariedWorker [ With working hours =" + getNoOfWorkingHours()
		+ ",  Name=" + getName() + ", and SalaryRate=" + getSalaryRate() + "Pay of workers=" + getOutput() + "]";
	}
	
	

}

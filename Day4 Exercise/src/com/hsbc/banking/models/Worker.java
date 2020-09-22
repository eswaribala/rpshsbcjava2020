package com.hsbc.banking.models;

// Worker has 3 attributes i.e. name,salary rate,no of working hours 
public class Worker
{
	private String name;
	private float salaryRate;
	private int noOfWorkingHours;
	private float output;
	
	//constructors to initialize the worker object
	public Worker()
	{
		
	}
	public Worker(String name, float salaryRate)
	{
		this.name = name;
		this.salaryRate = salaryRate;
	
		
	}
	
	// getter and setter methods to access the attributes

	public float getOutput() {
		return output;
	}
	public void setOutput(float a) {
		this.output = a;
	}
	
	
	public int getNoOfWorkingHours() 
	{
		return noOfWorkingHours;
	}


	public void setNoOfWorkingHours(int noOfWorkingHours) 
	{
		this.noOfWorkingHours = noOfWorkingHours;
	}


	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	
	
	public float getSalaryRate() 
	{
		return salaryRate;
	}
	public void setSalaryRate(float salaryRate)
	{
		this.salaryRate = salaryRate;
	}
	
}


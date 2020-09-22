package com.hsbc.banking.models;

public class Worker {
	String name;
	double salaryRate;
	
	public Worker(String name, double salaryRate) {
		super();
		this.name = name;
		this.salaryRate = salaryRate;
	}
	double pay(int hours)
	{
		return 0.0;
	}
	
	@Override
	public String toString() {
		return "Worker [name=" + name + ", salaryRate=" + salaryRate + "]";
	}
	

}

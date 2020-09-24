package com.hsbc.banking.models;
//Worker details
public class Worker {
	//worker name
	private String name;
	//worker's salaRate;
	private int salaryRate;
	public Worker(String name, int salaryRate) {
		super();
		this.name = name;
		this.setSalaryRate(salaryRate);
	}
	
	@Override
	public String toString() {
		return "Worker [name=" + name + ", salaryRate=" + getSalaryRate() + "]";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalaryRate() {
		return salaryRate;
	}

	public void setSalaryRate(int salaryRate) {
		this.salaryRate = salaryRate;
	}
	
	
}

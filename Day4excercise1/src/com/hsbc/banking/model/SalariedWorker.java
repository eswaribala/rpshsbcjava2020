package com.hsbc.banking.model;

public class SalariedWorker extends Worker{
    int  rate;
	public SalariedWorker(String name,int rate) {
		super(name);
		this.rate=rate;
		// TODO Auto-generated constructor stub
	}
	int hours=40;
    public void pay()
    {
    	show();
    	System.out.println("Salary is"+rate*hours);
    }
}

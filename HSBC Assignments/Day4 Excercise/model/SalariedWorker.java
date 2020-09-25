package edu.day4.assignment1.model;

public class SalariedWorker extends Worker{


	public SalariedWorker(String name, float rate, int hours) {
		super(name, rate);
		this.hours=hours;
		// TODO Auto-generated constructor stub
	}


	private int hours;
	

	public float SalariedWorkerPay()
	{
		//as Salariedworkers are given weekly wages per 40 hours, henceforth
		int weeks=hours/40;
		return rate*weeks;
	}
	
	

}

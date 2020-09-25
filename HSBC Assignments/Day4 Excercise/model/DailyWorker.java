package edu.day4.assignment1.model;

//extend the worker class as dailyworker is also a worker
public class DailyWorker extends Worker {

	public DailyWorker(String name, float rate,int hours) {
		super(name, rate);
		this.hours=hours;
		// TODO Auto-generated constructor stub
	}

	//hours worked by the daily worker
	private int hours;
	
	public float DailyWorkerPay()
	{
		//as dailyworkers are given daily wages we need to calculate days and then the weekly pay
		int day=hours/24;
		return 7*rate*day;
	}
	
}

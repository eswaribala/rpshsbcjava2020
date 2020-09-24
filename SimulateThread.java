package com.hsbc.banking.models;

public class SimulateThread implements Runnable{

	private Vehicle vehicle;
	private String regNo;
	public SimulateThread(Vehicle vehicle, String name, String regNo)
	{
		this.vehicle=vehicle;
		this.regNo=regNo;
		new Thread(this,name).start();		
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(this.vehicle)
		{
			this.vehicle.getMessage(regNo);
		}
		
	}

}

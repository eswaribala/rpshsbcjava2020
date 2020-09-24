package com.hsbc.banking.models;

public class SimulateThread implements Runnable{

	private Vehicle vehicle;
	private String regNo;

	public SimulateThread(Vehicle vehicle, String regNo, String threadName) {
		this.vehicle = vehicle;
		this.regNo = regNo;
		new Thread(this, threadName).start();
	}

	@Override
	public void run() {
		synchronized (this.vehicle){
			this.vehicle.getMessage(this.regNo);
		}
	}
}

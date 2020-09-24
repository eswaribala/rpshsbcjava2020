package com.hsbc.banking.models;

public class Vehicle {
	public void getMessage(String regNo){
		System.out.println("RegNo" + regNo + " - " + Thread.currentThread().getName() + " - " + Bridge.getMessage());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("RegNo" + regNo + " - " + Thread.currentThread().getName() + " - " + TollBooth.getMessage());

	}
}

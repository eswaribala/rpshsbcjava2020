package com.hsbc.banking.models;

public class Vehicle {
	private String regNo;

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	
	public void getMessage(String regNo)
	
	{
		 System.out.print(Thread.currentThread().getName()+"-->RegNo:"+regNo+"->"
	         +Bridge.getMessage());
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(TollBooth.getMessage());
	}
	

}

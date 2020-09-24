package com.hsbc.banking.models;

public class MessageThread extends Thread{

	public MessageThread(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		Thread.currentThread().setName(name);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		System.out.println(Thread.currentThread().getName());
	}

	
	
}

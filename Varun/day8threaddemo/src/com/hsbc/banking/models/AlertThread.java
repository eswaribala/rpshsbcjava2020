package com.hsbc.banking.models;

public class AlertThread extends Message implements Runnable{

	public AlertThread(int messageId, String payload) {
		super(messageId, payload);
		// TODO Auto-generated constructor stub
	
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		for(char ch: this.payload.toCharArray())
		{
			System.out.print(ch);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
				
		//System.out.println("Message"+super.toString());
	}

}

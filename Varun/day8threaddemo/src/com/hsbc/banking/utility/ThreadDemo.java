package com.hsbc.banking.utility;

import com.hsbc.banking.models.AlertThread;
import com.hsbc.banking.models.MessageThread;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Before creating user thread
		System.out.println(Thread.currentThread().getName());	
		MessageThread messageThread=new MessageThread("Banking-Thread");
		messageThread.start();	
		   //state of the thread
		System.out.println(messageThread.isAlive());
		//after creating user thread
		System.out.println(Thread.currentThread().getName());	
		AlertThread alertThread=new AlertThread(1374,"Test-Alert");
		Thread thread=new Thread(alertThread,"Alert-Thread");
		thread.start();
		System.out.println(Thread.currentThread().getName());	
		 //state of the thread
		System.out.println(thread.isAlive());
		
		
		
	}

}

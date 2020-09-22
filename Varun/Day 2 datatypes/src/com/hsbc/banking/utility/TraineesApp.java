package com.hsbc.banking.utility;

import java.util.Random;

import com.hsbc.banking.models.Trainee;

public class TraineesApp {
	
	private static Trainee[] traineeList = new Trainee[5];
	public static boolean status = false;
	
	public static void main(String[] args) {
		// add 5 trainees
		createTrainees();
		readTrainees();
		int randID = new Random().nextInt(5);
		System.out.print("User Status " + randID + " : ");
		System.out.println(validateLogin(traineeList[randID].getUserName(), traineeList[randID].getPassword()));
		
	}
	
	public static void createTrainees() {
		for(int i = 0; i < traineeList.length; i++) {
			traineeList[i] = new Trainee();
			traineeList[i].setUserName("user" + new Random().nextInt(10000));
			traineeList[i].setPassword("pwd" + new Random().nextInt(100000)+"!");
		}
	}
	
	public static void readTrainees() {
		for(Trainee trainee:traineeList) {
			System.out.print("Username = " + trainee.getUserName());
			System.out.println("\tPassword = " + trainee.getPassword());
		}
	}
	
	public static boolean validateLogin(String userName, String password) {
		status = false;
		for(Trainee trainee:traineeList) {
			if((trainee.getUserName().equals(userName))&&(trainee.getPassword().equals(password))) {
				status = true;
				break;
			}
		}
		return status;
	}
}

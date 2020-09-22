package com.hsbc.banking.dao;

import com.hsbc.banking.models.Trainee;

public class TraineeDao {
	
	private Trainee[] traineeList;
	private static int pos;
	
	public TraineeDao(int size) {
		traineeList = new Trainee[size];
	}
	
	// add trainee
	public String addTrainee(Trainee trainee) {
		traineeList[pos] = new Trainee();
		// traineeList[pos] ;
		return null;
		
	}
	
	// read the trainee details
	
	
	// delete the trainee details
	
	
	// validate login
	
	// break
	
}

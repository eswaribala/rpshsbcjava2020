package com.hsbc.banking.views;

import java.time.LocalDate;
import java.util.Random;

import con.hsbc.banking.models.Trainee;

public class TraineeApp {
	public static void main(String[] args) {
		Trainee[] trainees = new Trainee[5];
		
		for (int i = 0; i < trainees.length; i++) {
			trainees[i] = new Trainee("user"+new Random().nextInt(10), LocalDate.of(new Random().nextInt(50)+1960, new Random().nextInt(11)+1, new Random().nextInt(26)+1) );
		}
	}
}

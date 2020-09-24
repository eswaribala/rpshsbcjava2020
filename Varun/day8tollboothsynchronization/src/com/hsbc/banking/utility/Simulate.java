package com.hsbc.banking.utility;

import com.hsbc.banking.models.SimulateThread;
import com.hsbc.banking.models.Vehicle;

public class Simulate {
	public static void main(String[] args) {
		SimulateThread[] simulateThread = new SimulateThread[5];
		Vehicle vehicle = new Vehicle();
		for(int i = 0; i < 5; i++){
			simulateThread[i] = new SimulateThread(vehicle, "MH12DY"+i, i+"thread");
		}
	}
}

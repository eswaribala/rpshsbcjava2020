package com.hsbc.banking.utility;

import java.util.Random;

import com.hsbc.banking.models.SimulateThread;
import com.hsbc.banking.models.Vehicle;

public class SimulationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimulateThread[] simulations=new SimulateThread[4];
		Vehicle vehicle=new Vehicle();
		for(int i=0;i<4;i++)
		{
			simulations[i]=new SimulateThread(vehicle,"SM-Thread"+i,
					"TN-32"+new Random().nextInt(1000));
		}

	}

}

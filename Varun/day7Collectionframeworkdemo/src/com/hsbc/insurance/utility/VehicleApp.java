package com.hsbc.insurance.utility;

import java.time.LocalDate;
import java.util.Random;

import com.hsbc.insurance.models.Fuel;
import com.hsbc.insurance.models.Vehicle;

public class VehicleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//equals and hashcode
		
		Vehicle vehicle1=new Vehicle();
		vehicle1.setRegistrationNo("TN-02"+new Random().nextInt(10000));
		vehicle1.setChassisNo("AH"+new Random().nextInt(100000));
		vehicle1.setEngineNo("HY"+new Random().nextInt(100000));
		vehicle1.setMaker("Hyundai");
		vehicle1.setDor(LocalDate.of(2000+new Random().nextInt(19)+1, 
				new Random().nextInt(10)+1, new Random().nextInt(27)+1));
		vehicle1.setColor("BLUE");
		vehicle1.setFuelType(Fuel.PETROL);
		
		Vehicle vehicle2=new Vehicle();
		vehicle2.setRegistrationNo("TN-02"+new Random().nextInt(10000));
		vehicle2.setChassisNo("AH"+new Random().nextInt(100000));
		vehicle2.setEngineNo("HN"+new Random().nextInt(100000));
		vehicle2.setMaker("Honda");
		vehicle2.setDor(LocalDate.of(2000+new Random().nextInt(19)+1, 
				new Random().nextInt(10)+1, new Random().nextInt(27)+1));
		vehicle2.setColor("BLUE");
		vehicle2.setFuelType(Fuel.DIESEL);
		
		System.out.println(vehicle1.equals(vehicle2));
		System.out.println(vehicle1.hashCode());
		System.out.println(vehicle2.hashCode());
	}

}

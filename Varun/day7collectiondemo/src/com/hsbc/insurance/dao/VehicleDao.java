package com.hsbc.insurance.dao;

import com.hsbc.insurance.models.Vehicle;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface VehicleDao {

    boolean addVehicle(List<Vehicle> vehicleList) throws IOException;
    List<Vehicle> getAllVehicle() throws IOException, ClassNotFoundException;
    Vehicle getVehicleByRegNo(String regNo);

}

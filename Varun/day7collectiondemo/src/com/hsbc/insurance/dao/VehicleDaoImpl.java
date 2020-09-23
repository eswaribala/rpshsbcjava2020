package com.hsbc.insurance.dao;

import com.hsbc.insurance.models.Vehicle;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class VehicleDaoImpl implements VehicleDao{

    private File file;
    private FileOutputStream fileOutputStream;
    private FileInputStream fileInputStream;
    private ObjectOutputStream objectOutputStream;
    private ObjectInputStream objectInputStream;

    public VehicleDaoImpl() throws IOException {
        file = FileHelper.createFile();
    }

    @Override
    public boolean addVehicle(List<Vehicle> vehicleList) throws IOException {
        fileOutputStream = new FileOutputStream(file, true);
        objectOutputStream = new ObjectOutputStream(fileOutputStream);
        for(Vehicle vehicle : vehicleList){
            objectOutputStream.writeObject(vehicle);
        }
        objectOutputStream.close();
        fileOutputStream.close();
        return true;
    }

    @Override
    public List<Vehicle> getAllVehicle() throws IOException, ClassNotFoundException {
        fileInputStream = new FileInputStream(file);
        objectInputStream = new ObjectInputStream(fileInputStream);
        List<Vehicle> vehicleList = new ArrayList<Vehicle>();
        Vehicle vehicle;
        try{
            while ((vehicle=(Vehicle) objectInputStream.readObject())!=null){
                vehicleList.add(vehicle);
            }
        }
        catch (EOFException e){

        }
        finally {
            objectInputStream.close();
            fileInputStream.close();
        }
        return null;
    }

    @Override
    public Vehicle getVehicleByRegNo(String regNo) {

        return null;
    }
}

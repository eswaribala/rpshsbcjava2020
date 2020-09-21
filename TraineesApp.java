package com.hsbc.banking.utility;

import java.util.Random;

import com.hsbc.banking.models.Trainee;

public class TraineesApp {
	
	//Trainee Array created
	private static Trainee[] traineeList=new Trainee[5];	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//add 5 trainees		
		createTrainees();
		getTrainees();		
		System.out.print("User Status:");
		int genRandom=new Random().nextInt(5);
		System.out.println(validateLogin(traineeList[genRandom].getUserName(),
				traineeList[genRandom].getPassword()));
		
		
	}	
	
	private static void createTrainees()
	{
					
				//add trainee object to array		
				for(int i=0;i<traineeList.length;i++)
				{
					traineeList[i]=new Trainee();			
					traineeList[i].setUserName("user"+new Random().nextInt(10000));
					traineeList[i].setPassword("Pwd"+new Random().nextInt(100000)+"!");			
				}
	}
	
	
	
	private static void getTrainees()
	{
		
		//retrieve all the user names and password		
				for(Trainee trainee:traineeList)
							System.out.println("UserName="+trainee.getUserName()+","
							+ "Password="+trainee.getPassword());
	}

	
	
	public static boolean validateLogin(String userName,String password)
	{
		boolean status=false;
		
		for(Trainee trainee:traineeList)
		{
			if((trainee.getUserName().equals(userName))&&(trainee.getPassword()
					.equals(password)))
			{
			    status=true;
				break;
				
			}		
		}
		
		
		return status;
		
		
	}
}

package com.hsbc.banking.utility;

public class ComputeEggs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Read the number of eggs from command line
		//convert string to integer
		int totalNoOfEggs=Integer.parseInt(args[0]);
		System.out.println("Total No of Eggs"+totalNoOfEggs);
		//calculate no of gross and remaining eggs
		int eggsInGross=totalNoOfEggs/144;
		int eggsInDozen;
		int eggs=0;
		//check the remainder
		int eggsRemaining=totalNoOfEggs%144;
		if(eggsRemaining>0)
		{
			eggsInDozen=eggsRemaining/12;
			//eggsRemaining after calculating dozen
			eggsRemaining%=12;
			if(eggsRemaining>0)
			{
				eggs=eggsRemaining;
			}
			else
			{
				eggs=0;
			}
			
		}
		else
		{
			eggsInDozen=0;
		}
	
		
		System.out.println("Your number of eggs is"+ eggsInGross+" gross,"+ 
		eggsInDozen+" dozen,and"+ eggs);
		
	}

}

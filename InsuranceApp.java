package com.hsbc.banking.utility;

import java.util.Scanner;

public class InsuranceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte row=Byte.parseByte(args[0]);		
		int[][] premium=new int[row][];
		Scanner scanner=new Scanner(System.in);
		int col=0;
		//Construct the array
		for(int i=0;i<premium.length;i++)
		{
			System.out.println("Enter premium type(1,2,4,12)");
			col=scanner.nextInt();
			scanner.nextLine();
			premium[i]=new int[col];
						
		}
		
		//Read the premium
		for(int i=0;i<premium.length;i++)
			{
				for(int j=0;j<premium[i].length;j++)
				{
					System.out.println("Enter premium Amount for the month"+j+
							"for the customer"+i);
					premium[i][j]=scanner.nextInt();
					scanner.nextLine();
					
				}
				System.out.print("\n");
			}
		
		
		//print the array
		for(int i=0;i<premium.length;i++)
		{
			for(int j=0;j<premium[i].length;j++)
			{
				System.out.print(premium[i][j]+",");
			}
			System.out.print("\n");
		}
		
		
		
		
		
		
		
		
	}

}

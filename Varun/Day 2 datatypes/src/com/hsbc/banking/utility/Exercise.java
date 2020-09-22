package com.hsbc.banking.utility;

import java.util.Scanner;

public class Exercise {
	public static void main(String[] args) {
		int grossEggs = 0;
		int dozenEggs = 0;
		int individualEggs = 0;
		int remainingEggs = 0;
		
		// read number of eggs from command line
		if (args.length > 0) {
			int numOfEggs = Integer.parseInt(args[0]);
			
			if(numOfEggs != 0){
				// calculate the gross eggs
				grossEggs = numOfEggs / 144;
				
				// calculate the remaining eggs after gross calculation
				remainingEggs = numOfEggs % 144;
				
				// check if eggs are remaining
				if(remainingEggs != 0){
					// calculate remaining eggs in dozen 
					dozenEggs = numOfEggs / 12;
					
					// calculate the remaining eggs after dozen calculation
					remainingEggs %= 12;
					
					// check if eggs are remaining
					if(remainingEggs != 0){
						individualEggs = remainingEggs;
					}
				}
			}
		}
		System.out.println("Gross: " + grossEggs + " Dozen: " + dozenEggs + " Ind: " + individualEggs);
		byte c = 10;
		//		byte c1 = -c;
	}
}

package com.hsbc.banking.utility;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class WordSort {

	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of array 1-5");
		int size=scanner.nextInt();
		scanner.nextLine();
		String[] nameArray= new String[size];
		for (int i = 0; i < nameArray.length; i++) {
			System.out.println("Enter element "+ i );
			nameArray[i]=scanner.nextLine();
		}

		//sorting
		System.out.println("Before Sorting.....");
		for(String name:nameArray)
			System.out.println(name);        
		//Sort trainee object by name       
		Arrays.sort(nameArray);
		System.out.println("After Sorting By Name.....");
		for(String name:nameArray)
			System.out.println(name);

	}
}

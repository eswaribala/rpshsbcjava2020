package com.hsbc.banking.views;

import java.util.Scanner;

import com.hsbc.banking.bl.UserBL;
import com.hsbc.banking.bl.UserBLImpl;
import com.hsbc.banking.exceptions.AgeException;
import com.hsbc.banking.exceptions.UserNameException;
import com.hsbc.banking.models.User;

//User App is view layer calls BL Layer
public class UserApp {
   //connect to business layer
	private static UserBL userBL;
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		User user=new User();
		System.out.println("Enter number of users");
		int size  = scanner.nextInt();
		scanner.nextLine();
		try {
			assert (size > 0) : "Size is invalid";
			userBL = new UserBLImpl(size);
			for (int i = 0; i < size; i++) {
				try {
					System.out.println("Enter User Name for user num. " + (i + 1));
					user.setUserName(scanner.nextLine());
					System.out.println("Enter Age for user num. " + (i + 1));
					user.setAge(scanner.nextByte());
					scanner.nextLine();
					userBL.addUser(user);
				} catch (UserNameException e) {
					System.out.println(e.getMessage());
				} catch (AgeException e) {
					System.out.println(e.getMessage());
				}
			}
			scanner.close();
		}
		catch (AssertionError e){
			System.out.println(e.getMessage());
		}
	}
	
}

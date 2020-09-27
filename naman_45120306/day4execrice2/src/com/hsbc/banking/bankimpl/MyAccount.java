package com.hsbc.banking.bankimpl;

import java.util.Scanner;

public class MyAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		SavingsAcc savingAcc=new SavingsAcc();

		//Enter initial principal ammount
		System.out.println("Enter the initial principal amnt");
		savingAcc.setPrincipalAmt(scanner.nextDouble());

		//calculate rate of interest
		System.out.println("Choose from 1-monthly/2-half_yeary/3-yearly");
		int ch=scanner.nextInt();
		switch (ch) {
		case 1:
			savingAcc.addMonthlyInt(savingAcc.principalAmt);
			break;
		case 2:
			savingAcc.addHalfYrlyInt(savingAcc.principalAmt);
			break;
		case 3:
			savingAcc.addAnnualInt(savingAcc.principalAmt);
			break;
		default:
			System.out.println("Enter correct choice");	
		}
		System.out.println("Amnt after interest calculation" + savingAcc.principalAmt);
		
		// (withdraw/get_balance/deposit)
		System.out.println("Enter amnt to withdraw");
		double withdrawAmount=scanner.nextDouble();
		savingAcc.withdraw(savingAcc.principalAmt, withdrawAmount);
		System.out.println("Amnt after withdraw" + savingAcc.principalAmt);
		
		System.out.println("Enter amnt to deposit");
		double depositAmount=scanner.nextDouble();
		savingAcc.deposit(savingAcc.principalAmt, depositAmount);
		System.out.println("Amount after deposit"+savingAcc.principalAmt);

	}
}

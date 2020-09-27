package com.hsbc.banking.bank;

public interface DepositAcc extends Account{
	boolean withdraw (double principalAmount, double withdraw);
	void deposit(double principalAmount,double valueDeposit);
	double getBalance();
}

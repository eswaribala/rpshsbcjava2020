package com.hsbc.banking.bank;

public interface DebitInterest extends Interest{
	void deductMonthlyInt(double amount);
	void deductHalfYrlyInt(double amount);
	void deductAnnualInt(double amount);
}

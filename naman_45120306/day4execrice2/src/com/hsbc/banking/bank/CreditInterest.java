package com.hsbc.banking.bank;

public interface CreditInterest extends Interest{
	void addMonthlyInt(double amount);
	void addHalfYrlyInt(double amount);
	void addAnnualInt(double amount);
}

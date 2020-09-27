package com.hsbc.banking.bank;

public interface Interest {
	double savingsAccountIntRate= 2.0;
	double fixedDepositAccountIntRate = 4.0;
	double personalLoanAccountIntRate =6.0 ;
	double housingLoanAccountIntRate =8.0 ;
	double calcInt();
}

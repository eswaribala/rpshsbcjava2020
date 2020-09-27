package com.hsbc.banking.bank;

public interface Account {
	String saving="SavingsAcc";
	String fixed="Fixed";
	String personalLoan="PersonalLoan";
	String housingLoan="HousingLoan";
	boolean createAcc(String accType);
}

package com.hsbc.banking.bank;

public interface LoanAcc extends Account{
	void repayPrincipal ();
	void payInterest ();
	void payPartialPrincipal ();
}

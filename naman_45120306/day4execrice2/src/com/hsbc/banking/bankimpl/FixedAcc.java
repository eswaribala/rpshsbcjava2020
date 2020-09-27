package com.hsbc.banking.bankimpl;

import com.hsbc.banking.bank.CreditInterest;
import com.hsbc.banking.bank.DepositAcc;

public class FixedAcc implements CreditInterest,DepositAcc  {
	double principalAmt;
	double rateOfInterest;
	double interest;
	public void setPrincipalAmt(double principalAmt) {
		this.principalAmt = principalAmt;
	}

	@Override
	public double calcInt() {
		// TODO Auto-generated method stub
		this.interest=((principalAmt*rateOfInterest)/100);
		//updating amount
		return this.interest;
	}

	@Override
	public boolean createAcc(String accType) {
		// TODO Auto-generated method stub
		return  true;
	}

	@Override
	public boolean withdraw(double principalAmt, double withdraw) {
		// TODO Auto-generated method stub
		if((this.principalAmt-withdraw)>0)
		{
			this.principalAmt-=withdraw;
			return true;
		}
		else
			return false;
	}

	@Override
	public void deposit(double principalAmt, double valueDeposit) {
		// TODO Auto-generated method stub
		this.principalAmt+=valueDeposit;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return this.principalAmt;
	}

	@Override
	public void addMonthlyInt(double principalAmt) {
		// TODO Auto-generated method stub
		rateOfInterest=12;
		calcInt();
		this.interest=this.interest/12;
		this.principalAmt+=this.interest;
	}

	@Override
	public void addHalfYrlyInt(double principalAmt) {
		// TODO Auto-generated method stub
		rateOfInterest=15;
		calcInt();
		this.interest=this.interest/6;
		this.principalAmt+=this.interest;
	}

	@Override
	public void addAnnualInt(double principalAmt) {
		// TODO Auto-generated method stub
		rateOfInterest=20;
		calcInt();
		this.principalAmt+=this.interest;
	}

}


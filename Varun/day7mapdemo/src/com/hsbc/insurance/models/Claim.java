package com.hsbc.insurance.models;

import java.time.LocalDate;

public class Claim {

	private long claimNo;
	private Vehicle vehicle;
	private long amount;
	LocalDate claimDate;
	
	public Claim(long claimNo, Vehicle vehicle, long amount, LocalDate claimDate) {
		super();
		this.claimNo = claimNo;
		this.vehicle = vehicle;
		this.amount = amount;
		this.claimDate = claimDate;
	}
	public long getClaimNo() {
		return claimNo;
	}
	public void setClaimNo(long claimNo) {
		this.claimNo = claimNo;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public LocalDate getClaimDate() {
		return claimDate;
	}
	public void setClaimDate(LocalDate claimDate) {
		this.claimDate = claimDate;
	}
	@Override
	public String toString() {
		return "Claim [claimNo=" + claimNo + ", vehicle=" + vehicle + ", amount=" + amount + ", claimDate=" + claimDate
				+ "]";
	}
	
	
}

package com.hsbc.insurance.models;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * 
 * @author varungujarathi9
 *
 */

// This class containing details of policy holder
public class PolicyHolder {
	
	// declare variables
	private int policyNum;
	private LocalDate fromDate;
	private LocalDate toDate;
	private String nameOfInsured;
	private Gender gender;
	private Address[] address;
	private LocalDate dateOfBirth;
	private long phoneNum;
	private String emailAddr;
	
	// getters and setters
	public int getPolicyNum() {
		return policyNum;
	}
	public void setPolicyNum(int policyNum) {
		this.policyNum = policyNum;
	}
	public LocalDate getFromDate() {
		return fromDate;
	}
	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}
	public LocalDate getToDate() {
		return toDate;
	}
	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}
	public String getNameOfInsured() {
		return nameOfInsured;
	}
	public void setNameOfInsured(String nameOfInsured) {
		this.nameOfInsured = nameOfInsured;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Address[] getAddress() {
		return address;
	}
	public void setAddress(Address[] address) {
		this.address = address;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public long getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getEmailAddr() {
		return emailAddr;
	}
	public void setEmailAddr(String emailAddr) {
		this.emailAddr = emailAddr;
	}
	@Override
	public String toString() {
		return "PolicyHolder [policyNum=" + policyNum + ", fromDate=" + fromDate + ", toDate=" + toDate
				+ ", nameOfInsured=" + nameOfInsured + ", gender=" + gender + ", address=" + Arrays.toString(address)
				+ ", dateOfBirth=" + dateOfBirth + ", phoneNum=" + phoneNum + ", emailAddr=" + emailAddr + "]";
	}
	
}

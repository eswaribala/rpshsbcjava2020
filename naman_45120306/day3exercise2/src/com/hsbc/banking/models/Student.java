package com.hsbc.banking.models;

public class Student {
	
	private int rollNo;
	private String studName;
	private byte marksInEng;
	private byte marksInMaths;
	private byte marksInScience;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public byte getMarksInEng() {
		return marksInEng;
	}
	public void setMarksInEng(byte marksInEng) {
		this.marksInEng = marksInEng;
	}
	public byte getMarksInMaths() {
		return marksInMaths;
	}
	public void setMarksInMaths(byte marksInMaths) {
		this.marksInMaths = marksInMaths;
	}
	public byte getMarksInScience() {
		return marksInScience;
	}
	public void setMarksInScience(byte marksInScience) {
		this.marksInScience = marksInScience;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studName=" + studName + ", marksInEng=" + marksInEng + ", marksInMaths="
				+ marksInMaths + ", marksInScience=" + marksInScience + "]";
	}
	
	
}

package com.hsbc.banking.models;

import java.io.Serializable;

public class Answer implements Serializable{
	private int answerId;
	private String description;
	public int getAnswerId() {
		return answerId;
	}
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}

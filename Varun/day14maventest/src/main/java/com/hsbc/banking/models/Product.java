package com.hsbc.banking.models;

import java.time.LocalDate;

public class Product {

	private String name;
	private LocalDate dop;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDop() {
		return dop;
	}
	public void setDop(LocalDate dop) {
		this.dop = dop;
	}
	
}

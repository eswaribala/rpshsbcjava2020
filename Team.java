package com.hsbc.banking.models;

public class Team implements Cloneable{

	private String teamName;
	private String ownerName;
	public Team(String teamName, String ownerName) {
		super();
		this.teamName = teamName;
		this.ownerName = ownerName;
	}
	@Override
	public String toString() {
		return "Team [teamName=" + teamName + ", ownerName=" + ownerName + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	};
	
	
	
}

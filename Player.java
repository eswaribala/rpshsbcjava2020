package com.hsbc.banking.models;

public class Player implements Cloneable {

	private String name;
	//associated class
	private Team team;
	public Player(String name, Team team) {
		super();
		this.name = name;
		this.team = team;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Player [name=" + name + ", team=" + team + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//return super.clone();
		//Deep Cloning
		Player playerObj=(Player) super.clone();
		playerObj.team=(Team) team.clone();
	    return playerObj;
		
	}
	
	
	
}

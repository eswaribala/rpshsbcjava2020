package com.hsbc.banking.views;

import com.hsbc.banking.models.Player;
import com.hsbc.banking.models.Team;

public class GameApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Player player1=new Player("Sachin",new Team("Mumbai","Ambani"));
		Player player2,player3,player4,player5=null;
		//cloned the objects
		try {
			player2=(Player) player1.clone();
			player3=(Player) player1.clone();
			player4=(Player) player1.clone();
			player5=(Player) player1.clone();
			player1.setName("Pandey");
			player2.setName("Kohli");
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(player5.toString());
		
	}

}

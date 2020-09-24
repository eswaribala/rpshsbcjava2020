package com.hsbc.banking.utility;

public class ContinueStatement {
	public static void main(String[] args) throws InterruptedException {
		char[] c = {'a','b','c','d','e','f','g','h'};
		for(int i = c.length - 1 ; i > 0; i--) {
			if(i<5) continue;
			System.out.println(c[i]);
			Thread.sleep(1000);
		}
	}
}

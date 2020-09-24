package com.hsbc.banking.utility;

public class VarArgs {
	public static void func(String... c) {
		for(String b:c) {
			System.out.println(b);
		}
	}
	public static void main(String[] args) {
		func("Alpha","Beta","Gamma","Delta");	
	}
}

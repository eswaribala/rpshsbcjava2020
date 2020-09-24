package com.hsbc.insurance.utility;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Ajay");
		ts.add("Mrunal");
		ts.add("Aravind");
		System.out.println(ts);
		NavigableSet<String> ns=ts.descendingSet();
		System.out.println(ns);
		NavigableSet<String> hs=ts.headSet("Aravind", true);
		hs.add("Amol");
		System.out.println(hs);
		System.out.println(ts);
		hs.add("Divya");
		System.out.println(hs);
	}

}

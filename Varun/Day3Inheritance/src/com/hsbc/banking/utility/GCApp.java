package com.hsbc.banking.utility;

import java.util.Random;

public class GCApp {
	private static void createData(){
		long[] dataArray = new long[10000000];
		for(long i=0; i < dataArray.length; i++) {
			dataArray[(int) i] = new Random().nextLong();
		}
	}
	public static void main(String[] args) {
		
		Runtime runtime = Runtime.getRuntime();
		System.out.println(runtime.freeMemory());
		System.out.println(runtime.availableProcessors());
		createData();
		System.out.println(runtime.freeMemory());
		System.out.println(runtime.availableProcessors());
	}
}

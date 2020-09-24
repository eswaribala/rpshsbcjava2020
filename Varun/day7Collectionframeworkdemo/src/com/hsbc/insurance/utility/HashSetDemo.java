package com.hsbc.insurance.utility;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> genNos=new HashSet<Integer>();
		for(int i=0;i<10;i++)
		{
			if(genNos.add(new Random().nextInt(7)))
				System.out.println("No Duplicate");
			else
				System.out.println("Duplicate found and eliminated");
		}
		System.out.println(genNos.size());
	}

}

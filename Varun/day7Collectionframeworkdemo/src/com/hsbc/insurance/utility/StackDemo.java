package com.hsbc.insurance.utility;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> stack=new Stack<Integer>();
		int number=20;
		while(number>0)
		{
			stack.push(number%2);
			number/=2;
		}
		
		System.out.println(stack.size());
		System.out.println(stack.peek());
		for(Integer integer:stack)
		{
		  System.out.print(integer);
		  
		}
		System.out.println("\n");
		System.out.println(stack.size());
		
	}

}

package com.hsbc.insurance.utility;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Natural Ordering
		PriorityQueue<String> pq=new PriorityQueue<String>();
		pq.offer("Vishal");
		pq.offer("Divya");
		pq.offer("Ajay");
		pq.offer("Sahil");
		
		while(!pq.isEmpty())
			System.out.println(pq.poll());
		
		
		
	}

}

package com.hsbc.banking.model;

public class Worker {
  String name;
  Worker(String name)
  {
	  this.name=name;
  }
  void show()
  {
  System.out.println("\n--------------------------");
 
  System.out.println("Employee name : "+name);
  }
}

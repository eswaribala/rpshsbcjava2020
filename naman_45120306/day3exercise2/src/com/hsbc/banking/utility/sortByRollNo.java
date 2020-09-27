package com.hsbc.banking.utility;

import java.util.Comparator;

import com.hsbc.banking.models.Student;

public class sortByRollNo implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return (Integer.valueOf(o1.getRollNo())).compareTo(Integer.valueOf(o2.getRollNo()));
	}

}

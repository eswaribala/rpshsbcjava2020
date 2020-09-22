package com.hsbc.banking.utility;

import java.util.Comparator;

import com.hsbc.banking.models.Student;

public class SortByMarksInMaths implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return (Integer.valueOf(o1.getMarksInMaths())).compareTo(Integer.valueOf(o2.getMarksInMaths()));
	}
	

}

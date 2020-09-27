package com.hsbc.banking.utility;

import java.util.Comparator;

import com.hsbc.banking.models.Student;

public class SortByAvrgMarks implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		int obj1=o1.getMarksInEng()+o1.getMarksInMaths()+o1.getMarksInScience();
		int obj2=o2.getMarksInEng()+o2.getMarksInMaths()+o2.getMarksInScience();
		return (Integer.valueOf(obj1).compareTo(Integer.valueOf(obj2)));
	}

}

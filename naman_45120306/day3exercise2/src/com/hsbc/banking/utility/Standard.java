package com.hsbc.banking.utility;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import com.hsbc.banking.models.Student;

public class Standard {

	private static Student[] studArray;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		studArray=new Student[3];
		for (int i = 0; i < studArray.length; i++) {
			Student student=new Student();
			System.out.println("Enter student " + "details");
			System.out.println("Enter name");
			student.setStudName(scanner.nextLine());
			System.out.println("Enter Marks in Maths");
			student.setMarksInMaths(scanner.nextByte());
			scanner.nextLine();
			System.out.println("Enter Marks in Science");
			student.setMarksInScience(scanner.nextByte());
			scanner.nextLine();
			System.out.println("Enter Marks in English");
			student.setMarksInEng(scanner.nextByte());
			scanner.nextLine();
			student.setRollNo(new Random().nextInt(100));
			studArray[i]=student;

		}

		//printing all student information.
		for(Student s:studArray)
			System.out.println("Student info \n" + s);

		//1. sort wrt rollNo.
		sortRollNo(studArray);
		//2.Display student with highest percentage
		highestPercentage(studArray);
		//3.Display student info who got highest marks in maths
		hishestMarksInMaths(studArray);
		//4.To display the roll no and the name of the student in the ascending order of the total marks in mathematics and science alone.
		sortByMathScienceMarks(studArray);
		//5. To display the roll no, name, total marks, percentage and rank of all the students in the descending order of rank.
		rankInDecOrder(studArray);

	}

	private static void rankInDecOrder(Student[] studArray2) {
		// TODO Auto-generated method stub
		Arrays.sort(studArray2,new SortByAvrgMarks());
		System.out.println("Rank in dec order");
		//printing all student information.
		for(int i=(studArray2.length-1); i>=0;i--)
		{
			System.out.println(studArray2[i]);
		}
	}

	private static void sortByMathScienceMarks(Student[] studArray2) {
		// TODO Auto-generated method stub
		Arrays.sort(studArray2,new SortByMathScience());
		System.out.println("After Sorting by maths and science marks");
		//printing all student information.
		for(Student s:studArray)
			System.out.println("Student info " + s);
		
	}

	private static void hishestMarksInMaths(Student[] studArray2) {
		// TODO Auto-generated method stub
		Arrays.sort(studArray2,new SortByMarksInMaths());
		System.out.println("After Sorting");
		//printing all student information.
		System.out.println("Student with  highest marks in maths " + studArray2[studArray2.length-1]);

	}

	//student with highest percentage
	private static void highestPercentage(Student[] studArray2) {
		// TODO Auto-generated method stub
		Arrays.sort(studArray2,new SortByAvrgMarks());
		System.out.println("student with highest percentage");
		//printing all student information.
		System.out.println("Student info " + studArray2[studArray2.length-1]);
	}


	//sort wrt rollNo.
	private static void sortRollNo(Student[] studArray2) {
		// TODO Auto-generated method stub
		Arrays.sort(studArray2,new sortByRollNo());
		System.out.println("After Sorting");
		//printing all student information.
		for(Student s:studArray)
			System.out.println("Student info " + s);

	}

}

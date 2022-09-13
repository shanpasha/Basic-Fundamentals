package com.practice;

import java.util.Scanner;

public class StudentMarks {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("============Student Marks=================");
		System.out.println("");

		System.out.println("Enter the student name : ");
		String Student_Name = sc.next();
		System.out.println("Enter the group name : ");
		String Group = sc.next();

		String College = "create iq";

		System.out.println("Enter english marks : ");
		int english = sc.nextInt();
		System.out.println("Enter Hindi marks : ");
		int hindi = sc.nextInt();
		System.out.println("Enter maths marks :");
		int maths = sc.nextInt();
		System.out.println("Enter science marks : ");
		int Science = sc.nextInt();
		System.out.println("Enter physics marks : ");
		int physics = sc.nextInt();
		System.out.println("");

		int total_marks = 500;
		double Marks = english + hindi + maths + Science + physics;
		System.out.println("----------------------------------------------");
		System.out.println("-----------------Exam Result---------------------");

		System.out.println("Student_Name : " + Student_Name);
		System.out.println("Group : " + Group);
		System.out.println("College : " + College);
		System.out.println("");
		System.out.println("=========Subjects======== :- ");
		System.out.println("english : " + english);
		System.out.println("hindi : " + hindi);
		System.out.println("maths : " + maths);
		System.out.println("Science : " + Science);
		System.out.println("physics : " + physics);
		System.out.println(" ");

		System.out.println("Marks" + Marks);

		if (english > 35 & hindi > 35 && maths > 35 && Science > 35 && physics > 35) {
			System.out.println("Result : Pass");
		} else {
			System.out.println("Result : Fail");
		}

		System.out.println("");

		double percentage = Marks / 500 * 100;
		System.out.println("percentage : " + percentage);

	}

}

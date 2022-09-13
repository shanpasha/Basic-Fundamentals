package com.ifelsePrograms;
import java.util.Scanner;
public class Enter_student_marks_and_find_percentage_and_grade {
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int telugu,english,maths,chemistry,physics;
		System.out.println("Enter telugu marks");
		telugu=sc.nextInt();
		System.out.println("Enter english marks");
		english=sc.nextInt();
		System.out.println("Enter maths marks");
		maths=sc.nextInt();
		System.out.println("Enter chemistry marks");
		chemistry=sc.nextInt();
		System.out.println("Enter physics marks");
		physics=sc.nextInt();
		int totalmarks=500;
		
float your_marks=telugu+english+maths+chemistry+physics;
		System.out.println("results "+your_marks);
		
	float	percentage=your_marks/totalmarks*100;
	System.out.println("percentage "+percentage);
	
	if(percentage >= 90) {
	System.out.println("Grade A");
	}
	
	else if(percentage >= 80)
	{
		System.out.println("Grade B");
	}
	else if(percentage >= 60)
	{
		System.out.println("Grade c");
	}
	else if(percentage >= 50)
	{
		System.out.println("Grade D");
	}
	else if(percentage >=40) {
	
	System.out.println("Grade E");
	}
	else if(percentage <40) {
		System.out.println("you are Fail");
	
		
	}
}
}

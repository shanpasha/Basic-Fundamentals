package com.ifelsePrograms;
import java.util.Scanner;


public class Check_it_triangle_or_not {
	public static void main(String args []) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the three angles");
		
		int  angle_a=sc.nextInt();
		int angle_b=sc.nextInt();
		int angle_c=sc.nextInt();
		int d=angle_a+angle_b+angle_c;
		if(d==180)
		{
			System.out.println(d+" it is a triangle");
			
		}else
		{
			System.out.println("it is not a triangle");
		}
	}

}

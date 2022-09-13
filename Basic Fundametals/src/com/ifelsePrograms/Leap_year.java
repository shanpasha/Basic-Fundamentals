package com.ifelsePrograms;

public class Leap_year {
	public static void main(String[] args) {
		int year=2024;
		if((year%4==0&&year%100!=0)||(year%400==0)) {
			System.out.println("it is leap year");
		}	else {
			System.out.println("it common year");
		}
	}

}

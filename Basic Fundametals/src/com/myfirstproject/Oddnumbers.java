package com.myfirstproject;

import java.util.Scanner;

public class Oddnumbers {
public static void main(String[]args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter a number check even or odd");
	int a=sc.nextInt();
	int b=2;
	int c=a%b;
	if (c==0) {
		System.out.println("it is even number");
	} else if (c!=0) {
		
		System.out.println("it is odd number");
	}
}
}

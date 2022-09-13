package com.myfirstproject;

import java.util.Scanner;

public class Notepad {

	public static void main(String args[]){

	@SuppressWarnings("resource")
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the first value ");
	int a=sc.nextInt();
	System.out.println("Enter second value ");
	int b= sc.nextInt();

	
	
	System.out.println("Enter a condition");
	System.out.println("Condition 1 A+B");
	System.out.println("Condition 2 A-B");
	System.out.println("Condition 3 AxB");
	System.out.println("Condition 4 A/B");
	System.out.println("Condition 5 A%B");
	int con=sc.nextInt();
if (con==1) {
	System.out.println(a+b);
	
}else if(con==2) {
		System.out.println(a-b);
	}
else if(con==3) {
	System.out.println(a*b);
}	else if(con==4) {
	System.out.println(a/b);
}
else if (con==5) {
	System.out.println(a%b);
}else if (con>=6) {
	
System.out.println("Enter a valid condition");}
	}
}

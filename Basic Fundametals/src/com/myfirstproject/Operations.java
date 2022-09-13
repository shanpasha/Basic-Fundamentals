package com.myfirstproject;

public class Operations {
	static int printAdd(int x,int y) {
		System.out.println("the sum of two numbers is "+(x+y));
		return x+y;
	}
	public static void main(String[] args) {
		int a = 10;
		int b = 25;

		printAdd(a, b);
	}

}

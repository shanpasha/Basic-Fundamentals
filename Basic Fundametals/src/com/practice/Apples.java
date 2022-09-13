package com.practice;

public class Apples {
	public static void main(String[] args) {
		
	
	int numOfApples = 0;
	int numOfCustomers = 0;
	double profit = 0.0;

	System.out.println("you picked 500 apples from an apple store");
	numOfApples = 500;

	System.out.println("time for business! your selling each appl for 40 Rs");
	double price = 40.25;

	System.out.println("one customer walked in, He bought 4 apples");
	numOfApples -= 4;
	numOfCustomers++;
	profit+= 4*40.25;
	
	System.out.println("one customer walked in, He bought 200 apples");
	numOfApples -= 200;
	numOfCustomers++;
	profit+= 200*40.25;
	
	System.out.println("one customer walked in, He bought 20 apples");
	numOfApples -= 20;
	numOfCustomers++;
	profit+= 20*40.25;
	
	
	System.out.println("Wow! so far your made  ₹ "+profit);
	System.out.println(numOfCustomers+ " customers love your apples");
	System.out.println("you have "+ numOfApples+" apples left, we will sell more tomorrow! ");
}
}

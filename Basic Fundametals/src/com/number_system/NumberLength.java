package com.number_system;

public class NumberLength {
	public static void main(String[] args) {
		
		int num=46666558;
		int rem=0;
		int count=0;
		while(num>0) {
			
			rem=num%10;
			count++;
			num=num/10;
			
		}
		System.out.println("The digit of num is "+count);
	}

}

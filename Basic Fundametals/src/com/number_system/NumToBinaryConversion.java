package com.number_system;

public class NumToBinaryConversion {
	public static void main(String[] args) {
		int num=10;
		int rem=0;
		while(num>0) {
			rem=num%2;
			System.out.println(rem);
			num=num/2;
		}
		
	}

}

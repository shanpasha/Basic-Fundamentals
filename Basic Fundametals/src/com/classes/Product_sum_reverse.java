package com.classes;

public class Product_sum_reverse {

	public static void main(String[] args) {
		int num = 365;
		int rem = 0;
		int rev = 0;
		int sum=0;
		int pro=1;
		int temp=num;
		while (num > 0) {

			rem = num % 10;
			rev = (rev * 10) + rem;
			sum=sum+rem;
			pro=pro*rem;
			num = num / 10;
		}
		System.out.println("reverse of a number "+temp+" = " + rev);
		System.out.println("The sum of numbers is "+sum);
		System.out.println(num+"The Product of num"+pro);
	}
	
	
		
}
	
	
	
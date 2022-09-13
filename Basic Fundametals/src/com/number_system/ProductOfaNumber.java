package com.number_system;

public class ProductOfaNumber {
	public static void main(String []args) {
		
		int num=77;
		int pro=1;
		int rem=0;
		
		while(num>0) {
			
			rem=num%10;
			pro=pro*rem;
			num=num/10;
		}
		System.out.println("The product of  given num "+pro);
	}

}

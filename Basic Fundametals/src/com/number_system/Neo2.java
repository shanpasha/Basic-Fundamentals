package com.number_system;

public class Neo2 {
	public static void main(String args[]) {
		
		
		int num=9;
	
	int rem=0;
	int sum=0;
	int temp=num;
	int sqr=num*num;
	while(num>0) {
		
		rem=sqr%10;
		sum=sum+rem;
		sqr=sqr/10;
		
	}
	System.out.println(sum);
		
	}

}

package com.number_system;

public class Neo_number {
	public static void main(String args[]) {
		
		int num=9;
		
		int sqr=num*num;
		int rem=0;
	int	sum=0;
		int temp=num;
		
		while(sqr>0) {
			rem=sqr%10;
			sum=sum+rem;
			sqr=sqr/10;
			
			
			
		}	
	if(temp==sum) {
		System.out.println("The given number is neo");
	}else {
		System.out.println("The given number is not neo ");
	}
		
	
	}
}


package com.number_system;

public class Polydrome {
	public static void main(String args[]) {
		
		int num =367;
		int rem=0;
		int rev=0;
		int temp=num;
		
		while(num>0)  {
			
			
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
			
		}if(rev==temp) {
			System.out.println("Given number is polydrome "+rev);
		}else {
			System.out.println("The given number is not polydrome "+rev);
		}
		
		
		
	}

}

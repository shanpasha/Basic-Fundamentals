package com.number_system;

public class SumofCube {
	public static void main(String[] args) {
		
		int num=537;
		int cube=0;
		int rem=0;
		int sum=0;
		int temp=num;
		
		
		while(num>0) {
			
	rem=num%10;
	cube=rem*rem*rem;
	sum=sum+cube;
	
	num=num/10;
	
			
			
			
		}System.out.println(sum);
		if(temp==sum) {
			System.out.println("both are same");
		}else {
			System.out.println("Both are not same");
		}
	}

}

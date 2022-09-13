package com.number_system;

public class SumofFact {
	
	public static void main(String[] args) {
		
		int num=222;
		int rem=0;
		int fact =1;
		int sum=0;
		
		while(num>0)
		{
			rem=num%10;
			
			for(int i=1;i<=rem;i++) 
			{
				
			fact=fact*i;
			}
				num=num/10;
				sum=sum+fact;
				fact=1;
			}System.out.println(sum);
		}
}



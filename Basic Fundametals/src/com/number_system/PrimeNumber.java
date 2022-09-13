package com.number_system;
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String args[]) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter and Check a Number prime number or not");
		
		int num=sc.nextInt();
		int co=0;
		int count=0;
		int i=0;
		
		co=num/2;
		if(num==0||num==1) {
			
			System.out.println("The given number is not prime number");
		}else {
			for ( i=2;i<=co;i++) {
				if (num%i==0) {
					
			System.out.println("The given number not prime number");
			count=1;
			break;
				}	
				}
				if (count==0) {
					System.out.println("The given number is prime number");}
			
			 
				
			}
		}
	}

	

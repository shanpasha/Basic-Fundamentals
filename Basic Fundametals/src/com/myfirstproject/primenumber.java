package com.myfirstproject;

import java.util.Scanner;

public class primenumber {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
	//	System.out.println("Eenter a number");
		int num=47;
		int i=0;
		int count=0;
		int co=1;
		
		co=num/2;
		if(num==0||num==1) {
			System.out.println("It is not prime number");
			
			}for(i=2;i<=co;i++) {
				
				if(num%i==0) {
					
					System.out.println("it is not prime number");
					
					count=1;
					break;
				}
				
			}if (count==0) {
				
				System.out.println("it is prime number");
			}
		
	
				
			}
		}
	



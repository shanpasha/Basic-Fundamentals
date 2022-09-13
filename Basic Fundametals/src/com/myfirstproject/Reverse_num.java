package com.myfirstproject;

public class Reverse_num {
public static void main(String args) {
		
		int num=526;
		int rev=0;
		int rem=0;
		
		for(int i=1;i<=num;i++) {
			rem=num%10;
			rev=(rev*10)+rem;
			rev=num/10;
			
		}System.out.println(rev);
		

}}

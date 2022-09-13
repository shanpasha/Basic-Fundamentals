package com.practice;

public class digitcount {
public static void main(String[] args) {
	int num=565855996;
	int count=0;
	int rem=0;
	int rev=0;
	int temp=num;
	
	while(num>0) {
		
		rem=num%10;
		rev=(rev*10)+rem;
		count++;
		num=num/10;
	
	}
	System.out.println(rev);
	System.out.println(temp);
	}
}

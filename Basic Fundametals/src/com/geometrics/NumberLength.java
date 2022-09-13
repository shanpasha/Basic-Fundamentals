package com.geometrics;

public class NumberLength {
	public static void main(String []args) {
		int num=785421;
		int rem=0;
		int sum=0;
		int pro=1;
		
		while(num>0) {
		rem=num%10;
		sum=rem+sum;
		pro=pro*rem;
		num=num/10;
		}
		System.out.println(sum);
		System.out.println(pro);
		
	}

}

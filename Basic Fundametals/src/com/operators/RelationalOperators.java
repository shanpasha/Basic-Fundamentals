package com.operators;

public class RelationalOperators {
	public static void main(String []args) {
		//relational operators
		int a=25;
		int b=65;
		 
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		String output=a<b? "a":"b "; 
		System.out.println(output);
		System.out.println(a<b? a:b);
		System.out.println(a>b? a:b);
		System.out.println(a<=b? a:b);
		System.out.println(a>=b? a:b);
		System.out.println(a==b? a:b);
		System.out.println(a!=b? a:b);
		
		
	}

}

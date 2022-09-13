package com.operators;

public class Logical { 
	public static void main (String []args) {
		
		int a=18;
		int b=22;
		int c=2;
		
		int result=((a>b)&&(a>c))?a:((b>a)&&(b>c))?b:c;
		System.out.println(result);
		 
		int ans=((a<b)||(a<c))?a:((b<a||b<c))?b:c;
		System.out.println(ans);
	}

}

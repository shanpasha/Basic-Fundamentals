package com.operators;

public class Ternary_Operators {
	public static void main(String[] args) {
		
		int a=89;
		int b=79;
		int c=89;
		int d=99;
		
		
	 String s=	((a>b)&&(a>c)&&(a>d))?"a is big":((b>a)&&(b>c)&&(b>d))?"b is big":((c>a)&&(c>b)&&(c>d))?"c is big":"d is big";
	
	System.out.println(s);
	
	//	String y=(a>b)?"a is big":"b is big";
		
		//System.out.println(y);
		
		
		
	}

}

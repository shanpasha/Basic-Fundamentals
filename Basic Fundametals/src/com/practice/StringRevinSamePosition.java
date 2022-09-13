package com.practice;

public class StringRevinSamePosition {
	public static void main(String[] args) {

		
		String  s="create iq tech";
	String []s1= s.split("a");
			
	int l=s1.length;
			
	
	for(int i=l-1;i>=0;i--) {
		
	System.out.print(s1[i]);
		}
		System.out.println(" ");
		
	}

}

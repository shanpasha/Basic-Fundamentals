package com.array;

public class StringRev {
	public static void main(String[] args) {
		
		String s="mohammad shan pasha";
	int l=s.length();
		System.out.println(l);
	
		
		 
		char []a=s.toCharArray();
		System.out.println(a);
		System.out.println(a[1]);
		        
		for(int i=l-1;i>=0;i--) {
			
			System.out.print(a[i]);
			
		}
	}

}

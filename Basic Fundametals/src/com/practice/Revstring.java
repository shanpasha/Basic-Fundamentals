package com.practice;

public class Revstring {
	public static void main(String[] args) {
		
		String s="shan pasha";
		
		String [] s1=s.split(" ");
		
		int l=s1.length;
		
		for(int i=0;i<l;i++) {
			
			char []ch=s1[i].toCharArray();
			
		int l2=ch.length;
					
			
			for ( int j=l2-1;j>=0;j--) {
				
				
				System.out.print(ch[j]);
			}
			
			
			
		}
	}

}

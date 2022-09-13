package com.array;

public class StringArray {
	public static void main(String[] args) {
		
		String s="shan mohammad pasha ";
		
		String [] sh=s.split(" ");
		
	
		int l=sh.length;
		System.out.println(l);
		for(int i=0;i<l;i++) {
			
			System.out.println(sh[i]);
			
		}for (int i=l-1;i>=0;i--) {
			
			System.out.println(sh[i]);
			System.out.println(sh[i].length());
			
			
		}
		
	
		
	}
	
	

}

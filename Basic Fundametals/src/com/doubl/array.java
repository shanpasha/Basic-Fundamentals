package com.doubl;

public class array {
	public static void main(String args[]) {
		
		
		int a[] = new int[] {1, 2, 3, 4, 5};
		int a1[] = new int[a.length];
		
		for (int i = 0; i < a.length; i++) 
			
				a1[i] = a[i];
			System.out.println("original vlaue");
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[i] + " ");}
			
   ///System.out.println();
			
			System.out.println("new array value");
			for (int i = 0; i < a1.length; i++) {
				System.out.println(a1[i] + " ");}
			}
		}
	

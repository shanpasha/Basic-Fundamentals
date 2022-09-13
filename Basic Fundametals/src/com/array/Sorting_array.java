package com.array;

import java.util.Arrays;

public class Sorting_array {
public static void main(String[] args) {
	
	
	int num[]= {25,89,78,45,69,85,21,26,24};
	int i=0;
	Arrays.sort(num);
System.out.println("acending order: ");
	for ( i=0 ;i<num.length;i++) {
		
		System.out.print(num[i]+" ");
		System.out.println("");
		
	}
	
	
	System.out.print("--------Decending order---------------");
	System.out.println("");
	
	for( i=num.length-1;i>=0;i--) {
	
		
	System.out.println(num[i]+" ");
	}
	
	
}}


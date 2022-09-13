package com.array;

public class Reverse_dynamic_num_Array {
public static void main(String[] args) {
	
	int []a= {1,2,3,4,5};
//System.out.println(a);
	int l=a.length;
	for (int i=0;i<l;i++) {
		
		System.out.print(a[i]);
	}
	
	System.out.println("   ");
	
	for(int i=l-1;i>=0;i--) {
		System.out.print(a[i]);
	}
}
}

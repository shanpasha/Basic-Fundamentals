package com.number_system;

public class Fibnosis {
	public static void main(String args[]) {
		
		
		int l=0;
		int m=0;
		int k=0;
		for (int i=1;i<=18;i++){
			k=l+m;
			System.out.println(k);
			l=m;
			m=k;
			
			
		}
	}

}

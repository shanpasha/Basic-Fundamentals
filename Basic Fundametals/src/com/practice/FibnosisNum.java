package com.practice;

public class FibnosisNum {
	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int series=0;
		
		
		for(int i=0;i<=18;i++) {
			
			series=a+b;
			System.out.println(series);
			a=b;
			b=series;
			
		}
	}

}

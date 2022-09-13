package com.MethodsWithBasicPrograms;

public class Thirdangle {
//	c = 180 - (a + b)
	public int Thirdangle(int a, int b) {
		
		int c=180-(a+b);
		
		System.out.println("The third angle is :"+c);
		return c;
	}
	
	public static void main(String args[]) {
		
		
		Thirdangle angle=new Thirdangle();
		
		angle.Thirdangle(60, 80);
	}

}

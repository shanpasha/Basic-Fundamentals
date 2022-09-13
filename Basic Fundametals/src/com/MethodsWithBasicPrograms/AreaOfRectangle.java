package com.MethodsWithBasicPrograms;

public class AreaOfRectangle {
	
	public double area (double  length, double width) {
		
	double a=length*width;
	
	System.out.println("area of rectanle : "+a+ "sq units");
	return a;
		
	}
	
	


public static void main (String []args) {
	
	AreaOfRectangle a =new AreaOfRectangle();
	
a.area(5, 10);
	
	
}
}
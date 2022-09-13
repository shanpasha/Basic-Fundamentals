package com.MethodsWithBasicPrograms;

public class Diameter {
	// diameter = 2 * radius
//	circumference = 2 * 3.14 * radius
//	area = 3.14 * radius * radius

	public void diameter(double radius) {

		double dia = 2 * radius;
		double circumference = 2 * 3.14 * radius;
		double area = 3.14 * radius * radius  ;
		
		System.out.println("Diameter     :"+dia+" units");
		System.out.println("circumferece :"+Math.abs(circumference)+" units");
		System.out.println("area         :"+area+" sq units");
		
	}

	public static void main(String[] args) {
		
		Diameter f=new Diameter();
		
		f.diameter(10);

	}
}

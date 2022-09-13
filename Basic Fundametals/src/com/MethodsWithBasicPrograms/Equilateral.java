package com.MethodsWithBasicPrograms;

public class Equilateral {
//	area = (sqrt(3) / 4) * (side * side)
	public double area(double side){
		
		double area=(Math.sqrt(3)/4)*(side*side);
		
		System.out.println("Area of Equilateral triangle :"+area+" sq.units");
		return area;
		
	}
public static void main(String[] args) {
	
	Equilateral areaOftriangle=new Equilateral();
	 areaOftriangle.area(10);
	
	
}
}

package com.MethodsWithBasicPrograms;

public class AreaofTriangle {
//	area = (base * height) / 2
	public int area (int base ,int height ) {
		
		int area=(base*height)/2;
		
		System.out.println("Area of Triangle :"+area+" sq.units");
		return area;
		

	}	
	public static void main(String[] args) {
		AreaofTriangle area=new AreaofTriangle();
		
		area.area(10, 15);
		
	}
		
		
		
		
	
	

}

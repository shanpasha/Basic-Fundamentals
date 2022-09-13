package com.ifelsePrograms;

public class Triangle_is_valid_or_not_if_sides_are_given {
	public static void main(String args [])
	{
	 int side1=7;
	 int side2=10;
	 int side3=88;
	 if(side1+side2>side3) {
		 
		 if (side1+side3>side3) {
			 
			 
			 if (side2+side3>side1) {
				 System.out.println("triangle is valid");
				 
			 }else {
				 System.out.println("triangle not valid");
			 }
			 
		 }else {
			 System.out.println("triangle not valid");
		 }
		 
	 }else {
		 System.out.println("triangle not valid");
		 
	 }
		
	}

}

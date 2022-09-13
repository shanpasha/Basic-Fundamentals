package com.MethodsWithBasicPrograms;

public class Fahrenheit {
	
//	fahrenheit = (celsius * 9 / 5) + 32
	
	public float f(float celsius) {
		
		
		float fr=(celsius*9/5)+32;
		System.out.println(fr+ " F");
		return fr;
	}
	
	public static void main(String[] args) {
		
		Fahrenheit celcius=new Fahrenheit();
		celcius.f(55);
		
	}

}

package com.geometrics;
public class Interest_calulation {

	public static void main(String [] args) {
		
		int amount=50000;
		int time=12;
		double interest=1.5;
		double si=amount*time*interest/100;
		System.out.println("simple interest "+si);
		
	double	CI=amount*Math.pow(1+interest/100, time);
	System.out.println(CI);
		
	}

}

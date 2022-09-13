package com.geometrics;

public class For_loop_power_of_number {
public static void main(String[] args) {
	int base=5;
	int expo=3;
	int result=1;
	for(int i=1;i<=expo;i++) {
	result=result*base;
	}
	System.out.println("power of " +base+" is "+result);
	}
	
}


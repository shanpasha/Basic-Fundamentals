package com.myfirstproject;

public class Neastedif3 {
	public static void main(String []args) {
		int num=122;
		if (num%2==0) {
			System.out.println("Given number even");
			if (num>20&&num<50) {
				System.out.println("Given number greater than 20");
			
			}else if(num<20) {
				System.out.println("given number below 20");
			}else if (num<50){
				System.out.println("Given number less than 50");}
			else
				System.out.println("Given number above 50");
		}else {
			System.out.println("Given number odd ");
		}
	}

}

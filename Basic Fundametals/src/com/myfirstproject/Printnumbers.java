package com.myfirstproject;

import java.util.Scanner;

public class Printnumbers {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
	
	
int n =sc.nextInt();
		for(int i=0;i<=n;i++) {
	//		System.out.println(i);
			if(i%2!=0) {
				System.out.println(i);
			}
		}
		

}
}
package com.Loops;

public class Starpattern {

	public static void main(String[] args) {
		
		for(int i=1;i<=6;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(j);
			}System.out.println("");
		}
		
		System.out.println("");
		for (int i=6; i>=1;i--) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(j);
			}
			System.out.println("");
			
		}
	}
}

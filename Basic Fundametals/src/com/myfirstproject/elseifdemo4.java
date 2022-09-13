package com.myfirstproject;

public class elseifdemo4 {
	public static void main(String[] args) {
		int age = 77;
		if (age < 18) {
			System.out.println("you are too young");
		} else if (age >= 18 && age <= 30) {
			System.out.println("You are young");
		} else if (age > 30 && age <= 40) {
			System.out.println("You are in middle age");
		} else if (age > 40 && age <= 50) {
			System.out.println("You are old");
		} else if (age > 50) {
			System.out.println("you are too old");
		}

	}
}

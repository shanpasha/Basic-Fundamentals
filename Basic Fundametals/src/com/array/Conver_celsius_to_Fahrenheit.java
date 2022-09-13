package com.array;

public class Conver_celsius_to_Fahrenheit {
	public static void main(String[] args) {
		// °F = (C×9/5)+32

		double celcious[] = {100, 35, 35.5, 37.5, 42.5, 56.7 };

		for (int i = 0; i < celcious.length; i++) {

			double f = (celcious[i] * 9 / 5) + 32;
			System.out.println(f + " F");

		}

	}

}

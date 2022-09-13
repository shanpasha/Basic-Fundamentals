package com.operators;

public class WeekdaysWithTernaryOperators {
	public static void main(String[] args) {

		int weekday = 3;
		String result = ((weekday == 1) ? "monday"
				: (weekday == 2) ? "thuesday"
						: (weekday == 3) ? "wednesday"
								: (weekday == 4) ? "thursday"
										: (weekday == 5) ? "Friday"
												: (weekday == 6) ? "Saturday"
														: (weekday == 7) ? "sunday" : "Enter a volid weekday num");

		System.out.println(result);
	}

}

package com.MethodsWithBasicPrograms;

public class DaystoYears {
//	year = days / 365
//	week = (days - (year * 365)) / 7
	
	
	
	public void years(int days) {
	
		int year=days/365;
		int week=(days-(year*365))/7;
		days = days - ((year * 365) + (week * 7));
		
		System.out.println("Year :"+year);
		System.out.println("weeks :" +week);
		System.out.println("Days :"+days);
	}
	public static void main(String[] args) {
		
	DaystoYears call=new DaystoYears();
	call.years(499);
		
	}

}

package com.geometrics;

public class Logic_to_convert_days_years_weeks_and_days {
	public static void main(String [] args){
		//formula 
		//year=days/365
		//week=(days-(year*365))/7
		//days=days-((year*365)+(week*7))
		
		int days=999;
		
		int year=days/365;
		
		int weeks=(days-(year*365))/7;
		days=days-((year*365)+(weeks*7));
		
		System.out.println(year+" years");
		System.out.println(weeks+" weeks");
		System.out.println(days+" days");
		
		System.out.println(year+" years"+" "+weeks+" weeks"+" "+days+" days");
		

}


}
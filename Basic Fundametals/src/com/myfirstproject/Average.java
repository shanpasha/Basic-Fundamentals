package com.myfirstproject;

public class Average {
	public static void main(String args[]) {
		int telugu,english,maths,science,hindi;
		telugu=55;
		english=68;
		maths=55;
		science=35;
		hindi=45;
		  double total=telugu+english+maths+science+hindi;
		double average=total/5;
		double percentage=(total/500)*100;
		
		
		System.out.println(total);
		System.out.println(average);	
		System.out.println(percentage);
	}

}

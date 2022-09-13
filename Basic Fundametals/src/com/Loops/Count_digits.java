package com.Loops;

public class Count_digits {
	public static void main(String[] args) {
		
	
	
	long num=123456789;
	
	int count=0;
		
	do {	
		count++;
		
		num=num/10;
		
	
	}
	 while(num!=0) ;
	 
		 
		 
		 System.out.println("digits are "+ count);
	 

}
}
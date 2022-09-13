package com.classes;

public class Sum_of_number {
	public static void main(String [] args) {
		//logic sum=rem+sum;

		int num=526;
		int sum=0;
		int rem=0;
		while(num>0) {
			
			rem=num%10;
			sum=rem+sum;
			num=num/10;
			

		}System.out.println(sum);


}
}
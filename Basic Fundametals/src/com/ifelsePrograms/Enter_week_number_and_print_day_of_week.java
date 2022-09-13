

package com.ifelsePrograms;
import java.util.Scanner;

public class Enter_week_number_and_print_day_of_week {
	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter_week_number");
		int a=sc.nextInt();
		if (a==1) {
			System.out.println("Monday");
			
		}else if(a==2) {
			
			System.out.println("Tuesday");
		}
		else if (a==3)
		{
			System.out.println("wednesday");
		}
		else if(a==4)
		{
			System.out.println("thursday");
		}
		else if(a==5)
		{
			System.out.println("Friday");
		}
		else if (a==6)
		{		
			System.out.println("Satuerday");
		}
		else if (a==7) {
			
			System.out.println("Sunday");
		}else {
			System.out.println("Invalid input enter the number 1 to 7");
		}
	}

}

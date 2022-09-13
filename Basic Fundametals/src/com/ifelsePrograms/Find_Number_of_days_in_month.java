package com.ifelsePrograms;
import java.util.Scanner;

public class Find_Number_of_days_in_month {
	public static void main(String args[]) 
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a month number");
	int month=sc.nextInt();
	
	if(month==1)
	{
		System.out.println("January it contains 31 days");
	}
	else	if(month==2)
	{
		System.out.println("February it contains 28 /29days");
	}
	else if(month==3)
	{
		System.out.println("march it contains 31 days");
	}
	else if(month==4)
	{
		System.out.println("apirl it contains 30 days");
	}
	else if(month==5)
	{
		System.out.println(" may it contains 31 days");
	}
	else if(month==6)
	{
		System.out.println(" june it contains 30days");
	}
	else if(month==7)
	{
		System.out.println(" july it contains 31 days");
	}
	else if(month==8)
	{
		System.out.println(" Augest it contains 31 days");
	}
	else if(month==9)
	{
		System.out.println(" September it contains 30 days");
	}
	else if(month==10)
	{
		System.out.println(" october it contains 31 days");
	}
	else if(month==11)
	{
		System.out.println(" november it contains 30 days");
	}
	else if(month==12)
	{
		System.out.println(" December it contains 31 days");
	}
	{
		System.out.println(" invalid input enter month 1 to 12");
	}
	}

}

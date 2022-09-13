package com.myfirstproject;
import java.util.Scanner;

public class Ifelse1 {

	public static void main(String[] args) {
@SuppressWarnings("resource")
Scanner sc = new 	Scanner(System.in);
System.out.println("Enter the first value ");
long a=sc.nextLong();
System.out.println("Enter the second value");
long b= sc.nextInt
();
System.out.println("choose one condition");
System.out.println("condition 1 A+B");
System.out.println("condition 2 A-B");
System.out.println("condition 3 A*B");
System.out.println("condition 4 A/B");

int con=sc.nextInt();


if(con==1)
{
	System.out.println(a+b);}
else if (con==2) {
	System.out.println(a-b);

}

else if (con==3) {
	System.out.println(a*b);}
else if (con==4) {
	System.out.println(a/b);
	
}
else if(con>=10) {
	System.out.println("enter a vaild condition");}
}

}




	



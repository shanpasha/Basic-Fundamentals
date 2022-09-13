package com.classes;

public class Polydrome {

public static void main(String [] args) {
	
//logic rev=(rev*10)+rem;
	
int num=655;
int rem=0;
int rev=0;
int temp=num;
while(num>0) {
	
	rem=num%10;
	rev=(rev*10)+rem;
	num=num/10;
}
System.out.println(rev);

if(temp==rev)
{
	System.out.println("The number is Polydrome");
}else {
	System.out.println("The number is not Polydrome");
	
}





}
}

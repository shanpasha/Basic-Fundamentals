package com.Loops;

public class Prime_number {
public static void main (String []args) {
	int num=0;
	int count=0;
     int i=0;
     
     int co=num/2;
     
     if (num==1||num==0) {
    	 
    	 System.out.println("it is not prime number ");
    		 
     }else {
     
     
     
     for (i=2;i<=co;i++) {
    	 if (num%i==0) {
    		 System.out.println("it is not prime number");
    		 
    		count=1;
    		break;
    	 } 
     } 
    	 
     if (count==0) {
   	System.out.println("It is prime number ");
    		
    	 }
    	 
    	 
     
	
     }
}


}

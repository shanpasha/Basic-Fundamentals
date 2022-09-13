package com.array;

public class Searching_of_Element 
{
	public static void main(String[] args)
	{
		
		int numbers	[]= {45,35,78,62,89,7,85,8};
		
		int element=62;
		int temp = 0;
		int index=0;
		
		
		for (int i = 0; i < numbers.length; i++) {
			index=i+1;

			if (element == numbers[i]) {
				
				temp = numbers[i];
				
    		  System.out.println("it is in the list "+temp+" "+"at position of "+index+"th");
    	  }
      } 	  
    	  if(element!=temp){
    		  System.out.println("it is not in the array list");
    	  }
     }
}
package com.array;

public class Find_min_and_max_num_of_array {
	public static void main(String[] args) {
		
		int [] num= {25,58,14,17,7,85,96,17,99};
		
		int max=num[0];
		
		for(int i=0;i<num.length;i++) {
			
			if(num[i]>max) {
				
				max=num[i];
				
			}
			
			
		}System.out.println("The maximum number is:"+max);
		
		int [] numarray= {25,58,14,17,7,85,96,17,99};
		
	int 	min=numarray[0];
	
	for (int i=0;i<numarray.length;i++) {
		
		if (numarray[i]<min) {
			
			min=numarray[i];
			
		}
		
	}System.out.println("The minimum number is :"+min);
		
		
		
	}
}
package com.array;

public class Sort_of_array_with_forloop {
	public static void main(String[] args) {
		
	int [] num= {65,25,78,2,79,9,3,69,44,56,77,36};
	
	for (int i=0;i<num.length;i++) {
		
		for(int j=i+1;j<num.length;j++) {
			
			if (num[i]>num[j]) {
				int temp=0;
				temp=num[i];
				num[i]=num[j];
				num[j]=temp;
			}
			
		}
	}
	for(int i=0;i<num.length;i++) {
		
		System.out.println(num[i]);
	}
	
	
		
	}

}

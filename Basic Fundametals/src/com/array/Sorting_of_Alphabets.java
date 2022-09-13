package com.array;

public class Sorting_of_Alphabets {
	public static void main(String[] args) {
		
		char [] ch= {'c','d','a','t','z','l'};
		
		
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				
				if(ch[i]>ch[j]) {
					
					char temp=0;
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
					
				}
			}
			
		}
		for(int i=0;i<ch.length;i++) {
			
			System.out.println(ch[i]);
		}
		
	}
}

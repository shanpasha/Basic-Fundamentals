package com.array;

import java.io.IOException;
import java.util.Scanner;

public class Notes_count {
	public static void main(String[] args) throws IOException
	{
		
		Scanner sc =new Scanner(System.in);
		
	int notes[]= {2000,1000,500,200,100,50,20,10,5,1};
	int withdraw=589;
	int temp=withdraw;
	int count=0;
	for (int i=0;i<notes.length;i++) {
		count=withdraw/notes[i];
		
		if(count!=0) {
		System.out.println(notes[i]*count);
		
		
	}
		
	
	
	
	
	
		
		
		
	}

	}
}
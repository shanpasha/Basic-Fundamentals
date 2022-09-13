package com.matrix;

import java.util.Scanner;

public class MatrixCreation {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	
	System.out.println("Enter row size");
	
	int row=sc.nextInt();
	System.out.println("enter columns");
	int col=sc.nextInt();
	
	int mat[][]=new int[row][col];
	
	System.out.println("enter matrix values");
	
	for (int i=0;i<row;i++) {
		
		for(int j=0;j<col;j++) {
			
		mat[i][j]=sc.nextInt();
		
	}
					
	}

	for(int i=0;i<row;i++) {
		for (int j=0;j<col;j++) {
			
			System.out.print(mat[i][j]+" ");
		}
		System.out.println(" ");
		
	}
	
	
	
	
}
}

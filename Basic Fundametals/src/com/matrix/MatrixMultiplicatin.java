package com.matrix;

import java.util.Scanner;

public class MatrixMultiplicatin {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first  matrix  rows");
		int row = sc.nextInt();
		System.out.println("Enter coloums");
		int col = sc.nextInt();
		int[][] matA = new int[row][col];
//creating first matrix
		
		System.out.println("enter the values in first matrix ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {

				matA[i][j]=sc.nextInt();
				
				
			}

		}
//		creating second matrix
		System.out.println("Enter the second matrix rows");
		
		int row2=sc.nextInt();
		System.out.println("Enter the colums");
		int col2=sc.nextInt();
		int [][]matB=new int [row2][col2];
		
		System.out.println("Enter the values in matrix"); 					
		
		for(int i=0;i<row2;i++) {
			
			for(int j=0;j<col2;j++) {
				
				matB[i][j]=sc.nextInt();
				
	
			}
		}
		
		
		int sum=0;
		int matC[][]=new int[row][col2];
		
		for(int i=0;i<row;i++)
		{
			for (int j=0;j<col2;j++) {
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
		}
		
		
		
		
		
		
		
	}

}

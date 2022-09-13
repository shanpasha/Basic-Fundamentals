package com.matrix;

import java.util.Scanner;

public class MatrixAddition {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		
		
		int rows=sc.nextInt();
		System.out.println("enter column");
		int col=sc.nextInt();
		int [] [] matA=new int [rows] [col];
		
		System.out.println("Enter second row ");
		
		int row2=sc.nextInt();
		System.out.println("Enter second col");
		int col2=sc.nextInt();
		
		int [][] matB=new int [row2] [col2];
		//first matrix insertion
		
		System.out.println("enter first matrix value");
		for(int i=0;i<rows;i++) {
			
			for (int j=0;j<col;j++) {
				
				matA[i][j]=sc.nextInt();	
			}
		}
		
			System.out.println("enter second matrix value");
			//second matrix insertion
			for (int i=0;i<row2;i++) {
				
				for(int j=0;j<col2;j++) {
					
					matB [i] [j]=sc.nextInt();
					int[] temp=matB[j];
				}
				
				
				
		}
			
		//addition of matrix
			
			int matc[] []=new int[rows][col];
			
		for(int i=0;i<rows;i++) {
			
			for(int j=0;j<col;j++) {
				
				matc[i][j]=matA[i][j]+matB[i][j];
				
				
				
			}
		}
		// result of matA+matB=Matc
		
		for(int i=0;i<rows;i++) {
			
			
			for(int j=0 ;j<col;j++) {
				
				
				System.out.print(matc[i] [j] +" ");
				
			}
			System.out.println(" ");
		}

				
	
		
		
		
		
		
		
	}

}

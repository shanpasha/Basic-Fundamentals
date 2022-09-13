package com.array;

public class ArrayWithAllDatatypes {
	public static void main(String[] args) {
		
		float number[] =new float [5];
		
		number[0] = 20.5f;
		number [1]=21.3f;
		number [2]=20.25f;
		number[3]=22.2f;
		number[4]=22.6f;
		
		for (int i=0;i<5;i++) {
			
			System.out.println(number[i]);
		}
		System.out.println(" ");
		
		long num[] =new long[5];
		
		num[0]=12345678910l;
		num[1]=12345678911l;
		num[2]=12345678912l;
		num[3]=12345678913l;
		num[4]=12345678914l;
		
		System.out.println("");
		
		for (int i=0;i<5;i++) {
			System.out.println(num[i]);
			
		}
		System.out.println("");
			
			String [] citys=new String [5];
			
			
			citys [0]="karimnagar";
			citys [1]="hyderabad";
			citys [2]="warngal";
			citys [3]="peddapalli";
			citys [4]="rangareddy";
			
			for (int i=0;i<5;i++) {
				System.out.println(citys[i]);
				
				
				
	}
			System.out.println("");
			
			double [] decimal=new double[5];
			
			decimal[0]=12.123456789123;
			decimal[1]=12.1234987456;
			decimal[2]=12.123456654123d;
			decimal[3]=12.45678925643d;
			
			decimal[4]=12.456987456126d;
			
			for(int i=0;i<5;i++) {
				
				System.out.println(decimal[i]);
			}
			System.out.println("");
			char ch[]=new char[5];
			
			ch[0]='a';
			ch[1]='b';
			ch[2]='c';
			ch[3]='d';
			ch[4]='c';
			for(int i=0;i<5;i++) {
				System.out.println(ch[i]);
				
			}
			
					
		
		
		
	}

}

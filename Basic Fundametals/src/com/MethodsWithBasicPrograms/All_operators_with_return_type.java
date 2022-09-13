package com.MethodsWithBasicPrograms;

public class All_operators_with_return_type {
	
	//with return type and with parameter
	
	public int sum(int a, int b) {
		
		int c=a*b;
		
		System.out.println("sum of two num :"+c);
		return c;
	
	}
	
	
	public int  sup(int a,int b) {
		
		int c=a-b;
		System.out.println("sup:"+c);
		return c;
		
	}
	
	
	public int multi(int a,int b) {
		int c=a*b;
		System.out.println("multi :"+c);
		return c;
		
	}
	public int module(int a,int b) {
		
		int c=a%b;
		System.out.println("module :"+c);
		return c;
	}
	
		public int div (int a,int b) {
			
			int c=a/b;
			 System.out.println("div :"+c);
			return c;
		
		 
	}
	
	
	
	static void main(String[] args) {
		
		
		All_operators_with_return_type addition=new All_operators_with_return_type();
		addition.sum(4, 5);
	
		addition.sup(5, 4);
	addition.multi(2, 3);
	addition.module(8, 2);
	addition.div(5, 2);
	
	}
	

}

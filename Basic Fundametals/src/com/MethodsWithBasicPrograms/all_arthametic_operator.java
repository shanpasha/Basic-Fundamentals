package com.MethodsWithBasicPrograms;

public class all_arthametic_operator {
	
	
	public void  all_arthametic_operator (int a,int b) {
		// without return type with parameter
		int c=a+b;
		System.out.println("sum :"+c);
		int d=a*b;
		System.out.println("multiplication:"+d);
		int sup=a-b;
		System.out.println("sup :"+sup);
		int div=a/b;
		System.out.println("div :"+div);
	int module=a%b;
		
	System.out.println("module :"+module);
		
	
	}
	public static void main(String[] args) {
		
		all_arthametic_operator add=new all_arthametic_operator()	;	
				
		add.all_arthametic_operator(56, 44);
	
	
	}
	
}

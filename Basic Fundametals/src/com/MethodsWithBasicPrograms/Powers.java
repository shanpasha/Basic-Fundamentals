package com.MethodsWithBasicPrograms;

public class Powers {
	
	public void power(int base,int pow) {
		
		int result=1;
		for(int i=1;i<=pow;i++) {
			
			result=base*result;
		}
			System.out.println(result);
		}
	public static void main(String[] args) {
		
		Powers pow=new Powers();
		
		pow.power(5, 4);
	}
		
		
	}


package com.ifelsePrograms;

public class Ifelse2 {
	public static void main(String []args) {
		
		int a=133;
		int b=78;
		int c=102;
		if(a>b&&a>c) {
			System.out.println("The maxmum value "+a);
		}else if(b>c&&b>a) {
			System.out.println("The maxmum value "+b);
		}else if(c>a&&c>b) {
			System.out.println("the maximum value"+c);
		}
	}

}

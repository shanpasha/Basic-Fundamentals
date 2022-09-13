package com.operators;

public class Logical4 {
	public static void main(String [] args) {
		int a , b, c,d,result;
		a=55;
		b=48;
		c=60;
		d=46;
		result=((a>b)&&(a>c))?a:((b>c))&&((b>a))?b:((a>d)&&(b>d))?c:d;
		System.out.println(result);
	}

}

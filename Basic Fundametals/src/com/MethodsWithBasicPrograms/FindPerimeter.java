package com.MethodsWithBasicPrograms;

public class FindPerimeter {

	//	perimeter = 2 * (length + width)
	
	//without return type and with parameters
		
		 void perimeter (double length ,double width) {
			 
			 double per=2*(length+width);
			
			System.out.println("perimeter :"+per);
			
		}
		
	
	public static void main(String[] args)
	{
		
		FindPerimeter p=new  FindPerimeter();
		
		p.perimeter(5, 10);
		
	}
	
}

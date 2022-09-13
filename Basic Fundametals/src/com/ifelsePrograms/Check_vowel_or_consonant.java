package com.ifelsePrograms;

public class Check_vowel_or_consonant 
{
	public static void main(String [] args )
	{
		char alphabet='h';
		if(alphabet=='a'||alphabet=='e'||alphabet=='i'||alphabet=='o'||alphabet=='u'||
				alphabet=='A'||alphabet=='E'||alphabet=='I'||alphabet=='O'||alphabet=='U')
		{
		System.out.println("it is ovel");
				}
		else if (alphabet>='a'&&alphabet<='z'||alphabet>='A'&&alphabet<='z')
		{
		  System.out.println("it is consonent");
				}else 
				{
			  System.out.println("it is alphabet");
			  }
		
	}
			
		}

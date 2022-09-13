package com.array;

public class Removing_space_inString {
	public static void main(String args[])
	{
		String s="shan pasha shannnu";
		String [] s1=s.split("a");
		int l=s1.length;
		for(int i=0;i<l;i++) {
			
			char[] ch=s1[i].toCharArray();
		int l2=ch.length;
		for(int j=0;j<l2;j++) {
		System.out.print(ch[j]);
			
		}
		
	}
}
}
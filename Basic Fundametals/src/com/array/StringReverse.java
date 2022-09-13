package com.array;

public class StringReverse {
	public static void main(String[] args) {
		
		String s="shan mohammad pasha";
		char[] s1=s.toCharArray();
		String [] s2=s.split(" ");
int		l2=s2.length;
		
		
int 	l=s1.length;
	
for(int i=l-1;i>=0;i--) {
	
	System.out.print(s1[i]);
	
}

System.out.println(" ");
for (int i=l2-1;i>=0;i--) {
	
	System.out.print(s2[i]);
	System.out.print(" ");
}
	

		
	}

}

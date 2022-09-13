
package com.practice;

public class StringRevses {
	public static void main(String[] args) {
		
		String s="shan pasha mohammad";
		
		String [] s1=s.split(" ");
		int l =s1.length;
		for(int i=0;i<l;i++) {
			System.out.println(s1[i]);
		}
int ss=s.length();
	
for(int i=ss-1;i>=0;i--) {
	
	System.out.println(s1[i]);
	
}
		
		for(int i=l-1;i>=0;i--) {
			
			System.out.println(s1[i]);
		}
		
		
		
	}

}

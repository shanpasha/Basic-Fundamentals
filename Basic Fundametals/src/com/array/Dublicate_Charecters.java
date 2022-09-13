package com.array;

public class Dublicate_Charecters {
	public static void main(String[] args) {
		String s="create iq tech";
	int 	s1=s.length();
		
		char [] ch=s.toCharArray();
		
		
	for(int i=0;i<s1;i++) {
		
		for (int j=i+1;j<s1;j++) {
			
			if (ch[i]==ch[j]) {
				
				System.out.print(ch[i]);
			}
			
			
		}
			
			
		}
	}
		
		
	}



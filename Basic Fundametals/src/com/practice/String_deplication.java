package com.practice;

public class String_deplication {
	public static void main(String[] args) {
		
		String s="create iq tech";
		char [] ch=s.toCharArray();
	int l=	ch.length;
	for (int i=0;i<l;i++) {
	
	for(int j=i+1;j<l;j++) {
		if (ch[i]==ch[j]) {
			
			System.out.print(ch[j]);
		}
		
	
		
				
	
		
	}

}
}
}
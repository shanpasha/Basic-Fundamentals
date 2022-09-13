package com.ifelsePrograms;

public class A_character_is_Uppercase_or_Lowercase {
	public static void main(String args[]) {

		char ch = 'a';
		if (ch <= 'A' &ch <= 'Z') {
			System.out.println(ch + "  is upper case alphabet");}
		else	if (ch <= 'a' && ch <= 'z') {
				System.out.println(ch + " is is lower  case alphabet ");
			}else {
				System.out.println("it is not alphabet");
			}
		}

	}



package com.practice;

import com.array.StringtoStringArraytoCharArray;

public class String_ {

	public static void main(String[] args) {

		String s = "Shan pasha shannu";
		String[] s1 = s.split(" ");
		int l = s1.length;
		for (int i = 0; i < l; i++) {

			char[] ch = s1[i].toCharArray();

			int l1 = ch.length;

			for (int j = l1 - 1; j >= 0; j--) {

				System.out.print(ch[j]);
			}
			System.out.print(" ");

		}

	}
}

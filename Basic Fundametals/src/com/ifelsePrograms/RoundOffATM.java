package com.ifelsePrograms;

public class RoundOffATM {
	public static void main(String args[])

	{
		int amount = 1000;
		int note = 0;
		if (amount >= 500) {
			int note500 = amount / 500;
			amount = amount - (note500 * 500);
			System.out.println("notes 500 X "+ note500 );

		}
		if (amount >= 200) {
			int note200 = amount / 200;
			amount = amount - (note200 * 200);
			System.out.println("notes 200 " + note200);
		}
		if (amount >= 100) {
			int note100 = amount / 100;
			amount = amount - (note * 100);
			System.out.println("notes 100 " + note100);

		}
		if (amount >= 50) {
			int note50 = amount / 50;
			amount = amount - (note * 50);
			System.out.println("note 50 " + note50);

		}
		if (amount >= 20) {
			int note20 = amount / 20;
			amount = amount - (note20 * 20);
			System.out.println("note 20 " + note20);
		}
		if (amount >= 10) {
			int note10 = amount / 10;
			amount = amount - (note10 * 10);
			System.out.println("note 10 " + note10);
		}
		if (amount >= 5) {
			int coin5 = amount / 5;
			amount = amount - (coin5 * 5);
			System.out.println("coin 5 " + coin5);

		}
		if (amount >= 2) {
			int coin2 = amount / 2;

			amount = amount - (coin2 * 2);
			System.out.println("coin 2 " + 2);
		}
		if (amount >= 1) {
			int coin1 = amount / 1;
			amount = amount - (coin1 * 1);
			System.out.println("coin 1 " + coin1);
		}

	}

}

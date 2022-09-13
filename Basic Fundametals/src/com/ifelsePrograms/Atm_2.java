package com.ifelsePrograms;

public class Atm_2 {
	public static void main(String[] args) {

		int amount = 60000;
		
		int total=50000;
		System.out.println("total balance "+total);
		System.out.println("availble balance "+(total-amount));


		if (amount >= 500) {
			int  note500 = amount / 500;
			amount = amount - (note500 * 500);

			System.out.println("note 500 " + note500 + " " );

		}
		if (amount >= 200) {
			int  note200 = amount / 200;
			amount = amount - (note200 * 200);
			System.out.println("note 200 " + note200);

		}
		if (amount >= 100) {
		int	note100 = amount / 100;
			amount = amount - (note100 * 100);
			System.out.println("note 100 " + note100);

		}
		if (amount >= 50) {
	int	 note50 = amount / 50;
			amount = amount - (note50 * 50);
			System.out.println("note 50 " + note50);

		}
		if (amount >= 20) {
		int	 note20 = amount / 20;
			amount = amount - (note20 * 20);
			System.out.println("note 20 " + note20);
		}
		if (amount >= 10) {
			int note10 = amount / 10;
			amount = amount - (note10 * 10);
			System.out.println("note 10 " + note10);
		}
		if (amount >= 5) {
		int	 coin5 = amount / 5;
			amount = amount - (coin5 * 5);
			System.out.println("coins 5 " + coin5);

		}
		if (amount >= 2) {
		int	 coin2 = amount / 2;
			amount = amount - (coin2 * 2);
			System.out.println("coins 2 " + coin2);

		}
		if (amount >= 1) {
			int coin1 = amount / 1;
			amount = amount - (coin1 * 1);
			System.out.println("coins 1 " + coin1);

		}else {
			System.out.println("");
		}

	}

}

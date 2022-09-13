package com.ifelsePrograms;

public class Use_vs_atm {
	public static void main(String[] args) {
		int amount = 26000;

		int note500 = 50;
		int note200 = 50;
		int note100 = 50;
		int note50 = 50;
		int total = note500*500  + note200*200 + note100*200 + note50*50;
		System.out.println(" balence " + (total-amount));

			if(amount<=note500)
		 {
		 note500=amount/500;
		 amount=amount-(note500*500);
		 System.out.println(note500);

	} if(amount<=note200) {
		note200=amount/200;
		amount=amount-(note200*200);
		System.out.println(note200);
	}if(amount<=note100) {
		note100=amount/100;
		amount=amount-(note100*100);
		System.out.println(note100);
	}
	if(amount<=note50) {
		note50=amount/50;
		amount=amount-(note50*50);
		System.out.println(note50);
	}
	
}
}
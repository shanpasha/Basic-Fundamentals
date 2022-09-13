package com.array;

public class Count_wins_and_losses {
	public static void main(String[] args) {
		
		String[] s= {"wins","loses" ,"wins","loses","loses","loses","loses","loses",
				"wins","wins","wins","loses","loses","loses","wins","wins","loses","loses"};
		
		int wins=0;
		int lose=0;
		
		for(int i=0;i<s.length;i++) {
			
		if(s[i]=="wins") {
			
			wins++;
			
		}else {
		lose++;
		
		}
			
			
		}System.out.println("count of wins = "+wins);
		System.out.println("count of lose =" +lose);
		
		
		
	}

}

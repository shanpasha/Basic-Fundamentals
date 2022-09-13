package com.ifelsePrograms;

import java.util.Scanner;

public class Atm_customer_Access {
	public static void main(String args[]) {
		int Account_balance=25000;
		Scanner sc = new Scanner(System.in);
		while (true){	
		System.out.println("welcome to ATM");
		System.out.println("");		
		System.out.println("1.Withdrwal Ammount");
		System.out.println("2.diposite Ammount");
		System.out.println("3.Check Balance");
		System.out.println("4.Exit System");		
		
		int num=sc.nextInt();	
			switch(num) {			
			case 1:
				System.out.println("Enter withdrwal ammount");
				int withdrawal=sc.nextInt();
				if(Account_balance>=withdrawal)			
				{	
					Account_balance=Account_balance-withdrawal;				
					System.out.println("collect the cash");
					System.out.println("");
					System.out.println("Available Balance : "+Account_balance);
					System.out.println("");
									
				}else {
					System.out.println("insufficient balance");
				}
					break;
				
			case 2:
				System.out.println("Enter the deposit Ammount");
				int deposit=sc.nextInt();
				 Account_balance =  Account_balance+deposit;
				System.out.println("Deposited sucessfully");				
				System.out.println("Account_balance : "+ Account_balance);			
				break;		
			case 3:
				System.out.println("Available balance : "+Account_balance);
				
				break;
				
			case 4:
				System.exit(0);
			
				
			}
				
			}
				
		
	}
		
}

	

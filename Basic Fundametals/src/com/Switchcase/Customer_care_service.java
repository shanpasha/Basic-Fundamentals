package com.Switchcase;
import java.util.Scanner;

public class Customer_care_service {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
			
		
		System.out.println("Welcom to Airtel");
		
System.out.println("Please Select your language...");
			
		
		System.out.println("Press 1 For English");
		System.out.println( "Press 2 For telugu");
	
		
	
	
		int english=sc.nextInt();
		switch(english) {
	
		case 1:
			System.out.println("You are selected english");
			
			System.out.println("For prepaid press 1");
		
			System.out.println("For unlimited packs offers Press  2");
			
			
			
			int prepaid=sc.nextInt();
			switch(prepaid){
			case 1:
				
				System.out.println(" for Balance Enquiry Press 1");
				System.out.println("check current plan Press 2");
			System.out.println("To know ur airtel Number Press  3");
			System.out.println("Talk with Customer care executives Press 4");
			
			
			int balance=sc.nextInt();
			
			switch(balance) {
			case 1:
				System.out.println("Avail Balance :22.35 ");
				System.out.println("Valid upto 20/06/2023");
				break;
			case 2:
				System.out.println("Currently plan is Rs 219	1GB per Day	28 Days	Unlimited	100/Day");
			break;
			case 3:
				System.out.println("Your Airtel number is : 8790888275");
			
			break;
			case 4:
				
			System.out.println("Connecting ur call to our customer Care Excutive please Wait... ");
			
			break;
			}
			break;
			case 2:
				System.out.println("Rs 219	1GB per Day	28 Days	Unlimited	100/Day");
				System.out.println("Rs 249	1.5GB per Day	28 Days	Unlimited	100/Day");
			System.out.println("Rs 279	1.5GB per Day	28 Days	Unlimited	100/Day");
			System.out.println("Rs 298	2GB per Day	28 Days	Unlimited	100/Day");
			System.out.println("Rs 349	2GB per Day	28 Days	Unlimited	100/Day");
			System.out.println("Rs 398	3GB per Day	28 Days	Unlimited	100/Day");
			break;
			
			
			
				
			}
			break;	
		
		
			
			
			
			
			
			case 2:
				System.out.println("Meeru enchukunnaru  Telugu");
				
				System.out.println(" prepaid kosam 1 Nokandi");
			
				System.out.println("Aparmitha call offers kosam 2 Nokkandi ");
				
				
				
				int prepaid1=sc.nextInt();
				switch(prepaid1){
				case 1:
					
					System.out.println("  Balance Vicharana ku 1 Nokandi ");
					System.out.println("Prastutha Pranilikanu Thaniki cheyutaku 2 Nokandi ");
				System.out.println("Mee number nee thelusukovutaku 3 Nokandi  ");
				System.out.println("Maa Customer care executives matladutaku 4 Nokandi");
				
				
				int balance=sc.nextInt();
				
				switch(balance) {
				case 1:
					System.out.println("Andubatulo unna  Balance :22.35 ");
					System.out.println(" 20/06/2023 Varaku chelluthundi ");
					break;
				case 2:
					System.out.println("Prastutha  plan Rs 219	1GB Prathi roju	28 rojulu	Aparimitham	100 sms/roju");
				break;
				case 3:
					System.out.println("Mee Airtel sankya : 8790888275");
				
				break;
				case 4:
					
				System.out.println("Memu maa  customer Care Prathi neediki Kaluputhunnam...Dayachesi vechi undagalaru ");
				
				break;
				}
				break;
				case 2:
					System.out.println("Rs 219	1GB Prathi roju	28 rojulu	Aparimitham	100 sms/roju");
					System.out.println("Rs 249	1.5GB Prathi roju	28 rojulu	Aparimitham	100 sms/roju");
				System.out.println("Rs 279	1.5GB Prathi roju	28 rojulu 	Aparimitham	100 sms/roju");
				System.out.println("Rs 298	2GB Prathi roju	28 rojulu	Aparimitham	100 sms/roju");
				System.out.println("Rs 349	2GB Prathi roju	28 rojulu	Aparimitham	100 sms/roju");
				System.out.println("Rs 398	3GB Prathi roju	28 rojulu	Aparimitham	100sms /roju");
				break;
				
				
				
					
				}
				break;
				
			
			
			
			
			
			
			
			
			
	
			
		
		
		}
	
	
		
			
		
		
		
		
		}
		
		
		
		
	
	}


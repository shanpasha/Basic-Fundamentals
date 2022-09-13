package com.ifelsePrograms;

public class Calucation_Electricity_Bill {
	public static void main (String []args) {
		
		int units=300;
		double amount=0;
		
		if (units<=50) {
			
			amount=units*0.50;
			
		}
			else if(units<=150) {
				
			amount=(units*0.75)-25;
				
			}else if(units<=250) {
				
			amount=(units*1.20)-75;
				
			}else if(units>250)
				amount=(units*1.50)-120;
		
		double subcharges=amount*0.2;
		System.out.println("Total units Consumed : "+units+" units");
		System.out.println("Units charges        : "+amount);
		
		
		System.out.println("Subcharges           : " +subcharges);
		double total_ammount=amount+subcharges;
		System.out.println("----------------------------------------");
		System.out.println("Total amount = "+total_ammount);
		System.out.println("----------------------------------------");
		
	}

		
	}


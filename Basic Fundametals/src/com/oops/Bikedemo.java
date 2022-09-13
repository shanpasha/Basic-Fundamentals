package com.oops;

public class Bikedemo {
	
	static  int wheels=2;
	int milage;
	String color="";
String bike1="ns160";
String bike2="ns125";
String bike3="ns200";
String bike4="rtr";


	void diskSystem()
	{
		
		System.out.println(bike1+"Disk future is available");
		System.out.println(bike2+"Disk future is available");
		System.out.println(bike3+"Disk future is available");
		System.out.println(bike4+"Disk future is available");
		
		
	}
public static void main (String []args) {
	
	Bikedemo ns160=new Bikedemo();
	Bikedemo ns125= new Bikedemo();
	Bikedemo ns200= new Bikedemo();
	Bikedemo rtr= new Bikedemo();
	
	System.out.println("ns160 wheels   : "+ns160.wheels);
	System.out.println("ns 125 wheels  : "+ns125.wheels);
	System.out.println("ns 200 wheels  : "+ns200.wheels);
	System.out.println("rtr wheels     : "+rtr.wheels);
	
	System.out.println("");
	System.out.println("----------------------------------------------------");
	
	
	
	
	ns125.color="red";
	ns200.color="blue while";
	ns160.color="black";
	rtr.color="orange";
	
	
	System.out.println("Ns160 color   : "+ ns160.color);
	System.out.println("Ns125 color   : "+ns125.color);
	
	System.out.println("Ns200 color   : "+ns200.color);

	System.out.println("Rtr color     : "+rtr.color);
	
	System.out.println("");
	System.out.println("-------------------------------------------------");

	 ns160.milage=50;
	 ns125.milage=60;
	 
	 ns200.milage=30;
	rtr.milage=45;
	
	System.out.println("Ns 160 milage    : "+ns160.milage+"kmph");
	System.out.println("Ns 125 milage    : "+ns125.milage+"kmph");
	System.out.println("Ns 200 milage    : "+ns200.milage+"kmph");
	System.out.println("Rtr milage       : "+ rtr.milage+"kmph");

	
	
	System.out.println("==========================================================");
	ns160.diskSystem();
	ns125.diskSystem();
	ns200.diskSystem(); 
	rtr.diskSystem();
		
	
	
}
}
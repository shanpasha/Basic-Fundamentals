package com.oops;

public class Bike_Features {
	
	static void braking  (String name ) {
		
		System.out.println(name+ " when u breaks applied bike will halts  ");
		System.out.println("");
	}
	void milage (String a,int b) 
	
	{	
		
		
		System.out.println(a+" "+b);
		
		
		System.out.println("");
	}
	

	
	static void Wheels(String a ) {
		
		
		System.out.println(a+"Wheels : 2");
		
		
	}
	
	public static void main(String[] args) {
		
		
		
		Bike_Features pulsar= new Bike_Features();
		Bike_Features passionpro =new Bike_Features();
		Bike_Features royalenfield =new Bike_Features();
		Bike_Features activa= new Bike_Features();
		
		
		
		pulsar.braking("pulsar : ");
		passionpro.braking("passion pro : ");
		royalenfield.braking("Royal enfield : ");
		activa.braking("Activa : ");
		
		pulsar.milage("pulsar milage :", 50);
		passionpro.milage("passion pro : ", 60);
		royalenfield.milage("royelenfiled : ", 30);
		activa.milage("Activa ", 55);
		
	pulsar.Wheels("pulsar ");
	passionpro.Wheels("passionpro ");	
	royalenfield.Wheels("royalenfiled ");	
	activa.Wheels("activa ");
		
	}

}

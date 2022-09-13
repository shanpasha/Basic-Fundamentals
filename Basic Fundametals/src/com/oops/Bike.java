package com.oops;

public class Bike {
static int wheels=2;
String color="";
void   milage (int m) {
	 System.out.println("milage : " +m);
 }

static void breaking(String name)
{
	System.out.println("press the break bike stop"+name);
}
public static void main(String args[]) {
	
	Bike pulsar=new Bike();
	Bike glmr=new Bike();
	Bike fz=new Bike ();
	
	System.out.println("wheels pulsar "+pulsar.wheels);
	System.out.println("wheels glmr  "+glmr.wheels);
	System.out.println("wheels fz "+fz.wheels);
	
	pulsar.color="red";
	glmr.color="blue";
	fz.color="white";
	

	System.out.println("pulsar color : "+pulsar.color);
	System.out.println("glmr color : "+glmr.color);
	System.out.println("fz color : " +fz.color);
	
	pulsar.milage(56);
	glmr.milage(65);
fz.milage(30);
pulsar.breaking("pulsar");
glmr.breaking("glmr");
fz.breaking("fz");
}
}
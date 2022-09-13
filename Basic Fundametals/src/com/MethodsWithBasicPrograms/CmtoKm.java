package com.MethodsWithBasicPrograms;

public class CmtoKm {
//1m=100cm	
//1km=100000com	
	
	public void km(double cm) {
		
		double meter=cm/100;
		double kilometer=cm/100000;
		
		System.out.println(meter+" meter");
		System.out.println(kilometer+" km ");
		
		
	}
public static void main(String[] args) {
	
	CmtoKm kilometer=new CmtoKm();
	
	kilometer.km(100000);
			
	
}

}

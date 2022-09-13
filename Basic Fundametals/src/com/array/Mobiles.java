package com.array;

public class Mobiles {
	public static void main(String[] args) {
		
	String [] mobiles= {"redmi note 8pro","Mi 5pro","Mi 4","Mi note 3","mi note 10"};
     double prices []= {16550, 11999,8599,10400,13599};

     double[] tax=new double[prices.length];



System.out.println("------------------With out tax-----------------");

for (int i=0;i<mobiles.length;i++) {
	
	 System.out.println(mobiles[i]+" INR: "+prices[i]);
	
}

System.out.println("------------with tax---------------");
  for (int i=0;i<mobiles.length;i++) {
	  
	   tax [i]=prices[i]*1.2;
  
 
	System.out.println(mobiles[i]+"  INR :"+Math.round(tax[i]));
	
	
	

}
}
}
package com.ifelsePrograms;
public class Profit_or_loss{

public static void main(String args[]){

int profit=0;
int cost_of_itm=45;
int selling_price=66;
int loss=0;


if(cost_of_itm<selling_price)
{
profit=selling_price-cost_of_itm;
System.out.println("profit : "+ profit);

}
else if (cost_of_itm>selling_price)
{
loss=cost_of_itm-selling_price;

System.out.println("Loss = "+loss);

}else{

System.out.println("There is no loss and No Profit !");
}


}
}
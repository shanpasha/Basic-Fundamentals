package com.practice;
import java.util.Scanner;

public class Quiz_quations_and_ans {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		
		
		System.out.println("1.Number of primitive data types in Java are?");
System.out.println("A.6  B.7  C.8   D.9");	
char ans1=sc.next().charAt(0);

System.out.println("2.What is the size of float and double in java?");
System.out.println("A. 32 and 64   B.32 and 32");
System.out.println("C. 64 and 64   B.64 and 32");
char ans2=sc.next().charAt(0);

System.out.println("3.Automatic type conversion is possible in which of the possible cases?");
System.out.println("A. byte to int   B.int to long");
System.out.println("C. long to int   D.long to int");
char ans3=sc.next().charAt(0);

System.out.println("Select the valid statement.");
System.out.println("A.char[]=new char(5)   B.char [] = new char[5]");
System.out.println("C.char[]=new char()    D.char [] = new char[]");
char ans4=sc.next().charAt(0);

System.out.println("When an array is passed to a method, what does the method receive?");
System.out.println("A.The reference of the array    B. A copy of the array");
System.out.println("C.length of the array    D. A copy of the  first element ");
char ans5=sc.next().charAt(0);

System.out.println("Arrays in java are-");
System.out.println("A.object reference       B.object");
System.out.println("C.primitive data type    D.none");

char ans6=sc.next().charAt(0);


System.out.println();

int score=0;

System.out.println();
if (ans1=='C'||ans1=='c') {
	
	score+=5;
		
}if (ans2=='A'||ans2=='a') {
	score+=5;
	}
if (ans3=='B'||ans3=='b') {
	
	score+=5;
}if (ans4=='B'||ans4=='b') {

	score+=5;
	
}if (ans5=='A'||ans5=='a') {
	
	score+=5;
	
	
}if (ans6=='B'||ans6=='b') {
	
	score+=5;
	
}if (score>=25) {

System.out.println("wow amazing u crak the answers "+score+"/30");

}
	 if  (score>=20) {
		System.out.println("You are good "+score+"/30");
		
	 }
	 
	 else if (score>=10) {
		
		System.out.println("not bad! "+score+"/30");
		
	}else  {
		System.out.println("Better luck next time "+score+"/30");
		
	}
	 

}}
	


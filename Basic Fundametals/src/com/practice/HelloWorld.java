package com.practice;

public class HelloWorld {
	// programmer created a method--> method name is say Hello
		public void sayHello() {
			//local variable
			String institute = "createiq tech";
			System.out.println("welcome to everyone " + institute);
		}

		// main method.....
		public static void main(String[] args) {
			// instance
			HelloWorld hello = new HelloWorld();
			hello.sayHello();
		}

}

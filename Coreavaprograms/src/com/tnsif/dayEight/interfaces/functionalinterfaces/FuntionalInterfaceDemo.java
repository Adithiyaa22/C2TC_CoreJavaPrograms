package com.tnsif.dayEight.interfaces.functionalinterfaces;

public class FuntionalInterfaceDemo {

	public static void main(String[] args) {
		
		GreetClass g = new GreetClass();
		
		System.out.println(g.greet());
		
		
		//Using Lambda Function
		
		GreetInterface g1 = () ->{
			return "Good Morning";
		};
		
		System.out.println(g1.greet());
	}
	
	
	

}

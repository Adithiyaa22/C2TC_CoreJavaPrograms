package com.tnsif.dayFive.multilevelinheritance.vehicle;

public class porsche extends Car {
	public porsche() {
		System.out.println("Class porsche");
	}

	public void brand() {
		System.out.println("Brand: Porsche");
	}
	public void speed() {
		System.out.println("Max: 220Kmph");
	}
}

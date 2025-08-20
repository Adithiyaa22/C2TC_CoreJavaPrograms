package com.tnsif.dayEight.abstraction;

public abstract class Shape {
	protected float area;
	
	//abstract method
	
	abstract void calArea();
	
	//concrete method
	
	void show() {
		System.out.println("Area of the Shape is "+area);
	}
}

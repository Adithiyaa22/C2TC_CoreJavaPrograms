package com.tnsif.dayFive.multilevelinheritance.vehicle;

public class VechileDemo {

	public static void main(String[] args) {
		
		Car c;
		c=new Car();
		c.vehicleType();
		
		porsche m=new porsche();
		m.vehicleType();
		m.brand();
		m.speed();
		
		porsche911 m1=new porsche911();
		m1.vehicleType();
		m1.brand();
		m1.speed();
		
	}

}

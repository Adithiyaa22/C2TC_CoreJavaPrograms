package com.tnsif.dayFive.association.isa;

public class IsADemo {

	public static void main(String[] args) {
		

		Employee employee = new Employee("Pawan Chander", 001, "IT");
		Manager manager = new Manager("Anuj Bhav", 101, "Hr", 8);

		System.out.println(employee);
		System.out.println("---------------------------------------------------------------");
		System.out.println(manager);
	}

}

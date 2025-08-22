package com.tnsif.dayEight.interfaces.extendinginterfaces;

public class ExtendingInterfaceDemo implements ChildInterface{
	
	//Override ChildInterface Method
	public void print()
	{
		System.out.println("print method");
	}
	
	//Override InterfaceOne method
	public void show()
	{
		System.out.println("Show method");
	}
}

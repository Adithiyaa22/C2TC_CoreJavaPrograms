package com.tnsif.dayNine;

public class WrapperClassDemo {

	public static void main(String[] args) {
		
		//Unboxing
		Integer i = new Integer(100);
		
		System.out.println(i);
		
		int b = i.intValue();
		
		System.out.println(b);
		
		
		// without using intvalue()
		
		int c = i;
		System.out.println(c);
		
		//Autoboxing
		
		int a = 200;
		Integer i1 = a;
		System.out.println(i1);
	}

}

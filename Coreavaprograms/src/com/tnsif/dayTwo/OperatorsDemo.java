package com.tnsif.dayTwo;

public class OperatorsDemo {

	public static void main(String[] args) {
	int a = 1;
	int b = 2;
	int c = 3;
	System.out.println("a and b value before the operations: " + a + " " + b);
	++a;
	int x = ++a + b + a--;
	System.out.println("x value after the operations: " + x);
	int d = x++ + a + b--;
	System.out.println("d value after the operations: " + d);
	System.out.println("a , b,c,d values after the operations: " + a + " " + b + " " + c + " " + d);
	
	// ternary operator
	String e = (8==x) ? "yes" : "no";
	System.out.println(e);
	
	}

}

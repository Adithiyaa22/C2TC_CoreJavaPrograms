package com.tnsif.dayEleven;

public class UncheckedException {

	public static void main(String[] args) {
		int x[];
		try {
			x = new int[] { 11, 12, 13, 14 };
			System.out.println(x[6]);// out of bound
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Specified index does not exist. " + e.getMessage());// to get the detail message of																				// exception as a string value.

		}
	}

}

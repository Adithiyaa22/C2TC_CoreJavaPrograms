package com.tnsif.dayTen;

public class JaggedArrayDemo {

	public static void main(String[] args) {

		int dd[][] = { {1, 2, 3 }, { 4 }, { 12, 21 }, { 11 } };

		System.out.println("Total Rows in Array d : " + dd.length);

		MLArray.printArray(dd);

	}

}

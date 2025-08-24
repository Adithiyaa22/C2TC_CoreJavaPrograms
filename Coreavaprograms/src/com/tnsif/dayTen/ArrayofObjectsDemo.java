package com.tnsif.dayTen;

public class ArrayofObjectsDemo {

	public static void main(String[] args) {
		// declares an Array of integers.
				Student[] arr;
				// allocating memory for 5 objects of type Student.
				arr = new Student[5];
				// initialize the first elements of the array
				arr[0] = new Student(1, "Adithiyaa");
				// initialize the second elements of the array
				arr[1] = new Student(2, "Anitha");
				// so on...
				arr[2] = new Student(3, "Linkesh");
				arr[3] = new Student(4, "kesava");
				arr[4] = new Student(5, "Yaswanth");
				
				// accessing the elements of the specified array
				for (int i = 0; i < arr.length; i++)
					System.out.println("Element at " + i + " : " + arr[i].getRollNo()+ " " + arr[i].getName());

	}

}

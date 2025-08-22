package com.tnsif.dayNine;

public class StringComparison {

	public static void main(String[] args) {
		String s1 = "Capgemini";
		String s2 = "TNS CSR";
		
		
		String s3 = new String("C70");
		String s4 = new String("JAVA FullStack Training");
		
		//== and equals
				System.out.println("s1 == s2 :" + (s1 == s2) + "\ts1 equals s2" + s1.equals(s2));
				System.out.println("s1 == s3 :" + (s1 == s3) + "\ts1 equals s3" + s1.equals(s3));
				System.out.println("s4 == s3 :" + (s4 == s3) + "\ts4 equals s3" + s4.equals(s3));

				System.out.println(s1.hashCode());
				System.out.println(s2.hashCode());

				System.out.println(s3.hashCode());
				System.out.println(s4.hashCode());

				//compareTo 
				System.out.println(s1.compareTo("tnsif"));
				System.out.println(s1.compareToIgnoreCase("tnsif"));
				System.out.println(s1.compareTo(s2));
		

	}

}

package com.operators;

//Comparison Operators : == < > <= >= != --> Result : boolean expression 
//== operators checks the values when the data is primitive 
//== Operators checks the address when it is Object data types.
public class TestComparisionOpDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started !");

		int a = 10;
		int b = 20;
		int c = 10;

		System.out.println(a == b);
		System.out.println(a == c);

		// String Literals --> SCP : String Constant pool
		// SCP is storing the same address if the data is same.
		String s1 = "Srikanth";
		String s2 = "Srikanth";
		System.out.println(s1 == s2);// true

		System.out.println("--------------------");
		String s3 = new String("Java");// Heap new Object
		String s4 = new String("Java");// Heap new Object
		System.out.println(s3 == s4);// false
		System.out.println(s3.equals(s4));

		System.out.println("--------------------");
		String s5 = "Srikanth";// SCP
		String s6 = new String("Srikanth");// Heap

		System.out.println(s5 == s6);// false
	}

}

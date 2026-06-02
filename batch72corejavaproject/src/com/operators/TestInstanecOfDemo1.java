package com.operators;

// instanceof Operators  is for checking the Reference variable 
// Whether the reference variable is from specified Object children or not ..? 
public class TestInstanecOfDemo1 {

	public static void main(String[] args) {

		Integer i1 = 100;

		System.out.println(i1 instanceof Integer);// true
		System.out.println(i1 instanceof Number);// true
		System.out.println(i1 instanceof Object);// true

//		System.out.println(i1 instanceof String);//CE Incompatible conditional operand types Integer and String

		System.out.println(null instanceof Integer);// flase

		Number n1 = 20;
		System.out.println(n1 instanceof Number);// true
		System.out.println(n1 instanceof Object);// true
		System.out.println(n1 instanceof Integer);// true

		System.out.println("_______________");
		String s = "Srikanth";
		Object obj = "Vcube";

		System.out.println(s instanceof String);
		System.out.println(s instanceof Object);

		System.out.println(obj instanceof StringBuffer);// false
		System.out.println(obj instanceof String);// true
		System.out.println(obj instanceof Object);

	}

}

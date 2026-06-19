package com.logicalstatements.loops;

//BODMAS --> Arithmetic Operators 
//PEMARELA --> Remaining Operators 
public class TestDemo21 {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		System.out.println("Addition : " + a + b);// String + anything String only = Addition1020
		System.out.println("Addition : " + (a + b));// Addition : 30
		System.out.println("Multiplication : " + a * b);// Multiplication : 200
		System.out.println("Division : " + b / a);

//		Highest precedence. Parenthesis 
		int result = 3 * (10 + 20 + 3);
		System.out.println(result);

		int result1 = 3 * 10 + 20 + 3;
		System.out.println(result1);

	}

}

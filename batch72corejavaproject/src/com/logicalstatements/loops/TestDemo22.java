package com.logicalstatements.loops;

//P ->Parenthesis ()  --> Highest precedence.
//E → Unary Operators ++ -- !
//M -> Multiplication Division & Modulus * / %
//A -> Addition & Subtraction 
//--------------------------------------
//R --> Relational Operators < > <= >=
//E --> Equality Operators  == != 
//L → Logical Operators && ||
//A → Assignment Operator --> Lowest precedence.

public class TestDemo22 {

	public static void main(String[] args) {
		int a = 10;// 10
		int b = a++;// 10 --> 11

		System.out.println(a);// 11
		System.out.println(b);// 10

		boolean status = !true;
		System.out.println(status);

//		Multiplication Division & Modulus 
		System.out.println(10 + 20 * 4 + 5 * (1 + 1));// 10+80+10

//		Division
		System.out.println(100 / 10 + 5 + 10 * 5);

//		Modulus
		System.out.println(17 % 5 + 10 * 2 + (10 + 10));

		System.out.println(20 - 10 + 5 * 10 + 20);
		System.out.println(10 + 20 * 3 - 5);

//		R → Relational Operators < > <= >=
//				Compare two values and return boolean.
		System.out.println(10 > 5);
		

	}

}

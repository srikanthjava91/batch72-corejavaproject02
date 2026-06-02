package com.operators;

//&& || !  --> Boolean expression 
public class TestLogicalOpDemo6 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 10;

		System.out.println("******** && **************");
		System.out.println(true && true && true && true);// true
		System.out.println(true && false);// false
		System.out.println(false && true);// false
		System.out.println(false && false);// false

		System.out.println("----------------------------");

		System.out.println(a < b && b > c);// true
		System.out.println(a < b && b < c);// false
		System.out.println(a > b && b > c);// false
		System.out.println(a > b && b < c);// false

		System.out.println("************* || ****************");
		System.out.println(true || true);// true
		System.out.println(true || false);// true
		System.out.println(false || true);// true
		System.out.println(false || false);// false

		System.out.println("----------------------------");

		System.out.println(a < b || b > c);// true
		System.out.println(a < b || b < c);// true
		System.out.println(a > b || b > c);// true
		System.out.println(a > b || b < c);// false

		System.out.println("*************** ! ********** ");
		System.out.println(!(a < b));//false

	}

}

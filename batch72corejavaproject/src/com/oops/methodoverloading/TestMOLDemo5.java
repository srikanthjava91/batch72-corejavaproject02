package com.oops.methodoverloading;

public class TestMOLDemo5 {

	void main(String... args) {
		System.out.println("main method staretd ");
		addition("");
		addition("", 10);
		addition("", 10, 20);

	}

	// The variable argument type int of the method addition must be the last
	// parameter
	void addition(String s, int... elements) {
		System.out.println("var arg method called ");
		int sum = 0;

		for (int e : elements) {
			sum = sum + e;
		}
		System.out.println("sum of all elements : " + sum);
	}
}

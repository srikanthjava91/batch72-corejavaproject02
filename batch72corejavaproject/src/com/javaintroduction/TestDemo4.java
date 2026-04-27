package com.javaintroduction;

public class TestDemo4 {

	static void method4() {
		System.out.println("method4 called !");
	}

//	Can we call instance methods inside instance method directly..? Yes we can call directly.
	void method2() {
		method3();
		System.out.println("method2 called  ");
	}

//	in static methods, we cannot call instance methods directly, 
//	if we want to call we must need to create object.
	static void method1() {
		TestDemo4 t = new TestDemo4();
		t.method2();
		System.out.println("method1 called  ");
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		method1();

		System.out.println("main method ended ");

	}

//	can we call static methods inside instance method directly..? Yes without a doubt
	void method3() {
		method4();
		System.out.println("method3 called ");
	}

}

package com.javaintroduction;

public class TestDemo3 {

	static void wish() {
		System.out.println("Good Morning ! Have a nice day ");
		System.out.println("Good Morning ! Have a nice day ");
		System.out.println("Good Morning ! Have a nice day ");
		System.out.println(Thread.currentThread());
	}

	void hello() {
		System.out.println("Hello guys, Wassup !!");
		System.out.println("Hello guys, Wassup !!");
		System.out.println("Hello guys, Wassup !!");
		System.out.println(Thread.currentThread());
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		System.out.println(Thread.currentThread());

		wish();// calling a method for my class to

		TestDemo3 t = new TestDemo3();
		t.hello();

//		Cannot make a static reference to the non-static method hello() from the type TestDemo3
//		hello();

		System.out.println("main method ended ");
	}
}

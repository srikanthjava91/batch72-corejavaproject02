package com.javaintroduction;

class A {
	B b;

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called ");
	}
}

class B {
	A a;
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called ");
	}
}

public class TestDemo8 {

	public static void main(String[] args) {
		System.out.println("main method srate d");
		A a = new A();
		B b = new B();

		a.b = b;
		b.a = a;

		a = null;
		b = null;

		System.gc();

	}

}

package com.oops.inheritance;

class A {
	void method1() {
		System.out.println("method1 called from A ");
	}
}

class B extends A {
	void method2() {
		System.out.println("method2 called from B ");
	}
}

class C extends B {
	void method3() {
		System.out.println("Method3 called from C ");
	}
}

//1) SIngle or Simple Inheritance 
//2) Multi-level Inheritance 
public class TestInheritanceDemo2 {

	public static void main(String[] args) {
		System.out.println("main method staretd ");

		C c = new C();
		c.method1();
		c.method2();
		c.method3();
		System.out.println(c.hashCode());

	}

}

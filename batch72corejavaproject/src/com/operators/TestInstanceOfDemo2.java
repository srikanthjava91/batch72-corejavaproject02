package com.operators;

//Parent or Base or Super 
class A {

}

//Child or Derived or Sub 
class B extends A {

}

public class TestInstanceOfDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		A a = new A();
		B b = new B();
		
		System.out.println(a instanceof A);
		System.out.println(b instanceof B );
		System.out.println(b instanceof A);
		System.out.println(a instanceof B );
		
	}

}

package com.oops.inheritance;

import java.io.IOException;

interface In1 {
	// Abstract methods do not specify a body
//	void hello() {} 
	public abstract void hello();
}

class Test1 implements In1 {

	public void main(String[] args) {
		System.out.println("Hello Test1");
	}

	void method1() throws Exception {
		System.out.println("Test1 - method1");
	}

	@Override
	public void hello() {
		System.out.println("Hello");
	}
}

abstract class TestHello extends Test1{
	@Override
	public abstract void hello();
}

class Test2 extends Test1 {

	@Override
	void method1() throws IOException {
		System.out.println("Test2 - method1");
	}

	@Override
	public void main(String[] args) {
		System.out.println("Hello Test2");
	}
}

public class TestMORDemo1 {

	public static void main(String[] args) {
		Test1 t = new Test1();
//		t.method1();
	}

}

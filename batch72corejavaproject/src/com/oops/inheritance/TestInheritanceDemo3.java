package com.oops.inheritance;

class TestA1 {
	void method1() {
		System.out.println("methdo1 called from  Test1");
	}
}

class TestA2 extends TestA1 {
	void method2() {
		System.out.println("methid2 called from  Test2");
	}
}

class TestA3 extends TestA1 {

	void method3() {
		System.out.println("methdo3 called from  Test3");
	}
}



//4) Hierarchical Inheritance
public class TestInheritanceDemo3 {

	public static void main(String[] args) {

		TestA2 a2 = new TestA2();
		a2.method1();
		a2.method2();

		TestA3 a3 = new TestA3();
		a3.method1();
		a3.method3();

	}

}

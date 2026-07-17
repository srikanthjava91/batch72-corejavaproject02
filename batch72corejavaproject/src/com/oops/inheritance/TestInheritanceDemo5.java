package com.oops.inheritance;

class TestA {

	TestA() {
		
		System.out.println("Constructor called from TestA ");
	}

	void display() {
		System.out.println("dispaly method calld from A ");
	}
}

class TestB {

	TestB() {

		System.out.println("Constructor called from TestB ");
	}

}

//class TestC extends TestB, TestA{
//
//	TestC() {
//		
//		System.out.println("Constructor called from TestC ");
//	}
//
//}

public class TestInheritanceDemo5 {

	public static void main(String[] args) {
		System.out.println("main method started ");

//		TestC b = new TestC();

		System.out.println("main method ended ");

	}

}

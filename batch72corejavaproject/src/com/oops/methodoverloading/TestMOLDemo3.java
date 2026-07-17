package com.oops.methodoverloading;

public class TestMOLDemo3 {

	void main(String[] args) {
		System.out.println("main method started ");
		
//		/The method addition(int, float) is ambiguous for the type TestMOLDemo3
//		addition(10, 10);
//
	}

	void addition() {
		System.out.println("addition method called ");
	}

//	void addition(int a) {
//		System.out.println("Addition method called with int args ");
//
//	}

//	void addition(float a) {
//		System.out.println("Addition method called with float args ");
//	}

//	void addition(int i, int a) {
//		System.out.println("Addition method called with int & int args ");
//	}

	void addition(int i, float a) {
		System.out.println("Addition method called with int & float args ");
	}

	void addition(float i, int a) {
		System.out.println("Addition method called with float & int args ");
	}
//	
//	void addition(float i, float a) {
//		System.out.println("Addition method called with float & float args ");
//	}

}

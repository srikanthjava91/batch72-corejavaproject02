package com.oops.methodoverloading;

public class TestMOlDemo4 {

	void main(String[] args) {

		show(null);
		Integer i = 10;
		display(i);
		display(null);// The method display(Number) is ambiguous for the type TestMOlDemo4

	}

	void display(Number n) {
		System.out.println("Display method called with Number  ");
	}

//	void display(Integer n) {
//		System.out.println("Display method called with Integer  ");
//	}

//	void display(Double n) {
//		System.out.println("Display method called with Integer  ");
//	}

	void display(Object n) {
		System.out.println("Display method called with Integer  ");
	}

	void show(String args) {
		System.out.println("show - Sring method called ");
	}

	void show(Object o) {
		System.out.println("show - Object method called ");
	}

}

package com.javaintroduction;

import java.awt.DisplayMode;

public class TestDemo2 {

	static void show() {
		System.out.println("show method called ");
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		show();

		TestDemo2 t = new TestDemo2();

		t.display();

	}

	void display() {
		System.out.println("display method called ");
	}
}

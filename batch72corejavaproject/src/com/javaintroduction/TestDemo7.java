package com.javaintroduction;

public class TestDemo7 extends Object {

	@Override
	protected void finalize() {
		System.out.println("finalize method called ");
	}

	public static void main(String[] args) {

		TestDemo7 t1 = new TestDemo7();
		TestDemo7 t2 = new TestDemo7();
		TestDemo7 t3 = new TestDemo7();

		// NUllifying the objects
		t1 = null;
		t2 = null;
		t3 = null;
		System.gc();// Runs the garbage collector in the Java Virtual Machine.
//		Calling the gc method suggests that the Java Virtual Machine expend 
//		effort toward recycling unused objects in order to make the memory 
//		they currently occupy available for reuse by the Java Virtual Machine

		System.out.println(t1);// 1dbd16a6
		System.out.println(t2);// 7ad041f3 --> 1dbd16a6
		System.out.println(t3);// 251a69d7 --> 7ad041f3

	}

}

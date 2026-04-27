package com.javaintroduction;

//Whenever we have static block in your program, JVM will load static block first even before main method.
//Even though static block executing first, JVM check whether the main method is available or not..? 
//
//If we remove main method what happens ..? 
///We will get a Runtime Error saying : Error: Main method not found in class
///
///Step1 : First, JVM Checks, whether main method is available or not.
///Step2 : Then only, it check is there any static blocks, if there is a static block, 
///JVM loading static block first and then called main method.
///
///Note : Whenever class loads static blocks load to the memory and executes the same.
///But, if we want to load and executes instance blocks we must need to create object.
/// When we have static variable & static block, JVM checks the order of the static.

public class TestDemo5 {

// Object Creation
	static TestDemo5 t = new TestDemo5();

	void method1() {
		System.out.println("intsnace method ");
	}

// static block
	static {
		System.out.println("static block1 loaded ");
	}

	public static void main(String[] args) {
		System.out.println("main method strated ");
		t.method1();

	}

	// instance block
	{
		System.out.println("instnace block loaded ");
//		TestDemo5 t = new TestDemo5();
	}
}

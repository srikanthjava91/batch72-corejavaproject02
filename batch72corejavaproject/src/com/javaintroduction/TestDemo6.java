package com.javaintroduction;

public class TestDemo6 {
	
	static int a = 100;
	int a1 = 200;

	void hello() {
		//local variable
		int a = 10;
		
		System.out.println("Hello");
	}

//	Native methods do not specify a body
//	native void show() {
//		
//	}
	//Native methods implementation provided by the other language like C/C++ 
	native void show();//UnsatisfiedLinkError
	
	public static void main(String[] args) {
		System.out.println("main method started ");

		// Object creation
		TestDemo6 t = new TestDemo6();

		// calling the method
		t.hello();
		t.show();
	}
}

package com.accessmodifiers01;

public class TestAccessDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		TestAccessDemo1 t1 = new TestAccessDemo1();

//		Accessing the default data outside of the classes within the same package.
		System.out.println("*********Accessing the default data within the package");
		System.out.println(t1.id2);
		System.out.println(t1.name2);
		t1.method2();

//		Accessing the public data within the package
		System.out.println("*********Accessing the public data within the package");
		System.out.println(t1.id3);
		System.out.println(t1.name3);
		t1.method3();

//		Accessing the protected data within the package
		System.out.println("*********Accessing the proteced data within the package");
		System.out.println(t1.id4);
		System.out.println(t1.name4);
		t1.method4();

//		The constructor TestAccessDemo1() is not visible
//		TestAccessDemo1 t1 = new TestAccessDemo1();

//		Accessing the private data members outside of the classes are not possible.!-
//		System.out.println(t1.id);//The field TestAccessDemo1.id is not visible
//		System.out.println(t1.name);//The field TestAccessDemo1.name is not visible
//		t1.method1();//The method method1() from the type TestAccessDemo1 is not visible

	}

}

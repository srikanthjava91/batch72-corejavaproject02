package com.accessmodifiers01;

//if we use private for a class we will get CE : 
//Illegal modifier for the class TestAccessDemo1; 
//only public, abstract, strictfp, <default> & final are permitted
public class TestAccessDemo1 {

//	private constructor : We can create Object for a class only within the class but, 
//	we cannot create objects outside of the classes. 
//	(Singleton: Creating Only Object for n number of requests will use Single Design pattern)
//	private TestAccessDemo1() {
//
//	}

	 static {
		System.out.println("static block from TestAccess Demo1");
	}

	{
		System.out.println("instance block from TestAccess Demo1 ");
	}

	public TestAccessDemo1() {
		System.out.println("no arg constructor with public scope");
	}

//	protected data members 
	protected int id4 = 45;
	protected String name4= "Rohit";
	
	protected void method4() {
		System.out.println("method4 called ");
	}
	
//	public data members 
	public int id3 = 18;
	public String name3 = "Virat";

	public void method3() {
		System.out.println("method3 called ");
	}

//	default data members 
	int id2 = 3;
	String name2 = "Sooryavamsi";

	void method2() {
		System.out.println("method2 called ");
	}

//	private data members 
	private int id1 = 7;
	private String name1 = "MSD";

	private void method1() {
		System.out.println("method1 called ");
	}

	public static void main(String[] args) {

		TestAccessDemo1 t1 = new TestAccessDemo1();

//		 Accessing the private data within the class
		System.out.println("*********Accessing the private data within the class");
		System.out.println(t1.id1);
		System.out.println(t1.name1);
		t1.method1();

//		Accessing the default data within the class
		System.out.println("*********Accessing the default data within the class");
		System.out.println(t1.id2);
		System.out.println(t1.name2);
		t1.method2();

//		Accessing the public data within the class
		System.out.println("*********Accessing the public data within the class");
		System.out.println(t1.id3);
		System.out.println(t1.name3);
		t1.method3();
		
//		Accessing the protected data within the class
		System.out.println("*********Accessing the proteced data within the class");
		System.out.println(t1.id4);
		System.out.println(t1.name4);
		t1.method4();

	}

}

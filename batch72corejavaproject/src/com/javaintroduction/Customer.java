package com.javaintroduction;

public class Customer {

	@Override
	protected void finalize() {
		System.out.println("finalize method called ");
	}

	void method1() {
		// Object inside the method
		Customer c1 = new Customer();

	}

	public static void main(String[] args) {

		System.out.println("main method started !!");

		Customer c1 = new Customer();
		Customer c2 = new Customer();
		Customer c3 = new Customer();
		c1.method1();

		new Customer().toString();// Anonymous Object creation

		// Re-assigining the Object
		c3 = c1;
		System.gc();
		
		//Nullifying the object
		c2 = null;

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

		System.out.println("main method ended !!");

	}

}

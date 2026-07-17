package com.oops.inheritance;

public class Employee implements Cloneable {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("main method started ");

		String name = "Srikanth";
		Integer age = 22;

		System.out.println(name.getClass());// class java.lang.String
		System.out.println(age.getClass());// class java.lang.Integer

		Employee e1 = new Employee();
		System.out.println(e1);

		Employee e2 = (Employee) e1.clone();
		System.out.println(e2);
		System.out.println(e1.equals(e2));// false

		Employee e3 = new Employee();
		Employee e4 = new Employee();
		e3 = e4;
		System.out.println(e3.equals(e4));

		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");

		System.out.println("main method ended ");

	}

}

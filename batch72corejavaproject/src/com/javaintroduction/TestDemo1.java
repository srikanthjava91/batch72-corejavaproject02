package com.javaintroduction;

public class TestDemo1 {

	public static void main(String[] args) throws ClassNotFoundException {

		System.out.println("main method started ");
		Class.forName("com.javaintroduction.Student");
		Class.forName("java.lang.String");
		Class.forName("java.lang.System");
		System.out.println("Student class Loaded Successfully !!");
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("main method ended ");
	}
}

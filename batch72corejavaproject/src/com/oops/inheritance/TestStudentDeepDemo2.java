package com.oops.inheritance;

class Student1 {

	int age;
	String name;

	Address1 add;

	public Student1(int age, String name, Address1 add) {
		super();
		this.age = age;
		this.name = name;
		this.add = add;
	}

	public Student1(Student1 s) {
		this.age = s.age;
		this.name = s.name;
		this.add = new Address1(s.add);
	}

}

class Address1 {
	String city;

	public Address1(String city) {
		this.city = city;
	}
	
	public Address1(Address1 add){
		this.city = add.city;
	}

}

public class TestStudentDeepDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started !!");

		Address1 add = new Address1("Hyderabad");
		Student1 st1 = new Student1(21, "Srinu", add);

		System.out.println(st1.age);
		System.out.println(st1.name);
		System.out.println(st1.add.city);
		System.out.println("**************************");

		Student1 st2 = new Student1(st1);
		System.out.println(st2.age);
		System.out.println(st2.name);
		System.out.println(st2.add.city);
		System.out.println("**************************");
		
		st2.age = 21;
		st2.name = "Nikhil";
		st2.add.city = "Chennai";
		
		System.out.println(st2.age);
		System.out.println(st2.name);
		System.out.println(st2.add.city);
		System.out.println("-------------------------------");

		System.out.println(st1.age);
		System.out.println(st1.name);
		System.out.println(st1.add.city);
	}

}

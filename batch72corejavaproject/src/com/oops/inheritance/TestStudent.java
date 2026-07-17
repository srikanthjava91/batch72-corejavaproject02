package com.oops.inheritance;

class Student implements Cloneable{

	int sid;
	String sname;
	Address address;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public Student(int sid, String sname, Address address) {
		this.sid = sid;
		this.sname = sname;
		this.address = address;
	}

}

class Address {

	String city;

	public Address(String city) {
		this.city = city;
	}

}

public class TestStudent {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("main method started !");

		Address add = new Address("Hyderabad");
		Student s1 = new Student(101, "Advaith", add);

		System.out.println("***********Obj1 info****************");
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address.city);
		System.out.println("***************************");

		Student s2 = (Student) s1.clone();
		System.out.println("***********Obj2 info****************");
		s2.sid = 102;
		s2.sname = "Abhigna";
		s2.address.city = "Bangalore";
		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s2.address.city);
		System.out.println("***************************");
		
		System.out.println("A few moments Later ");
		System.out.println("***********Obj1 info****************");
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address.city);
		System.out.println("***************************");

		

	}

}

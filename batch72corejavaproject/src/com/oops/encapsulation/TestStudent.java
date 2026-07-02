package com.oops.encapsulation;

public class TestStudent {

	public static void main(String[] args) {

		Student s1 = new Student();

		s1.setSid(18);
		s1.setSname("Virat");
		s1.setAge(36);

		System.out.println(s1.getSid());
		System.out.println(s1.getSname());
		System.out.println(s1.getAge());

//		Direct Access from outside of the classes is not possible if the data is priavte.
//		this process will consider Hiding the data from outside of the classes using private keyword.
//		********Stopping the Direct access**************
//		s1.sid = 45;//The field Student.sid is not visible
//		s1.sname = "Rohit";//The field Student.sname is not visible
//		s1.age = 36;//The field Student.age is not visible
//
//		System.out.println(s1.sid);
//		System.out.println(s1.sname);
//		System.out.println(s1.age);

	}

}

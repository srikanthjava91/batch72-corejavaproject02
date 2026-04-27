package com.javaintroduction;

public class Employee {

	// instance
	int eid;
	String ename;

	// static
	static int orgID = 555;
	static String orgName = "Vcube";

	public static void main(String[] args) {
		System.out.println("main method started ");
		System.out.println("Employee Information !");

		Employee emp1 = new Employee();
		emp1.eid = 101;
		emp1.ename = "Srikanth";
		System.out.println("Organization ID: " + orgID);
		System.out.println("Organization Name : " + orgName);
		System.out.println("Employee ID : " + emp1.eid);
		System.out.println("Employee Name : " + emp1.ename);

		System.out.println("************************");
		Employee emp2 = new Employee();
		emp2.eid = 102;
		emp2.ename = "Vishwa";
		System.out.println("Organization ID: " + orgID);
		System.out.println("Organization Name : " + orgName);
		System.out.println("Employee ID : " + emp2.eid);
		System.out.println("Employee Name : " + emp2.ename);

		System.out.println("************************");
		Employee emp3 = new Employee();

		System.out.println("Organization ID: " + orgID);
		System.out.println("Organization Name : " + orgName);
		System.out.println("Employee ID : " + emp3.eid);
		System.out.println("Employee Name : " + emp3.ename);

	}

}

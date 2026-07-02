package com.oops.encapsulation;

//POJO : Plain Old Java Object  
//DTO : Data Transfer Object 
//Data Model 
public class Employee {

	// private variables
	private int eid;
	private String ename;
	private double esal;

//	// toString() method override from Object class
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}

	// no arg constructor
	public Employee() {
		System.out.println("no arg constructor called");
	}

	// all arg constructor
	public Employee(int eid, String ename, double esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}

	// setters & getters
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getEsal() {

		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

}

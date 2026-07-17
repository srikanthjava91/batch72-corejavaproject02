package com.oops.inheritance;

public class Customer {

	int cage;
	String cname;
	long ph;

	@Override
	public String toString() {
		return "Customer [ Customer Age : " + cage 
						+", Customer Name : " + cname
						+", Custome Phone : " + ph + "]";
	}

	public Customer(int cage, String cname, long ph) {
		this.cage = cage;
		this.cname = cname;
		this.ph = ph;
	}

	public static void main(String[] args) {

		Customer c1 = new Customer(21, "Srikanth", 9972677655L);
		System.out.println(c1);// Address of the Object
		System.out.println(c1.toString());

	}

}

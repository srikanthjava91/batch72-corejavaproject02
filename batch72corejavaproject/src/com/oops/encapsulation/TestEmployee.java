package com.oops.encapsulation;

public class TestEmployee {

	public static void main(String[] args) {
		System.out.println("main method started !");

		Employee e1 = new Employee();
		System.out.println(e1);

		Employee e2 = new Employee(101,"Dhoni", 700000.00);
		System.out.println(e2);
		
		e2.setEid(107);
		e2.setEname("Mahendra Singh DHoni");
		e2.setEsal(9000000.00);

		System.out.println(e2);
		System.out.println(e2.getEsal());
		
		System.out.println("main method ende !");
	}

}

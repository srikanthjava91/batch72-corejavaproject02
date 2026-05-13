package in.langfun.methods;

import java.util.Scanner;

//WAP program to print Employee Total Salary which include Basic + bonus.
// with return type 	+ without arguments 
public class TestDemo7 {

	static Scanner sc = new Scanner(System.in);

	double getEmployeeSalary() {

		System.out.println("Enter your salary : ");
		double salary = sc.nextDouble();
		return salary;

	}

	double getBonus() {
		System.out.println("Enter you bnus : ");
		double bonus = sc.nextDouble();
		return bonus;

	}

	public static void main(String[] args) {

		System.out.println("main method started ");

		TestDemo7 t = new TestDemo7();
		double sal = t.getEmployeeSalary();
		double bon = t.getBonus();

		System.out.println("Total Salary : " + (sal + bon));
		System.out.println("main method ended ");

	}

}

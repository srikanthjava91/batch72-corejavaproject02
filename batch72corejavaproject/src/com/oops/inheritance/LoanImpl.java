package com.oops.inheritance;

import java.util.Scanner;

//Parent-class or Super-Class or Base-Class
public class LoanImpl implements Loan {

	static Scanner sc = new Scanner(System.in);

	@Override
	public String getAddressDetails() {

		String address = "";
		System.out.println("Enter flat number: ");
		String flat = sc.next();

		System.out.println("Plat details : ");
		sc.nextLine();
		String plot = sc.nextLine();

		System.out.println("Enter Street : ");
		String street = sc.nextLine();

		System.out.println("Enter City : ");
		String city = sc.next();

		System.out.println("Enter State & Country ");
		String state = sc.next();
		String country = sc.next();

		address = "Flat Number  : " + flat + ", " + "Plot Details : " + plot + ", " + "Street :  " + street + ", "
				+ "City  : " + city + ", " + "State & Country : " + state + "," + country;

		return address;
	}

	@Override
	public boolean isPhoneValid() {
		System.out.println("Enter your phone number : ");
		String phone = sc.next();
		boolean isPhoneValid = phone.matches("[6-9][0-9]{9}");
		return isPhoneValid;
	}

	@Override
	public boolean isAadharValid() {
		System.out.println("Enter your Aadhar number : ");
		String aadhar = sc.next();
		boolean isAadharValid = aadhar.matches("[0-9]{12}");
		return isAadharValid;

	}

	@Override
	public boolean isPANValid() {
		System.out.println("Enter your PAN number : ");
		String pan = sc.next();
		boolean isPanValid = pan.matches("[A-Z]{5}[0-9]{4}[A-Z]");
		return isPanValid;

	}

	@Override
	public double getCustomerSalary() {
		System.out.println("Enter your salary : ");
		double salary = sc.nextDouble();
		return salary;
	}

	@Override
	public int getCibiScore() {
		System.out.println("Enter your Cibil Score : ");
		int cibil = sc.nextInt();
		return cibil;

	}

	@Override
	public int ageInfo() {
		System.out.println("Enter your age  : ");
		int age = sc.nextInt();
		return age;
	}

	public static void method2() {
		System.out.println("Helo static from LOAN IMPL");
	}

	private void method1() {
		System.out.println("Hello Loan IMPL");
	}

	@Override
	public double getROI() {
		return 9.5;
	}

}

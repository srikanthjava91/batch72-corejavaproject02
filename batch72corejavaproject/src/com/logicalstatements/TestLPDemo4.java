package com.logicalstatements;

import java.util.Scanner;

//Nested if else --> Abhinay
//WAP to work with simple nested if condition for basic validation check for Matrimonial site.
public class TestLPDemo4 {

	public static void main(String[] args) {
		System.out.println("Welcome to VCube Matrimonial ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String fullName = sc.nextLine();//
		System.out.println("Hello Mr." + fullName);

		System.out.println("Enter your assets ");
		double assets = sc.nextDouble();

		if (assets >= 50000000.00) {
			System.out.println("Okay to proceed ");

			System.out.println("ENter your salary : ");
			double salary = sc.nextDouble();

			if (salary >= 2500000.00) {
				System.out.println("Okay good to go !!");

				System.out.println("Enter your age ?");
				int age = sc.nextInt();

				if (age <= 28 && age >= 26) {
					System.out.println("Oh good to know your age !!");

					System.out.println("Enter your Height ?");
					double height = sc.nextDouble();

					if (height >= 5.7 && height <= 6.2) {
						System.out.println("Your height is matching with our profile ");

						System.out.println("Enter your weight : ");
						double weight = sc.nextDouble();

						if (weight >= 65 && weight <= 75) {
							System.out.println("Good to procced almost okay to continue ");

							System.out.println("Do you have sibiling ..? ");
							boolean sibStatus = sc.nextBoolean();

							if (!sibStatus) {
								System.out.println("We are good to continue !! Will contact later ");
							} else {
								System.out.println("OMG");
							}

						} else {
							System.out.println("You must join gym dont look for marriage ");
						}

					} else {
						System.out.println("You are too short or too long !!");
					}

				} else {
					System.out.println("Your age is not matching with our profile");

				}

			} else {
				System.out.println("Sorry, Focus on career");
			}

		} else {
			System.out.println("You can leave for the day");
		}

	}

}

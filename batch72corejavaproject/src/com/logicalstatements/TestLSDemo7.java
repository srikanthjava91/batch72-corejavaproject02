package com.logicalstatements;

import java.util.Scanner;

//WAP enter the T-Shirt size and get the Description with the cost..?

public class TestLSDemo7 {

	public static void main(String[] args) {
		System.out.println("Welcome to Online Shpping ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your T-Shirt size : ");
		int size = sc.nextInt();

		switch (size) {

		case 36 -> {
			System.out.println("T-shirt size is Small");
			System.out.println("T-shirt price is 500/-");
		}

		case 38 -> {
			System.out.println("T-shirt size is Medium");
			System.out.println("T-shirt price is 600/-");
		}

		case 40 -> {
			System.out.println("T-shirt size is Large");
			System.out.println("T-shirt price is 650/-");
		}

		case 42 -> {
			System.out.println("T-shirt size is X-Large");
			System.out.println("T-shirt price is 700/-");
		}

		case 44 -> {
			System.out.println("T-shirt size is XX-L");
			System.out.println("T-shirt price is 800/-");
		}

		default -> System.out.println("The size is not available !!");

		}

//		float height = 5.5F;
		// Cannot switch on a value of type float.
//		Only convertible int values, strings or enum variables are permitted
//		switch (height) {
//
//		}

	}

}

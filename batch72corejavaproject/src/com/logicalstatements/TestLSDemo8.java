package com.logicalstatements;

import java.util.Scanner;

//WAP to find the Details of Fruits & vegetables information from a Vegetables shop.
public class TestLSDemo8 {

	public static void main(String[] args) {
		System.out.println("Welcome to Vegetables shop ");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Category ");
		String catg = sc.next();

		switch (catg) {

		case "fruits" -> {
			System.out.println("Enter Item : ");
			String item = sc.next();

			switch (item) {
			case "ap" -> System.out.println("Apple and the price is : 250/- per kg");
			case "orn" -> System.out.println("Oranges and the price is : 100/- per kg");
			case "Bnn" -> System.out.println("Banana and the price is : 50/- for 12P");
			case "gr" -> System.out.println("Grape and the price is : 80/- per kg");
			case "mn" -> System.out.println("Mango and the price is : 100/- per kg");
			default -> System.out.println("Entered item is not available !");
			}

		}

		case "veg" -> {

			System.out.println("Enter Item : ");
			String item = sc.next();

			switch (item) {
			case "tmt" -> System.out.println("Tomato per kg -> 40rs");
			case "ptt" -> System.out.println("Potato per kg -> 50rs");
			case "onn" -> System.out.println("Onion per kg -> 30rs");
			case "brn" -> System.out.println("Brinjal per kg -> 60rs");
			default -> System.out.println("ENtered item not available !");
			}

		}

		}

	}

}

package com.logicalstatements;

import java.util.Scanner;

public class TestLPDemo1 {

	public static void main(String[] args) {

		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a age : ");
		int age = sc.nextInt();// 15

		if (age > 18) {
			System.out.println("Welcome !");
			System.out.println("You are eligible for Voting & Driving ");
		} else {
			System.out.println("You are not eligible for Voting & Driving ");
		}

		System.out.println("main method ended ");

	}

}

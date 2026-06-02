package com.operators;

import java.util.Scanner;

public class TestComparisonDemo5 {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 20;

		System.out.println(a < b);// true
		System.out.println(a > b);// false
		System.out.println(a <= b);// true
		System.out.println(b >= c);// true

		System.out.println(!(a > b));// true

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age ");
		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println("YOu are Eligible for Voting or Driving ");
		}else {
			System.out.println("Arey babu niku inka time undi ra !");
		}

	}

}

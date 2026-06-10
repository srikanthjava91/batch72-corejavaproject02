package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP to print sum of the 0 to N numbers?
public class TestLPDemo7 {

	static void findSum(int n) {
		int sum = 0;

		for (int i = 0; i <= n; i++) {
			sum = sum + i;
		}

		System.out.println("Sum is : " + sum);
	}

	static void findFactorial(int n) {
		int fact = 1;

		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}

		System.out.println("Factorial of a Given number is : " + fact);
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();// 100

		findSum(n);
		findFactorial(n);

	}

}

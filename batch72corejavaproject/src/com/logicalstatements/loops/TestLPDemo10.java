package com.logicalstatements.loops;

import java.util.Scanner;

//Prime numbers are natural numbers greater than 1 that have exactly 
//two distinct positive divisors: 1 and the number itself. 
//This means they cannot be divided evenly by any other numbers. 
public class TestLPDemo10 {

	static boolean isPrime(int n) {
		boolean status = true;

		if (n <= 1) {
			return false;
		}

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}
		return status;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for Prime numbers Range ?");// 1 to 100
		int n = sc.nextInt();// 10

		for (int i = 1; i <= n; i++) {

			if (isPrime(i)) {
				System.out.println(i);// 2 3 5 7
			}

		}

	}
}

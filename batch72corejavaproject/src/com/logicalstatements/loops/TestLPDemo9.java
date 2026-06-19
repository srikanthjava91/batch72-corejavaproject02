package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP to print Fibonacci series ..? 
//0 1 1 2 3 5 8 13 21 
public class TestLPDemo9 {

	static void fibonacci(int n) {

		int n1 = 0;
		int n2 = 1;

		System.out.print(n1 + " " + n2);// 0 1 1

		for (int i = 1; i <= n - 2; i++) {
			int n3 = n1 + n2;

			if (n3 <= 10) {
				System.out.print(" " + n3); // 1
				n1 = n2;
				n2 = n3;
			}

		}

	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers you want to print ?");
		int n = sc.nextInt();
		fibonacci(n);

		sc.close();
		System.out.println("main method ended ");

	}

}

package com.logicalstatements.loops;

import java.util.Scanner;

//Perfect number means : Sum of it's factors excluding the Given number.
//ex: 6 --> 1+2+3 = 6 -> true 
//ex: 28 --> 1+2+4+7+14 = 28 --> true 
//ex: 24 --> 1+2+3+4+6+8+12 = 36 --> false 
//Q) WAP to find the Given number is Perfect or not ..? 
//input is --> number 
//output is --> boolean.
public class TestLPDemo5 {

	static boolean isPerfect(int n) {
		boolean status = false;
		int sum = 0;// 1 3 6

		for (int i = 1; i <= n / 2; i++) {

			if (n % i == 0) {
				sum = sum + i;
			}
		}

		if (n == sum) {
			status = true;
		}

		return status;
	}

	public static void main(String[] args) {
		System.out.println("main method started !");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is Perfect or not ..?");
		int n = sc.nextInt();

		boolean flag = isPerfect(n);

		if (flag== true) {
			System.out.println("The given number is Perfect !!");
		} else {
			System.out.println("The Given numbe ris not perfect !!");
		}

		System.out.println("main method started !");
	}

}

package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP to find the Given number is ArmStrong or not ..? 
//An Armstrong number (also known as a Narcissistic number) is a number 
//that is equal to the sum of its own digits 
//each raised to the power of the number of digits. 
//For example, 153 is an Armstrong number because (1^3 + 5^3 + 3^3 = 153).

//Armstrong number is number which is sum of it's Each digit power based on Digit COunt.
//input is 153 --> 1^3 + 5^3+ 3^3 = 1 + 125 +27 = 153 is a Armstrong number 
//input is 133 --> 1^3 + 3^3 + 3^3 = 1 + 27 + 27 =55 is not a Armstrong number

//input is 1 --> 1 ^1 : it is a Armstrong number 
//input is 23 --> 2^2 + 3^2 = 13 --> it is not an Armstrong number
//input 1634 = 1 ^4 + 6^4+ 3^4 + 4^4 = 1+ 1296 + 81 + 256 = 1634 

public class TestLPDemo15 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		boolean status = isArmstrong(n);

		if (status) {
			System.out.println("The Given number is Armstrong number ");
		} else {
			System.out.println("The Given number is not an Armstrong number ");
		}

	}

	// 153
	private static boolean isArmstrong(int n) {
		boolean status = false;

		int r = 0;
		int sumP = 0;
		int temp = n;

		int digitCount = Integer.toString(n).length();

		while (n > 0) {
			r = n % 10;// 3 5 1
			n = n / 10;// 15 1 0
			sumP = (int) (sumP + Math.pow(r, digitCount));

		}

		if (sumP == temp) {
			status = true;
		}

		return status;
	}

}

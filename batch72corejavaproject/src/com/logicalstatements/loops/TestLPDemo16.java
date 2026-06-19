package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to convert Decimal number to Binary number ..? 0 1
//input 10 --> output should be 1010 
public class TestLPDemo16 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		decimalToBinary(n);

	}

	// 18
	private static void decimalToBinary(int n) {

		int r = 0;
		String bn = "";

		while (n > 0) {
			r = n % 2;// 18%2=0, 9%2=1,4%2=0, 2%2=0,1%2=1 --> 0 1 0 0 1
			n = n / 2;// 18/2=9, 9/2=4,4/2=2,2/2=1,1/2=0
			bn = r + bn;
		}

		System.out.println("The Binary number is : " + bn);

	}

}

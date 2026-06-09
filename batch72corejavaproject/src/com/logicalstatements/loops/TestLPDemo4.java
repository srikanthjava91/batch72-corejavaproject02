package com.logicalstatements.loops;

import java.util.Scanner;

//Factors of a number are integers that divide the number 
//evenly without leaving any remainder.
//For example, the factors of 12 are 1, 2, 3, 4, 6, and 12 because each of these numbers divides 12 perfectly 
//Q) WAP to print Divisors or factors of a Given number ..? 
//input 14 --> 1 2 7 14 
//input 6 --> 1 2 3 6 

//input is 28 --> 1 2 4 7 14 = 28 --> This is called Perfect number 
public class TestLPDemo4 {

	static void findFactors(int n) {
		for (int i = 1; i <= n/2; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
		System.out.println(n);
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find factors of a given number ");
		int n = sc.nextInt();
		findFactors(n);
		System.out.println("main method ended ");
	}
}

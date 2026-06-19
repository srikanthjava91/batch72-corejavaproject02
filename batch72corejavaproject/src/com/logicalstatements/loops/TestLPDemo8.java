package com.logicalstatements.loops;

import java.util.Scanner;

//Factorial : 5 --> 5*4 *3*2*1 = 120 
//WAP to print Factorial of a Given number using Recursion ..?

//// 5 * findFact(4) --> 120
// 4 * findFact(3) --> 24
// 3 * findFact(2) --> 6
// 2 * findFact(1) --> 2
// return 1;
public class TestLPDemo8 {

	static int findFact(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * findFact(n - 1);
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number  : ");
		int n = sc.nextInt();

		int fact = findFact(n);
		System.out.println("Factorial of a Given number: " + fact);
		
		sc.close();
	}
}

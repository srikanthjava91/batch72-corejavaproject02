package com.logicalstatements.loops;

import java.util.Scanner;

// WAP to find Digits of Given number ..?
// input is : 3456 --> output :  4
//input is : 123--> output 3
//input is : 4567889 --> output 7 
public class TestLPDemo13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find Digits");
		int n = sc.nextInt();// 567
		int temp = n;// 567

		int r = 0;

		int count = 0;

		while (n > 0) {
			r = n % 10;// r = 567%10 --> 7, r =56%10--> 6, r = 5%10 --> 5
			n = n / 10;// n = 567/10 --> 56, n = 56/10 --> 5, n = n/10 --> 0
			count++;// 1 2 3
		}

		System.out.println("The Give numbers digit count is : " + count);
		System.out.println("************************");

		String str = Integer.toString(temp);
		int digitCount = str.length();
		System.out.println("The Give numbers digit count is : " + digitCount);

		sc.close();

	}

}

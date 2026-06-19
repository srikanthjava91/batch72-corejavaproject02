package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to print Reverse of The Given number ..? 
//WAP to print the Given number is Palindrome or not 
//inpiut is : 123 --> output is --> 321
//inpiut is : 567 --> output is --> 765
//inpiut is : 121 --> output is --> 121 --> the Given number is Palindrome 
public class TestLPDemo14 {

	// 321 --> 123
	static int reverseNumber(int n) {
		int rev = 0;
		int r = 0;

		while (n > 0) {
			r = n % 10;// --> 321%10=1,32%10=2, 3%10=3
			n = n / 10;// --> 321/10 = 32, 32/10 =3, 3/20 =0
			rev = rev * 10 + r;// 123
		}

		return rev;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		int rev = reverseNumber(n);
		System.out.println("The Reverse number of a Given  number is : " + rev);

		if (n == rev) {
			System.out.println("The Given number is Palindrome !");
		} else {
			System.out.println("The Given number is Not a Palindrome ");
		}
		sc.close();
	}
}

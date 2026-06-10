package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP to print Multiplication Table based on your Given number ..?
//If the Given number is 10, we need to print 10th table 
//10 X 1 = 10 
//10 X 2 = 20 
//10 X 3 = 30 
//10 X 4 = 40 
//10 X 5 = 50 
//10 X 6 = 60 
//10 X 7 = 70 
//10 X 8 = 80 
//10 X 9 = 90 
//10 X 10 = 100 

public class TestLpDemo6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		System.out.println("Up to where you want to print ?");
		int n1 = sc.nextInt();

		for (int i = 1; i <= n1; i++) {
			System.out.println(n + " X " + i +" = " +  (n*i));
		}

	}
}

package com.operators;

import java.util.Scanner;

//Ternary Operator : syntax is : 
// (condition)?value1:value2

public class TestTernaryOpDemo1 {

	public static void main(String[] args) {

		//// find min or Max number from Given two numbers ..?
		int a = 10;
		int b = 20;
		int max = (a > b) ? a : b;
		System.out.println(max);

		// find the given age valid for Driving or not ..?
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a age : ");
		int age = sc.nextInt();
		String info = (age > 18) ? "Valid" : "Invalid";
		System.out.println("The entered age is : " + info);

		// find max value from 3 values
		int x = 10;
		int y = 20;
		int z = 30;
		int max1 = (x > y) 
					? ((x > z) ? x : z) 
					: ((y > z) ? y : z);
		System.out.println(max1);
	}

}

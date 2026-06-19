package com.arrays;

import java.util.Scanner;

//WAP to Read the Elements from Scanner for an array of elements..?
public class TestArrayDemo7 {
	public static void main(String[] args) {
		System.out.println("main method started !");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Size : ");
		int size = sc.nextInt();// 5
		int[] arr = new int[size];// n = size, index --> 0 to size-1

		System.out.println("Read the Elements from an console : ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Representing an Array ");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}

		System.out.println("main method ended !");

	}
}

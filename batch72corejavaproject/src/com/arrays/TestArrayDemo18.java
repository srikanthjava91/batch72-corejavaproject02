package com.arrays;

import java.util.Scanner;

public class TestArrayDemo18 {

	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();

		Thread.sleep(1000);

//		System.out.println(10/0);
//		System.out.println(10.5 / 0);

		int[][] arr[] = new int[2][3][4]; // 0 1 2 | 0 1 2 | 0 1 2

		// 000 001 002
		// 010 011 012
		// 020 021 022
		System.out.println(arr.length);// 2
		System.out.println(arr[0].length);// 3
		System.out.println(arr[0][0].length);// 4

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.print(arr[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}

		for (int[][] arr2 : arr) {
			for (int[] arr1 : arr2) {
				for (int a : arr1) {
					System.out.print(a + " ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}
}

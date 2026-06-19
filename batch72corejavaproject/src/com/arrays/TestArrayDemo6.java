package com.arrays;

//WAP to find min & max number from Given Array ..? 
public class TestArrayDemo6 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		int  arr [] = { 4, 10, 1, 2, 15, 55, 32 };

		int min = arr[0];// 4 1
		int max = arr[0];// 4 10 15 55

//		for (int i = 1; i < arr.length; i++) {
//			if (arr[i] < min) {
//				min = arr[i];
//			} else if (arr[i] > max) {
//				max = arr[i];
//			}
//		}

		for (int a : arr) {
			if (a < min) {
				min = a;
			} else if (a > max) {
				max = a;
			}
		}

		System.out.println("Minimum number from an array is : " + min);
		System.out.println("Maximum number from an array is : " + max);

	}

}

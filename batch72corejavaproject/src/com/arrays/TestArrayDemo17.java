package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

//WAP to print Array in Rotational Order From Right to left based given number.?
public class TestArrayDemo17 {

	void reverseArray(int[] arr, int start, int end) {

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}

	void rotationalArray(int[] arr, int r) {
		int start = 0;
		int end = arr.length - 1;
		r = r % arr.length;// 10%8= 2

//		Step 1 : Reverse Total Array 
		reverseArray(arr, start, end);

//		Step 2 : Reverse first half Array 
		reverseArray(arr, start, r - 1);

//		Step 3 : Reverse 2nd half Array 
		reverseArray(arr, r, end);

	}

	void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many time you want to Rotation ..?");
		int r = sc.nextInt();

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };// 10

//		if (r < arr.length) {
//			rotationalArray(arr, r);
//		} else {
//			System.out.println("Given r value is out of range !");
//		}

		rotationalArray(arr, r);

		System.out.println(Arrays.toString(arr));

	}

}

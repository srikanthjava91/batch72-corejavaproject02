package com.arrays;

import java.util.Arrays;

//Reverse an Array with Swapping ?
public class TestArrayDemo16 {

	void reverseArray(int[] arr) {
		int start = 0;// 0
		int end = arr.length - 1;// 4

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}

	void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 2, 5 };
		reverseArray(arr);

//		Arrays.sort(arr);

		System.out.println("After Reverse :");
		System.out.println(Arrays.toString(arr));
		
//		for (int a : arr) {
//			System.out.print(a + " ");
//		}

	}

}

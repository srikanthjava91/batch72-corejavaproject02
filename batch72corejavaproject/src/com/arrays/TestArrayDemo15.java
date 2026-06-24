package com.arrays;

public class TestArrayDemo15 {

	void selectionSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;// 10 3

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}

			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;

		}
	}

	void main(String[] args) {
		int[] arr = { 10, 3, 4, 5, 15 };

		System.out.println("Before Sorting : ");

		for (int a : arr) {
			System.out.print(a + " ");
		}

		System.out.println();

		selectionSort(arr);

		System.out.println("After Sorting : ");
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

}

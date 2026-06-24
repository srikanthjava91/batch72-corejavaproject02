package com.arrays;

public class TestArrayDemo14 {

	void bubbleSort(int[] arr) {
		int count = 0;
		int count1 = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			boolean swapped = false;
			count++;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				count1++;
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}

			if (!swapped) {
				break;
			}

		}

		System.out.println(count);
		System.out.println(count1);

	}

	void main(String[] args) {

		int[] arr = { 1, 2, 3, 4 };

		System.out.println("Before Sorting : ");

		for (int a : arr) {
			System.out.print(a + " ");
		}

		System.out.println();

		bubbleSort(arr);

		System.out.println("After Sorting : ");
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

}

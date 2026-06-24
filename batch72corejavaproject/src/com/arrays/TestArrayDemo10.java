package com.arrays;

///Q) WAP to copy 2 Arrays into another array.?
public class TestArrayDemo10 {

	public static void main(String[] args) {

		int[] a = { 10, 20, 30 };// 3 --> 0 1 2
		int[] b = { 40, 50, 60 };// 3 --> 0 1 2
		int[] c = new int[a.length + b.length];// 6 --> 0 1 2 3 4 5

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}

		for (int i = 0; i < b.length; i++) {
			c[a.length + i] = b[i];
		}

		System.out.println("Represent an Array : ");
		for (int e : c) {
			System.out.print(e + " ");
		}

	}

}

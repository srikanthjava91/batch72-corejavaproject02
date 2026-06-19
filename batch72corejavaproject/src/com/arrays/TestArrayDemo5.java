package com.arrays;

//WAP to print array in reverse order ..? 
public class TestArrayDemo5 {

	public static void main(String[] args) {

		int[] n = { 10, 20, 30, 40, 50 };// n=5 --> index = 0 1 2 3 4
		for (int i = n.length - 1; i >= 0; i--) {
			System.out.println(n[i]);
		}
	}
}

package com.arrays;

public class TestArrayDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

//		int a;
//		System.out.println(a);//The local variable a may not have been initialized

		int[] numbers = new int[5];// 0 1 2 3..... 9

		numbers[0] = 101;
		numbers[1] = 102;
		numbers[2] = 103;

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		System.out.println("main method started ");

	}

}

package com.arrays;

//WAP to print 5 different ages using Arrays.?
public class TestArrayDemo1 {

	public static void main(String[] args) {

		System.out.println("main method started !");

		// Step1 : Declaration
		int[] ages;

		// Step2 : Creation
//		ages = new int[];//CE : Variable must provide either dimension expressions or an array initializer
		ages = new int[5];// 0 1 2 3 4

		// Step3 : Initialization
		ages[0] = 21;
		ages[1] = 22;
		ages[2] = 23;
		ages[3] = 21;
		ages[4] = 22;

		// Step4 :Representation
//		System.out.println(ages[0]);
//		System.out.println(ages[1]);
//		System.out.println(ages[2]);
//		System.out.println(ages[3]);
//		System.out.println(ages[4]);

//		for (int i = 0; i < ages.length; i++) {
//			System.out.println(ages[i]);
//		}
		
		for(int age:ages) {
			System.out.println(age);
		}

	}

}

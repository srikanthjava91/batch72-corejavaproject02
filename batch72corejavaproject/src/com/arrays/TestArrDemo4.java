package com.arrays;

//WAP to find sum and avg of all the marks .? 
public class TestArrDemo4 {

	public static void main(String[] args) {

//		int[] numbers = new int[-5];//java.lang.NegativeArraySizeException: -5

		int[] marks = { 89, 92, 78, 86, 98, 89 };
		System.out.println(marks);// Address of the Array Object : [I@2b2fa4f7
		System.out.println(marks.length);

		double sum = 0;// 89 -> 181 -> 259 -> 345 -> 443 -> 532
		double avg = 0;

//		for (int i = 0; i < marks.length; i++) {
//			sum = sum + marks[i];
//		}
//

		for (int m : marks) {
			sum = sum + m;
		}

		avg = sum / marks.length;

		System.out.println("Total Marks : " + sum);
		System.out.println("Avg of all marks : " + avg);

	}

}

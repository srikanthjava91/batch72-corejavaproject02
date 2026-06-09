package com.logicalstatements.loops;

//Q) WAP to print 2 to 100 even numbers ..? 
public class TestLPDemo3 {

	public static void main(String[] args) {

//		for (int i = 2; i <= 10; i = i + 2) {
//			System.out.println(i);
//		}

//		2 % 10 --> 2 
//		10% 2--> 0 O(n) --> O(1)
		for (int i = 2; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("even : " + i);
			}
		}
		System.out.println("****************");

		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.println("odd : " + i);
			}
		}

	}

}

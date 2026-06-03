package com.logicalstatements;

import java.util.Scanner;

public class TestLPDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Are you Attending classes Regularly ? ");
		boolean areYouAttendingClassesRegularly = sc.nextBoolean();

		System.out.println("Are you practicing daily minimum 4 to 6 hrs ");
		boolean areYouPracticing = sc.nextBoolean();

		System.out.println("Are You Attending every week mock interview ");
		boolean areYouAttendingMocks = sc.nextBoolean();

		System.out.println("Are you attending Drives ..? ");
		boolean areYouAttendingDrives = sc.nextBoolean();

		if (areYouAttendingClassesRegularly && areYouPracticing && areYouAttendingMocks || areYouAttendingDrives) {
			System.out.println("Yes !! Good job you will get job in 6 to 7 months ");
		} else {
			System.out.println("You are cheating Your parents !!");
		}

		System.out.println("main method ended ");

	}
}

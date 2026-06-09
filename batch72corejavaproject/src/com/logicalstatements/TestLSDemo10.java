package com.logicalstatements;

import java.util.Scanner;

//WAP to find the Students Grade based on their marks.
//Here we are using yield keyword in switch cases.

public class TestLSDemo10 {

	static Scanner sc = new Scanner(System.in);

	static String getGradeInfo(int marks) {

		System.out.println("Enter how many subjects ");
		int subjects = sc.nextInt();

		String grade = switch ((marks / subjects) / 10) {
		case 10, 9 -> {

			yield "Grade A";

		}
		case 8 -> {
			System.out.println("Results are Good  ");
			yield "Grade B";
		}

		case 6, 7 -> {
			System.out.println(" Results are Average ");
			yield "Grade C";
		}

		case 5, 4 -> {
			System.out.println("Just Passed : ");
			yield "Grade D";
		}

		default -> "Grade F";
		};

		return grade;

	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		System.out.println("Enter your marks ");

		int marks = sc.nextInt();
		System.out.println("Results : " + getGradeInfo(marks));

		System.out.println("main method ended ");
	}

}

package com.logicalstatements;

import java.util.Scanner;

//WAP related to Days 
//-> If I give 1 --> Sunday, 2--> Monday, 3--> Tuesday, 
//4 --> Wednesday, 5--> Thursday, 6--> Friday, 7--> Saturday 
public class TestLSDemo9 {

	static String getDayInfo(int day) {

		String result = switch (day) {
		case 1 -> "Sunday";
		case 2 -> "Monday";
		case 3 -> "Tuesday";
		case 4 -> "Wednesday";
		case 5 -> "Thursday";
		case 6 -> "Friday";
		case 7 -> "Saturday";
		default -> "unknown";

		};

		return result;

	}

	public static void main(String[] args) {
		System.out.println("main method staretd ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number to know the day :");
		int day = sc.nextInt();

		String result = getDayInfo(day);
		System.out.println("The Day is : " + result);
		
		sc.close();

		System.out.println("main method ended ");
	}

}

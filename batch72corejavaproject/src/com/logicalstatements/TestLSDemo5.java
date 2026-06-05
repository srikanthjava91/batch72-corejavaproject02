package com.logicalstatements;

import java.util.Scanner;

//WAP to print the Cricketer details based on their Jersey number..?
public class TestLSDemo5 {

	public static void main(String[] args) {
		System.out.println("Welcome to Indian Cricket Team ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Jersey number to find the deatils : ");
		int jno = sc.nextInt();

		switch (jno) {

		case 1:
			System.out.println("K L Rahul ");
			System.out.println("Wicket Keeper & Righ Hand Batsmen !");
			break;
		case 7:
			System.out.println("M S Dhoni");
			System.out.println("Thala For a Reason !");
			System.out.println("Wicket Keerp & Finisher ");
			break;
		case 18:
			System.out.println("Virat Kohli");
			System.out.println("Chase master & Consistent Player ");
			break;
		case 45:
			System.out.println("Rohit Sharma");
			System.out.println("Hitman !");
			break;
		case 4:
			System.out.println("Abhishek Sharma");
			System.out.println("Aya Sher  !!");
			break;
			
		default: 
			System.out.println("Unknow player from a Team ");
	}

	}

}

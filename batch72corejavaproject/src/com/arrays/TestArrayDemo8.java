package com.arrays;

import java.util.Scanner;

//WAP to Read the String ELements From an Array and Represent Whose Names starts with S.
public class TestArrayDemo8 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size :");
		int size = sc.nextInt();

		String[] arr = new String[size];
		sc.nextLine();
		System.out.println("Read the Elements from a Console : ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextLine();
		}

		System.out.println("Represent an ARray : ");

		for (String name : arr) {
			
			if(name.startsWith("S")) {
				System.out.println(name);
			}
			
		}

	}

}

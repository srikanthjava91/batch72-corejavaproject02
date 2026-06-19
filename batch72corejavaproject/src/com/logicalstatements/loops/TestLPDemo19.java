package com.logicalstatements.loops;

import java.util.Scanner;

public class TestLPDemo19 {

	public static void main(String[] args) {
		System.out.println("main method staretd ");
		Scanner sc = new Scanner(System.in);
		String yn = "";

		do {

			System.out.println("Enter a number: ");
			int n1 = sc.nextInt();

			System.out.println("Enter a number: ");
			int n2 = sc.nextInt();

			System.out.println("Enter a Symbol");
			String symb = sc.next();

			switch (symb) {

			case "+" -> System.out.println("Addition: " + (n1 + n2));
			case "-" -> System.out.println("Sub: " + (n1 - n2));
			case "*" -> System.out.println("Mul: " + (n1 * n2));
			case "/" -> System.out.println("Div: " + (n1 / n2));
			case "%" -> System.out.println("Mod: " + (n1 % n2));

			default -> System.out.println("Invalid Symbole to proceed !");

			}

			System.out.println("Do you want to Continue ..? Click Y for Yes N for No !");
			yn = sc.next();

		} while (yn.equalsIgnoreCase("Y"));
		System.out.println("main method ended ");
	}

}

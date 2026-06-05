package com.logicalstatements;

import java.util.Scanner;

//WAP to print the result of two calculated values based on entered symbol.
public class TestLSDemo6 {

	public static void main(String[] args) {
		System.out.println("Calculator Information ");

		Scanner sc = new Scanner(System.in);
		
		String yn = "";
		
		do {
			System.out.println("Enter first number ");
			int n1 = sc.nextInt();

			System.out.println("Enter second number ");
			int n2 = sc.nextInt();

			System.out.println("Enter a Symbol to proceed with calculations : ");
			String symb = sc.next();

			switch (symb) {

			case "+" -> {
				System.out.println("Sum ");
				System.out.println("Addition " + (n1 + n2));
			}

			case "-" -> System.out.println("Subtraction " + (n1 - n2));

			case "*" -> System.out.println("Multiplication " + (n1 * n2));

			case "/" -> System.out.println("Division " + (n1 / n2));

			case "%" -> System.out.println("Modulus " + (n1 % n2));

			default -> System.out.println("You entered Unknown Symbol ");

			}
			
			System.out.println("Do you want to Continue : Click Y for Yes N for NO ..? ");
			yn = sc.next();
			
		}while(yn.equalsIgnoreCase("Y"));
		

	}

}

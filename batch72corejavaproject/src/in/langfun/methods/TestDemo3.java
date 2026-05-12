package in.langfun.methods;

import java.util.Scanner;

public class TestDemo3 {

	static void addition(int a, int b) {
		int sum = a + b;
		System.out.println("SUm " + sum);
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number 1 : ");
		int x = sc.nextInt();// 100

		System.out.println("Enter a Number 2 : ");
		int y = sc.nextInt();// 200

		addition(x, y);

		System.out.println("main method ended ");

	}

}

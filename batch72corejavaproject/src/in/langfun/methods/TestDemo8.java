package in.langfun.methods;

import java.util.Scanner;

//WAP to print Areas of Square, Rectangle, Triangle, & circle 
// Square : side * side 
//Rectangle : Length * breadth 
//Triangle : 0.5 * base * height 
//Circle 	: PI * r * r 

public class TestDemo8 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Side : ");
		double side = sc.nextDouble();
		double arsq = findAreaOfSquare(side);
		System.out.println("Area of Square is : " + arsq);

		System.out.println("Enter length : ");
		double l = sc.nextDouble();
		double b = sc.nextDouble();
		System.out.println("Area of Rectangle is : " + findAreaOfRectangle(l, b));

		System.out.println("Enter Base ");
		double base = sc.nextDouble();
		System.out.println("Enter Height ");
		double height = sc.nextDouble();

		System.out.println("Area of Triangle is: " + findAreaOfTriangle(base, height));

		System.out.println("Enter Radius :");
		double radius = sc.nextDouble();
		double arCir = findAreaOfCircle(radius);
		System.out.println("Area of Circle is : " + arCir);

	}

	static double findAreaOfCircle(double r) {
		return Math.PI * r * r;
	}

	static double findAreaOfSquare(double side) {
		return side * side;
	}

	static double findAreaOfRectangle(double length, double breadth) {
		return length * breadth;
	}

	static double findAreaOfTriangle(double base, double height) {
		return 0.5 * base * height;
	}

}

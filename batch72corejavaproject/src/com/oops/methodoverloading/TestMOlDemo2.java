package com.oops.methodoverloading;

//byte short int long float double 
//WPA to find Areas of Rectangle, Square, Circle & Triangle 
public class TestMOlDemo2 {

	void main(String[] args) {
		System.out.println("main method started");

		System.out.println("Rectangel Area : " + findArea(100.5, 50.9));
		System.out.println("Circle : " + findArea(10));
		System.out.println("Square " + findArea(10.5));
		System.out.println("Triangle : " + findArea(10, 6));

	}

//	Areas of Rectangle
	double findArea(double length, double breadth) {
		return length * breadth;
	}

//	Area of Square 
	double findArea(double side) {
		return side * side;
	}

//	Area of Circle 
	float findArea(float r) {
		return (float) (Math.PI * r * r);
	}

//	 Area of Triangle : 0.5 * base * height
	Double findArea(double base, float height) {
		return 0.5 * base * height;
	}

}

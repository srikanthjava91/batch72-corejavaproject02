package com.logicalstatements.loops;

//WAP to swap two numbers by using temp variable ..? 
//WAP to swap two numbers without using 3rd variable ..?
//WAP to swap two numbers  using 3rd variable .Bitwise Operators. ^?
public class TestLPDemo20 {

	public static void main(String[] args) {

		int a = 30;
		int b = 20;
		
		int x,y = 10;
//		int z = 10,20;
		
//		System.out.println(x);
//		System.out.println(y);

//		int temp = a;
//		a = b;
//		b = temp;

		a = a + b;// 50
		b = a - b;// 30
		a = a - b;// 20

		System.out.println("A value : " + a);
		System.out.println("B value : " + b);

	}

}

package com.operators;

public class TestUnaryOpDemo2 {

	public static void main(String[] args) {

		int a = 8;
		int b = 9;

		System.out.println(--a);//7
		System.out.println(++a);//8
		System.out.println(a++);//8 --> 9
		System.out.println(b--);//9 --> 8 
		System.out.println(a++);//9 --> 10 
		System.out.println(a--);//10 --> 9 
		System.out.println(--b);//7
		System.out.println(--b);//6
		System.out.println(--a);//8
		System.out.println(a++);//8 --> 9 
		System.out.println(b++);//6 --> 7 

		System.out.println(a + b);//16 
		System.out.println("A value : " + a);//9  
		System.out.println("B value : " + b);//7 --> 6  
		//17+ 20 
		System.out.println(++a + b-- + a++ + --a);
//		System.out.println(++a + b-- + a++ + --a + a++ + --b + ++b);

	}

}

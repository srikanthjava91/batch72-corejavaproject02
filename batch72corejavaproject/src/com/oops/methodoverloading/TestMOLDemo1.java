package com.oops.methodoverloading;

public class TestMOLDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		
		TestMOLDemo1 t = new TestMOLDemo1();

		byte b = 10;
		short s = 5645;
		int count = 300000;
		long ph = 9972677655L;

		float height = 5.8F;
		double weight = 75.5;

		char c = 'A';
		boolean status = false;

		String name = "Srikanth";
		char[] ch = { 'A', 'p', 'p' };

		System.out.println(b);// byte
		System.out.println(s);// short
		System.out.println(count);// int
		System.out.println(ph);// long

		System.out.println(height);//float
		System.out.println(weight);//double

		System.out.println(c);//char
		System.out.println(status);//boolean

		System.out.println(name);//String
		System.out.println(ch);//Array of charcaters 
		
		System.out.println();
		System.out.println(t);//Object 
		

	}

}

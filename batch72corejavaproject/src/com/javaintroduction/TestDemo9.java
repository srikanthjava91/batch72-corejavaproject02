package com.javaintroduction;

public class TestDemo9 {

	{
		System.out.println("instance block loaded1 ");
	}

	static public void main() {

		TestDemo9 t = new TestDemo9();
		System.out.print("main method started with no args !");
		System.out.print(100);
		System.out.print(9972677655L);
		System.out.println();
		System.out.print(t);
		System.out.print(10.5F);
		System.out.print(10.5D);

	}

	{
		System.out.println("instance block loaded2 ");
	}

}

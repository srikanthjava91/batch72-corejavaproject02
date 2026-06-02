package com.operators;

public class TestternaryDemo2 {

	public static void main(String[] args) {

		int a = 10;
		int b = 100;
		int c = 1000;

		int max = (a>b)
				?((a>c)?a:c)
				:((b>c?b:c));
		
		System.out.println(max);
		
	}

}

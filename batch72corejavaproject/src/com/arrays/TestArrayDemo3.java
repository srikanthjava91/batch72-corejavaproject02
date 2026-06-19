package com.arrays;

public class TestArrayDemo3 {

	public static void main(String[] args) {
		System.out.println("main method staretd ");

		String[] names = new String[5];// 0 1 2 3 4 -- null null null null null

		names[0] = "Core Java";
		names[1] = "Adv Java";
		names[2] = "Spring";
		names[3] = "React";
		names[4] = "Javascript";
//		names[5] = "HTML";//ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5

//		for (int i = 0; i < names.length; i++) {
//			System.out.println(names[i]);
//		}
		
		for(String name:names) {
			System.out.println(name);
		}
		
		System.out.println("main method ended ");

	}

}

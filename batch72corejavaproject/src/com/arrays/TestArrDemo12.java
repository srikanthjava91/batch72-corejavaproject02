package com.arrays;

public class TestArrDemo12 {

	public static void main(String[] args) {

		String[][] names = new String[3][2];// 0 1 2 --> 0 1

		// 00 01
		// 10 11
		// 20 21

		names[0][0] = "ID";
		names[0][1] = "Name";

		names[1][0] = "101";
		names[1][1] = "Srikanth";

		names[2][0] = "102";
		names[2][1] = "Vishwa";

//		for (String[] arr1 : names) {
//			for (String name : arr1) {
//				System.out.print(name + " ");
//			}
//			System.out.println();
//		}

		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[i].length; j++) {
				System.out.print(names[i][j] + " | ");
			}
			System.out.println();
		}

	}

}

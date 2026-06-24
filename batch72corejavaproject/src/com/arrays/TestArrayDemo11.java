package com.arrays;

public class TestArrayDemo11 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		int[][] arr = new int[3][3];// 0 1 2 ----> 0 1 2

//		00 01 02 
//		10 11 12 
//		20 21 22 

		arr[0][0] = 5;
		arr[0][1] = 50;
		arr[0][2] = 500;

		arr[1][0] = 6;
		arr[1][1] = 60;
		arr[1][2] = 600;

		arr[2][0] = 6;
		arr[2][1] = 60;
		arr[2][2] = 600;

//		for(int[] a1:arr) {
//			for(int a:a1) {
//				System.out.print(a + " ");
//			}
//			System.out.println();
//		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}

}

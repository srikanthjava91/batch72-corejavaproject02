package com.arrays;

public class TestArrayDemo18 {

	public static void main(String[] args) {
		int[][][] arr = new int[3][3][3]; //0 1 2 |  0 1 2 | 0 1 2
	
		//000  001 002 
		//010  011 012 
		//020  021 022 
		
		for(int[][] arr2 :arr) {
			for(int[] arr1:arr2) {
				for(int a:arr1) {
					System.out.print(a +" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
}

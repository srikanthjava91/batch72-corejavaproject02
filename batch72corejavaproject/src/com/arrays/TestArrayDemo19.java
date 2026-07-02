package com.arrays;

public class TestArrayDemo19 {

	public static void main(String[] args) {
		
		int[][][] arr = {{{10,20,30,40},{50,60},{70,80}},
						 {{90,100},{110,120}},
						 {{1,2,3,4},{5,6},{7,8,9},{10}}
						};
		
		for(int[][]arr2:arr) {
			for(int[] arr1:arr2) {
				for(int a:arr1) {
					System.out.print(a + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}

}

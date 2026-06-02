package com.operators;

//6) Bitwise Operators --> & | ^ ~ 
public class TestBitwiseOpDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		System.out.println("******** & **************");
		System.out.println(true & true);// true --> 1& 1 --> 1
		System.out.println(true & false);// false --> 1& 0 --> 0
		System.out.println(false & true);// false --> 0 & 1 --> 0
		System.out.println(false & false);// false --> 0 & 0 --> 0

		System.out.println("----------------------------");

		System.out.println(72 & 43);// 8

		System.out.println(18 & 45);// 0
		System.out.println(99 & 37);// 33
		System.out.println(76 & 10);// 8
		System.out.println(67 & 77);// 65

		System.out.println("***************** | ************");

		System.out.println(72 | 43);// 107

		System.out.println(18 | 45);// 63
		System.out.println(99 | 37);// 103
		System.out.println(76 | 10);// 78
		System.out.println(67 | 77);// 79

		System.out.println("***************** ^ ************");
		System.out.println(true ^ true);// false --> 1& 1 --> 0
		System.out.println(true ^ false);// true --> 1& 0 --> 1
		System.out.println(false ^ true);// true --> 0 & 1 --> 1
		System.out.println(false ^ false);// false --> 0 & 0 -->0

		System.out.println(72 ^ 43);//

		System.out.println(18 ^ 45);// 63
		System.out.println(99 ^ 37);// 70
		System.out.println(76 ^ 10);// 70
		System.out.println(67 ^ 77);// 14

		System.out.println(~10);// -11 --> ~ means (-)(n+1)
		System.out.println(~99);// -100
	}

}

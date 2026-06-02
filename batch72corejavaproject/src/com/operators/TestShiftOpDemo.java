package com.operators;

//7) Shift Operators 
//<< >> >>> 
public class TestShiftOpDemo {

	public static void main(String[] args) {

		int a = 76;
		int b = 5;

		System.out.println(a << b);
//		System.out.println(a <<< b);//CE --> Syntax error on token "<", delete this token
		System.out.println(a >> b);
		System.out.println(a >>> b);

	}

}

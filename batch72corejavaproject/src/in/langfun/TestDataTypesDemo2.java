package in.langfun;

import java.math.BigInteger;
import java.math.BigDecimal;

class Dog {

}

public class TestDataTypesDemo2 {

//	int is converting to Integer : 
//	Auto- Boxing : Converting Primitive Data Type to Wrapper Object data Type.(it came at 1.5 version)
	Integer i1 = 100;

//	Integer is converting to int 
//	Auto-Unboxing : Converting Wrapper Object Data Type to Primitive Data Type.
	int i2 = i1;
	Float f1;
	Double d1;

	String s = "Srikanth ";
//	BigInteger b1 = 200000;
//	BigDecimal b2 = 500000.765;

	Dog d;

	public static void main(String[] args) {
		System.out.println("main method started !!");

		TestDataTypesDemo2 t = new TestDataTypesDemo2();
		System.out.println(t.i1);// 0
		System.out.println(t.f1);// 0.0
		System.out.println(t.d1);// 0.0

		System.out.println(t.s);// null
//		System.out.println(t.b1);// not sure
//		System.out.println(t.b2);// not sure

		System.out.println(t.d);// space null not sure

	}

}

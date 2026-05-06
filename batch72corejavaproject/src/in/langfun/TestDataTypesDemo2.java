package in.langfun;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

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
	String s1 = new String();

	Scanner sc = new Scanner(System.in);
	BigInteger b1 = new BigInteger("876545646545465456453545645674545");
	BigInteger b2 = new BigInteger("876545646545465456453545645674545");
	BigDecimal b3 = new BigDecimal("876546789076543567543567897654678976543567675435678976546789654.765432567843");

//	TestDataTypesDemo2 t = new TestDataTypesDemo2();

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

		// The operator + is undefined for the argument type(s)
//		java.math.BigInteger, java.math.BigInteger
//		System.out.println(t.b1+t.b2);

		System.out.println(t.b1.add(t.b2));
		System.out.println(t.b1.multiply(t.b2));
		System.out.println(t.b1.subtract(new BigInteger("10")));

		System.out.println(t.d);// space null not sure

	}

}

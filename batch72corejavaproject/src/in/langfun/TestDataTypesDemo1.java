package in.langfun;

//Note : Whenever we didn't assign any values for static or instance data 
//then JVM will provide default values for those variables.

//Note : 
//	- By default RHS number related data is int
//  - By default RHS Decimal point data is double
// Order of Data Types --> byte - short - int - long - float - double 

public class TestDataTypesDemo1 {

//	 the Range of byte is 2^7 --> -128 to 127
	byte b = 127;
//	If we store more than byte value, will get a compile time error like below.
//	Type mismatch: cannot convert from int to byte
//	Still if you want to store int value to byte then we should go for Type casting.
//	What is Type Casting : Converting One Data Type values into another Data Types is the concept called Types casting.
//	In java, We have Two Types of Casting.
//		i) Implicit Types Casting 
//			ex: Converting Low data types to high data type.
//			byte b = 10;
//			int a = b; // byte to int 
//	    ii) Explicit Type Casting 
//			- Converting high data type to low data type 
//			- ex: byte b1 = (byte)128; --> int to byte 
// 

	// int --> byte
	// -128 -127 -126 --------0 1 2 3 ..... 127
	byte b1 = (byte) 258;// -128 -->

	// short --> 2 bytes ->(2^15) 16 bits the Range is -32768 to 32767
	short s = b1;// byte t short --> Implicit Type Casting
	short s1 = 32767;

	// Explicit Type Casting
	short s2 = (short) 32768;// Type mismatch: cannot convert from int to short

//	21 4748 3647
	// int --> 4 bytes --> (2^31)32 bits the range is -2147483648 to 2147483647
	int i = s2;// Implicit Type Casting
	int i1 = 2147483647;

//	int i2 = 2147483648; //CE : The literal 2147483648 of type int is out of range 

	// long --> 8 bytes --> 2^63 bits the range is - 9223372036854775808 to
	// 9223372036854775807
	long l = 2147483647;// Implicit Type casting
//	long l1 = 2147483648; //CE : The literal 2147483648 of type int is out of range 
	long l1 = 9223372036854775807L;

	float f = 10;// int --> float --> 10.0
//	RHS Decimal points always double --> double cannot convert to float 
//	float f1 = 5.5;//Type mismatch: cannot convert from double to float
//	float range is 4 bytes, and after decimal point it can represent 5-6 Decimals only
//	double range is 8 bytes, and after decimal point it can represent 10-15 Decimals.
	float f2 = 567.59087643470798755f;
	double d = 567.59087643470798755D;

	// In char Data Types, We can store
//		- Single quote characters 
//		- ASCII char values 
//	    - Unicode values 

	// Range of characters is 2 bytes = 16 bits --> 32768 + 32767 = 0 to 65535
	char c = 'A';
//	char c1 = 'AA';//Invalid character constant
//	A = 65 B =66.....Z =90
//	a = 97 b =98 .....z =122
	char c2 = 6566;// ASCII character values
	char c3 = '\u0040';

	int i5 = 'A';// char can convert int --> int can convert to char

	// boolean range is 1 bit either true or false
	// true or false only Literals we can store it into boolean.
	boolean boo = false;

//	boolean boo1 = TRUE;
//	boolean boo2 = FALSE;
//	boolean boo3 = True;
//	boolean boo4 = False;
//	boolean boo5 = "true";
//	boolean boo6 = "false";
//	boolean boo7 = 0;
//	boolean boo8 = 1;

	public static void main(String[] args) {

		TestDataTypesDemo1 t = new TestDataTypesDemo1();

		System.out.println("main method started ");
		System.out.println("byte value : " + t.b);// 0
		System.out.println("byte value : " + t.b1);// 0

		System.out.println("short value : " + t.s);// 0
		System.out.println("short value : " + t.s1);// 0
		System.out.println("short value : " + t.s2);// 0

		System.out.println("int value : " + t.i);// 0
		System.out.println("int value : " + t.i1);// 0
//		System.out.println("int value : " + t.i2);// 0
		System.out.println("int value : " + t.i5);// 0

		System.out.println("lobng value : " + t.l);// 0
		System.out.println("lobng value : " + t.l1);// 0
//		System.out.println("lobng value : " + t.l2);// 0

		System.out.println("float value : " + t.f);// 0.0
		System.out.println("float value : " + t.f2);// 0.0
		System.out.println("double value : " + t.d);// 0.0

		System.out.println("char value : " + t.c);//
		System.out.println("char value : " + t.c2);//
		System.out.println("char value : " + t.c3);//
		System.out.println("boolaean value : " + t.boo);// false

		if (t.boo) {
			System.out.println("Welcome to Java world !");
		}

		System.out.println("main method ended ");

	}

}

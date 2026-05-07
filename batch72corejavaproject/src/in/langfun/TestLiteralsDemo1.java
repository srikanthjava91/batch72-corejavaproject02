package in.langfun;

//integral Literals 
public class TestLiteralsDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");
//		 Decimal Literals : (base 10 : 0 to 9)
//		a1 & a2 Decimal Literals 
		int a1 = 10;
		int a2 = 789;

//		Octal Literals : base 8 : 0 to 7 
//		Octal Literals starts with 0 
//		Calculation : 1*8^2 +2*8^1 +3*8^0  = 64 + 16 + 3 = 83 

		int a3 = 0123;
		int a4 = 0765;
		int a5 = 03456;
//		int a6 = 08654;//The literal 08654 of type int is out of range 

//		Hexa-Decimal Literals : base 16 : 0 to 9 numbers a-f/A-F characters.
//		Hexa-Decimal Literals starts with 0x or 0X 
//		a=10, b=11, c=12,d=13,e=14,f=15

		int a6 = 0x123;
//		calculation " 1*16^2 +2*16^1 +3*16^0 = 256 + 32 + 3 = 291 
		int a7 = 0x1a2b;// 6699
		int a8 = 0xDAD;
		int a9 = 0xBee;
//		int a10 = 0XBeer;//Syntax error on token "r", delete this token

//		Binary Literals : base : 0 to 1 
//		Binary Literals starts with 0b 

		int a11 = 0b1010;// 10
		int a12 = 0b1110;// 14
		int a13 = 0b1110110;//

		System.out.println(a1);// 10
		System.out.println(a2);// 123
		System.out.println(a3);// 83
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6);
		System.out.println(a7);

		System.out.println(a11);
		System.out.println(a12);
		System.out.println(a13);

	}
}

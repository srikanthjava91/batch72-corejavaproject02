package in.langfun;

//Floating Literals 
public class TestLiteralsDemo2 {

	public static void main(String[] args) {

		TestLiteralsDemo2 t2 = new TestLiteralsDemo2();
		System.out.println(t2);// 2b2fa4f7
		System.out.println(t2.hashCode());
		int a = 0x2b2fa4f7;
		System.out.println(a);

		float f1 = 10;
		float f2 = 15F;
//		float f3 = 15.14;//CE : Type mismatch: cannot convert from double to float
		float f4 = 123;
		float f5 = 0123;
//		float f6 = 0123.5;//CE //Type mismatch: cannot convert from double to float
		float f7 = 0123.5F;
		float f8 = 0x123;
		float f9 = 0x123F;
//		float f10 = 0x123.5F;/Invalid hex literal number

		System.out.println(f1);// 10.0
		System.out.println(f2);// 15.0
		System.out.println(f4);// 123.0
		System.out.println(f5);// 83.0
		System.out.println(f7);// 123.5
		System.out.println(f8);
		System.out.println(f9);

	}

}

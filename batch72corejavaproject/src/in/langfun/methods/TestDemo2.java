package in.langfun.methods;

///2) without return type + with arguments
///no return type + with arguments 
///Q) WAP to find calculation of the two numbers with addition, subtraction, division, multiplication and modulus.
public class TestDemo2 {

	static void addition(int a, int b) {
		System.out.println("addition method called ");
		System.out.println(a + b);// sum
	}

	static void subtraction(float a, float b) {
		System.out.println("subtraction method called ");
		System.out.println(a - b);// diff
	}

	static void multiplication(float a, double b) {
		System.out.println("multiplication method called ");
		System.out.println(a * b);// product
	}

	static void division(double x, int y) {
		System.out.println("Division method called ");
		System.out.println(x / y);// 100/5 --> 20 quotient
	}

	static void modulus(double x, int y) {
		System.out.println("Division method called ");
		System.out.println(x % y);// 100/5 --> 0 reminder
	}

	public static void main(String[] args) {
		System.out.println("main method strated ");
		addition(100, 200);// call by value
		subtraction(500, 400);// int to float : implicit type casting
		multiplication(10.5F, 3.5);
		division(99, 2);
		modulus(98, 4);
	}

}

package in.langfun.methods;

//with return type 	+ without arguments 
public class TestDemo6 {

	static int addition() {
		int sum = 100 + 200;
		return sum;
	}

	static int subtraction() {
		int diff = 300 - 200;
		return diff;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		System.out.println("Add : " + addition());
		System.out.println("Subb " + subtraction());

//		int add = addition();
//		int sub = subtraction();
//
//		System.out.println("Sum of two numbers is : " + add);
//		System.out.println("Diff of two numbers is : " + sub);

		System.out.println("main method ended ");
	}

}

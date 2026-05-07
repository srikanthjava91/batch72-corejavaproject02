package in.langfun;

public class TestLiteralsDemo3 {

	static TestLiteralsDemo3 t2 = null;

	public static void main(String[] args) {

//		Boolean Literals 
		boolean whenYouPractice = true;

		if (whenYouPractice) {
			System.out.println("Java is simple !");
		}

//		null Literal
//		In java, We want to store any default values manually for an Object, 
//		before creating actual object info then we can use null.
//		Note : null is not a keyword, it's a literal
		String s1 = null;
		TestLiteralsDemo3 t1 = null;

		t2 = new TestLiteralsDemo3();

//		System.out.println(s1.length());// NullPointerException : null dot any operation is called NPE

//		String Literals
//		Collection of characters can store it into a single variable will consider as String.
		String s = "Srikanth";// String Literals
		System.out.println(s);

		// Char Literals
		char c1 = 'M';// Single quote value
		char c2 = 72;// ASCII
		char c3 = '\uafed';// UNICODE values

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

		t1 = new TestLiteralsDemo3();

	}

}

package in.langfun.constructors;

public class Bank {

	String name;
	String branch;

	Bank() {
		System.out.println("Bank Constructor ");
	}

	Bank(String name, String branch) {
		System.out.println("Two arg constructor from Bank ");
	}

}

//Implicit super constructor Bank() is undefined for default constructor. Must define an explicit constructor
class HDFCBank extends Bank {

	HDFCBank() {

		System.out.println("HDFC Constructor ");
	}

	public static void main(String[] args) {
		System.out.println("main method started from HDFC");

		HDFCBank hb = new HDFCBank();
		System.out.println(hb.name);
		System.out.println(hb.branch);

	}

}
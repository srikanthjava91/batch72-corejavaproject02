package in.langfun.constructors;

public class Customer {

	int cid;
	int age;
	String name;
	long phone;

	public Customer() {
		this(1, "unknown");// Calling two arg constructor
		System.out.println("No arg constructor called ");
	}

	public Customer(int cid, int age, String name, long phone) {
		System.out.println("4-arg constructor called ");
		this.cid = cid;
		this.age = age;
		this.name = name;
		this.phone = phone;
	}

	public Customer(int cid, String name) {
		this(cid, 0, name, 0);
		System.out.println("Two arg constructor called ");

	}

	public static void main(String[] args) {
		System.out.println("main method staretd ");

		Customer c1 = new Customer();
		c1.show();

		Customer c3 = new Customer(102, "Aakash");
		c3.show();
		////
//		Customer c2 = new Customer(101, 23, "Bhasakar", 9988776655L);
//		c2.show();

		System.out.println("main method ended ");

	}

	void show() {
		System.out.println("Customer ID : " + cid);
		System.out.println("Customer Age : " + age);
		System.out.println("Name of the customer : " + name);
		System.out.println("Phone of the Customer  " + phone);
		System.out.println("*************************************");
	}

}

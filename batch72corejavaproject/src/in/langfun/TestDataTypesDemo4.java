package in.langfun;

class Student {

	int sid = 1;
	String sname = "Sri";
	double weight = 73;
	float height = 5.9F;
	Address address = new Address();

}

class Address {
	int flat = 123;;
	String plot = "LIG";
	String street = "KPHB";
	String city = "HYD";

}

public class TestDataTypesDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Student s = new Student();
		System.out.println(s.sid);
		System.out.println(s.sname);
		System.out.println(s.weight);
		System.out.println(s.height);
		System.out.println(s.address.flat);
		System.out.println(s.address.plot);
		System.out.println(s.address.street);
		System.out.println(s.address.city);

	}

}

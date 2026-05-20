package in.langfun.constructors;

//this is a keyword to invoke current class object data members.
//this keyword we can use in only instance context like constructors & 
//also in instance methods but not in static context.


public class Person {

	int age;
	String name;
	long phone;
	String city;

	public Person(int age, String name, long phone, String city) {
		this.age = age;
		this.name = name;
		this.phone = phone;
		this.city = city;
	}

	Person() {
		System.out.println("No arg constructor called ");
		age = 20;
		name = "unknown";
		phone = 0;
		city = "unkown";
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

//		This Object is created with the help of default constructor which created by the Java Compiler when there are any constructors.
//		The below object is create with the help no arg constructor.
		Person p = new Person();
		p.show();

		Person p1 = new Person(22, "Guna", 9988776655L, "HYD");
		p1.show();

		System.out.println("main method ended ");

	}

	void show() {
		System.out.println("**********show deatails****************");
		System.out.println("Age : " + age);
		System.out.println("Name : " + name);
		System.out.println("Phone : " + phone);
		System.out.println("City : " + city);
		System.out.println("**************************");
	}

}

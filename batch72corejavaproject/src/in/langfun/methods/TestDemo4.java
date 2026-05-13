package in.langfun.methods;

import java.util.Scanner;

//2) without return type + with arguments
//WAP to Display a Student information.
public class TestDemo4 {

	static void getStudentAge(int age) {
		System.out.println("Student age is : " + age);
	}

	static void getStudentName(String name) {
		System.out.println("Student Name is : " + name);
	}

	static void findStudentPhone(long phone) {
		System.out.println("Student phone is : " + phone);
	}

	static void getGender(char gen) {
		System.out.println("Student Gender is : " + gen);
	}

	public static void main(String[] args) {

		System.out.println("main method strated");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age : ");
		int sage = sc.nextInt();
		getStudentAge(sage);

		System.out.println("Enter Your name : ");
		sc.nextLine();
		String sname = sc.nextLine();
		getStudentName(sname);

		System.out.println("ENter phone number : ");
		long phone = sc.nextLong();
		findStudentPhone(phone);

		System.out.println("Enter your gender : ");
		char gender = sc.next().charAt(0);// method chaining
		getGender(gender);

		System.out.println("main method ended");

	}

}

package in.langfun.methods;

public class TestDemo10 {

	public static void main(String[] args) {

		Student1 s1 = new Student1();
		employeeInfo(s1);// Looks like Call by Reference but it's not, this is also call by value only
	}

	static void employeeInfo(Student1 s) {
		System.out.println(s.sid);
		System.out.println(s.sname);
		System.out.println(s.age);
		System.out.println(s.phone);
	}

}

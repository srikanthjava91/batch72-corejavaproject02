package in.langfun.methods;

class Student1 {

	int sid = 9;
	String sname = "Srikanth";
	int age = 22;
	long phone = 9988776655L;

}

public class TestDemo9 {

	Student1 getStudent() {
		Student1 s1 = new Student1();
		return s1;
	}

	String show() {
		return "Java is simple";
	}

	public static void main(String[] args) {
		System.out.println("main method strated ");

		TestDemo9 t = new TestDemo9();
		Student1 s1 = t.getStudent();

		System.out.println("SID : " + s1.sid);
		System.out.println("Name of the Studnet : " + s1.sname);
		System.out.println("Äge :  " + s1.age);
		System.out.println("Phone : " + s1.phone);

		System.out.println(t.show());

		System.out.println("main method ended ");

	}

}

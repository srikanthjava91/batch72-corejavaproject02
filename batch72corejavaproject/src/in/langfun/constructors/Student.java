package in.langfun.constructors;

//Q) Sir, If we have Default constructor then why we need No arg constructor ..? 
//Ans: Here we have two answers.
// i) Instead of JVM provided default values, 
//if we want to provide the values explicitly for instance data 
//when we create an Object.

// ii) 
public class Student {

	int sid;
	String sname;

//	No arg constructor 
	Student() {
		sid = 101;
		sname = "Unknown";
		System.out.println("No arg constructor called ");
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

//		i) Creating an Object with the help of Default Constructor.
//		In a Program, If there are no explicit constructors, 
//		then Java Compiler will create default constructors.

//		ii) Object is created with the help of no arg constructor when we have explicit no arg constructor.
		Student s = new Student();
		s.show();

		Student s1 = new Student();
		s1.sid = 102;
		s1.sname = "Srikanth";
		s1.show();

		Student s2 = new Student();
		s2.show();

		System.out.println("main method ended ");
	}

	// To provide re-usability we need methods
	void show() {
		System.out.println("Student ID : " + sid);//
		System.out.println("Student Name : " + sname);//
	}

}

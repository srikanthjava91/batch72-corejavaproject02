package in.langfun.constructors;

public class Employee {

	int eid;
	int age;
	String ename;

	Employee() {
		System.out.println("no rg constructor called ");
		eid = 101;
		age = 21;
		ename = "Unknown";
	}

	Employee(int e1, int a1, String e2) {
		System.out.println("Parameterized  constructor called ");
		eid = e1;
		age = a1;
		ename = e2;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		Employee emp1 = new Employee();
		emp1.display();

//		Whenever we want send the values while creating an object itself 
//		we need to have a Parameterized constructors.
		Employee emp2 = new Employee(102, 23, "Srikanth");
		emp2.display();

		System.out.println("main method ended ");

	}

	void display() {
		System.out.println("Employee ID : " + eid);//0 102 
		System.out.println("Employee Name : " + ename);//null Srikanth
		System.out.println("Employee Age : " + age);//0 23
	}

}

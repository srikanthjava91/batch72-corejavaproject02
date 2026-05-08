package in.langfun;

//Types variables 
//static Data we can access directly, By using class names also.

//NOte : 
//- static data we can access directly any where whether it is a static context or instance context.
//- instance data we can access directly in instance context but 
//if we want to access in static context we need to create object.

public class Employee {

//	instance  + Primitive variable
	int eid = 101;

//	instance + Object variable
	String ename = "Unknown";

	// static + Object Variable
	static String orgName = "Vcube Software Solutions";
	// static + Primitive variable
	static int orId = 555;

	public static void main(String[] args) {
		System.out.println("main method started ");
		System.out.println("Employee Info !!");

		Employee emp1 = new Employee();

//		 Accessing the static data directly 
		System.out.println("ORG ID: " + orId);
		System.out.println("ORG Name : " + orgName);
		System.out.println("-------------------------");

//		Accessing the static data by using class name
		System.out.println("ORG ID: " + Employee.orId);
		System.out.println("ORG Name : " + Employee.orgName);
		System.out.println("-------------------------");

//		Accessing the static data by using Object Reference variable 
//		The static field Employee.orId should be accessed in a static way
		System.out.println("ORG ID: " + emp1.orId);
//		The static field Employee.orgName should be accessed in a static way
		System.out.println("ORG Name: " + emp1.orgName);

//		Accessing the instance data by using Object reference variable.
		System.out.println("Emloyee ID  " + emp1.eid);
		System.out.println("Employee Name : " + emp1.ename);

//		The static field Employee.orgName should be accessed in a static way
		Employee emp2 = null;
		System.out.println(emp2.orgName);//
		System.out.println(emp2.ename);// NPE : NullPointerException

		System.out.println("main method ended !!");

	}

}

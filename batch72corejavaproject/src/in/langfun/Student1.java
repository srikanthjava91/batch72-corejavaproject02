package in.langfun;

//Whenever the data is same for all the Objects then we can keep that data with static.

//Whenever the data is not same and changing from Object to Object then we can go and keep that data as instance.
//Whenever to solve temporary requirements in, we can go and keep those data as local variables, within the methods or within the blocks we can write.

//Static data is storing inside the method area.
//instance data is storing inside the heap area.
//local variables are storing stack area.
public class Student1 {

	// instance data
	int sid;
	String sname;

	// static data
	static int collegeID = 777;
	static String collegeName = "Vcube";

	public static void main(String[] args) {
//		Note : JVM Does not provide default values for local variables.
//		if we use any modifier will get CE : Illegal modifier for parameter x; 
//		only final is permitted
		int x;
//		System.out.println(x);//CE :The local variable x may not have been initialized
		x = 100;
		System.out.println(x);// 100

		int collegeID = 999;
		String collegeName = "VSS";

//		Local variables, we can access directly, When we have ambiguity with static data,
//		we can access static data by using class name.
		System.out.println(collegeID);
		System.out.println(collegeName);
		System.out.println(Student1.collegeID);
		System.out.println(Student1.collegeName);

	}

}

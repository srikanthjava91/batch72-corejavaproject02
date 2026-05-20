package in.langfun.constructors;

//Parent or Super or Base 
class Vehicle {
	String name = "RE";

}

//Child or Sub or Derived 
class Bike extends Vehicle {
	String name = "FZ-S";

	// instance method
	void m1() {
		System.out.println(super.name);
		System.out.println(this.name);
		this.m2();
	}

	void m2() {
		System.out.println("Hello m2");
	}
}

public class TestDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Bike b = new Bike();
//		System.out.println(b.name);
//		System.out.println(super.name);//Cannot use super in a static context
		b.m1();
		System.out.println("main method ended ");
	}

}

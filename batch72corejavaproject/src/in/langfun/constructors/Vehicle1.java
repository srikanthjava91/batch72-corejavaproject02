package in.langfun.constructors;

public class Vehicle1 {
	String model;
	String brand;
	double price;

	Vehicle1() {
		System.out.println("Vehicel constructor called ");
	}

}

class Bike1 extends Vehicle1 {

	Bike1() {

		System.out.println("Bike1 no arg constructor called ");
	}

	Bike1(String model, String brand) {

		System.out.println("Two arg constructor called from Bike1 ");
		super.model = model;
		super.brand = brand;
	}

	public static void main(String[] args) {
		System.out.println("main method strated From Bike1");

		Bike1 v = new Bike1();
		System.out.println(v.brand);// null
		System.out.println(v.model);// null

		Bike1 v1 = new Bike1("Seltos", "KIA");
		System.out.println(v1.brand);
		System.out.println(v1.model);

	}
}

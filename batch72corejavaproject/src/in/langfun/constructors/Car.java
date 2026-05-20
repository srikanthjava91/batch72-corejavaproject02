package in.langfun.constructors;



//Note : In Java, Method name is same and arguments are different means method Overloading.
//SO, The below program will consider as Constructor overloading with different paramaters.

public class Car {

	String model;
	String brand;
	double price;
	static String orgName = "Srikanth Car Show Room";

	// No arg constructor
	Car() {
		System.out.println("No arg constructor called ");
	}

	// 4 arg constructor
	Car(String model, String brand, double price, String orgName) {
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.orgName = orgName;

	}

	// 3 arg constructor
	Car(String model, String brand, double price) {
		this.model = model;
		this.brand = brand;
		this.price = price;

	}

	public static void main(String[] args) {
		System.out.println("main method started !");

		Car c = new Car();
		c.info();

		Car c1 = new Car("Sonet", "KIA", 1500000.00, "Vihan Kia");
		c1.info();

		Car c2 = new Car("Venue", "Hundai", 1400000.00);
		c2.info();

		System.out.println("main method ended !");

	}

	void info() {
		System.out.println("********** Car Info **********");
		System.out.println("Model Of the Car : " + model);
		System.out.println("Brand of teh Car : " + brand);
		System.out.println("Price of teh Car  : " + price);
		System.out.println("Organization Name: " + orgName);
		System.out.println("*******************************");

	}

}

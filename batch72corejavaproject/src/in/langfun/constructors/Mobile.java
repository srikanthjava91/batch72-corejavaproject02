package in.langfun.constructors;


//super() is used to call Parent class constructor.
//It should be the first statement inside child constructor.
//Used for constructor chaining.
//If we don’t write super(), Java compiler adds default super() automatically.
//super(arguments) is used to call parameterized constructor of parent class.
public class Mobile {
	String model;
	String brand;
	double price;

	Mobile() {
		System.out.println("Mobile constructor !!");
	}

	Mobile(String model, String brand, double price) {
		this.model = model;
		this.brand = brand;
		this.price = price;

	}

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Mobile m = new Mobile("17PRO", "IPHONE", 8500000.00);
		System.out.println(m.model);
		System.out.println(m.brand);
		System.out.println(m.price);
		
		OnePlus op = new OnePlus();
		System.out.println(op.model);
		System.out.println(op.brand);
		System.out.println(op.price);
		
		OnePlus op1 = new OnePlus();
		
	}

}

class OnePlus extends Mobile {

	public OnePlus(String model, String brand, double price) {
		super(model, brand, price);
	}

	public OnePlus() {
		
		System.out.println("one plus constructor !!");
	}

	public static void main(String[] args) {
		System.out.println("main method started From One Plus");

		OnePlus op1 = new OnePlus();

		OnePlus op = new OnePlus("9R", "OnePlus", 400000.00);
		System.out.println(op.model);
		System.out.println(op.brand);
		System.out.println(op.price);
	}

}

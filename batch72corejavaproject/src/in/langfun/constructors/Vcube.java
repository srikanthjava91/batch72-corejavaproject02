package in.langfun.constructors;

public class Vcube {
	String name;
	double price;

	Vcube() {
		System.out.println("No arg constructor called from Vcube");
	}

	Vcube(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public static void main(String[] args) {
		System.out.println("main method started from Vcube ");
	}

}

class VcubeJava extends Vcube {

	public VcubeJava() {
		System.out.println("No arg constructor called from VJ");
	}

	public VcubeJava(String name, double price) {
		super(name, price);
		System.out.println("two arg constructor called from VJ");

	}

	public static void main(String[] args) {
		System.out.println("main method started from Vcube Java ");
		VcubeJava vj = new VcubeJava("Vcube Java", 29000.00);

		System.out.println(vj.name);
		System.out.println(vj.price);

	}

}

package com.oops.abstraction;

public class TestAnimal {

	public static void main(String[] args) {
		System.out.println("********Cat info *********");

//		List l = new ArrayList<>();
//		l.add(10);

//		Creating Object of a class and storing into a interface reference 
//		is the concept of Abstraction  and we can consider this also like  U-Casting
		Animal c = new Cat();
		c.sound();
		c.drink();
		c.eat();
		c.walk();
		c.run();
		System.out.println(Animal.orgName);

		System.out.println("********Dog info *********");
		Animal d = new Dog();
		d.sound();
		d.eat();
		d.drink();
		d.walk();
		d.run();
//		 This static method of interface Animal can only be accessed as Animal.breath
		Animal.breath();

		System.out.println("**********Monkey Info *******");
		Animal m = new Monkey();
		m.sound();
		m.eat();
		m.drink();
		m.walk();
		m.run();
	}

}

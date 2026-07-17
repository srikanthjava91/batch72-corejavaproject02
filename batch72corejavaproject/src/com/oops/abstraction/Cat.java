package com.oops.abstraction;

public class Cat implements Animal {

	@Override
	public void sound() {
		System.out.println("Meow meow meow !!!");
	}

	@Override
	public void eat() {
		System.out.println("Cat can eat rat !!");

	}

	@Override
	public void drink() {
		System.out.println("Cat drinks milk !");
	}
	
	void catchRat() {
		System.out.println("Cat can Catch rats !!");
	}

}

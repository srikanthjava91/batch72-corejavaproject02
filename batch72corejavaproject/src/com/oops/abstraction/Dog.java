package com.oops.abstraction;

public class Dog implements Animal {

	@Override
	public void sound() {
		System.out.println("Bow bow !!");

	}

	@Override
	public void drink() {
		System.out.println("Dog drinks Water & Milk ");

	}

	@Override
	public void eat() {
		System.out.println("Dog eats Non-veg mostly !");

	}

}

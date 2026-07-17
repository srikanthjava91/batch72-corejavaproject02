package com.oops.inheritance;

interface Animal {
	public abstract void sound();
}

//Cycle detected: the type Dog cannot extend/implement itself 
//or one of its own member types
//class Dog extends Dog
class Dog {
	void sound() {
		System.out.println("Bow bow !!");
	}
}

//5) Hybrid Inheritance 
class Puppy extends Dog implements Animal {

	@Override
	public void sound() {
		System.out.println("bo bob bo ");
	}
}

public class TestInheritanceDemo4 {

	public static void main(String[] args) {
		System.out.println("main metod strate d");
		Puppy p = new Puppy();
		p.sound();
	}

}

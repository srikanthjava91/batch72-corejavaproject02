package com.oops.abstraction;

public class Monkey implements Animal {

	@Override
	public void sound() {
		System.out.println("Ooh ooh, ah ah, ooh ooh, ah ah!");

	}

	@Override
	public void drink() {
		System.out.println("Monkey is like a human, it drinks all !!");
	}

	@Override
	public void eat() {
		System.out.println("MOnkey likes to eat Bananas. !!");
	}

	// Yes !! we can Override default methods from interface but,
//	you should not write default keyword, if we wite we will get CE like : 
//	Default methods are allowed only in interfaces.
	@Override
	public void walk() {
		System.out.println("Monkey can walk and also can Jump !!");
	}

}

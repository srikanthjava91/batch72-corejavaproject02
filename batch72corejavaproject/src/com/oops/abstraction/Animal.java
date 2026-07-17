package com.oops.abstraction;

public interface Animal {

	public static final String orgName = "Vcube";

	public abstract void sound();

	public abstract void drink();

	public abstract void eat();

//	Why default methods introduced..? 
//	To avoid Backward Compatibility problems !!
//	What is Backward Compatibility..?
//	Once we completed the contract from the client, 
//	Client may come Back and give new Requirements, 
//	When we added new requirements in interface 
//	then all the classes which are implemented based on that interface 
//	must need to change, if it 100 classes yes we must need to change 100 Classes every time. 
//	This is problem with before 1.8 , 
//	So avoid such kind of problem Java introduced default method in interfaces with default implementation.
//  default methods, we can override !!
	public default void walk() {
		System.out.println("By default every animal can walk !");
		hello();
	}

	public default void run() {
		System.out.println("By default every animal can run !");
		hello();
	}

//	Why static method introduced ..? 
//	To provide constant behavior for all the classes, 
//	instead of creating in every class java introduced static methods.
//  static methods, we should not override.
//	the meaning of static is here, to provide utility behavior 

	// Generally, static methods from classes are accessible by using object
	// reference variable
//	but interface static methods, can able to access only with the interface name only.
	public static void breath() {
		System.out.println("Every animal should breath to survive ");
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		breath();
	}

	
//	private methods introduced in Java 1.9 onwards to avoid duplicate code from default methods.
//	To provide re-usabilty, java introduced private methods.
//	From 1.8 to 1.9 java thought that, they can use default methods only 
//	but we can override the default methods, so it might be problem for all remaining default methods, 
//	so they introduced private methods from 1.9.
	private void hello() {
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
	}

}

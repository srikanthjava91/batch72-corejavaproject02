package com.accessmodifiers02;

import com.accessmodifiers01.TestAccessDemo1;

public class TestAccessDemo3 extends TestAccessDemo1{

	public static void main(String[] args) {
		System.out.println("main method started ");

//		If the class & constructor is default, we cannot create Objects outside of the packages.
//		Note : If you want to create object outside of the packages, 
//		your class & constructor must be public and we must need to 
//		import public classes outside of the packages to use them.
		TestAccessDemo1 t1 = new TestAccessDemo1();

//		Accessing the public data outside of  the package
		System.out.println("*********Accessing the public data outside of the package");
		System.out.println(t1.id3);
		System.out.println(t1.name3);
		t1.method3();
		
//		Accessing the protected data outside of the packages is not possible directly.
//		We can access outside of the packages of subclasses with sub class object reference only.
//		System.out.println("*********Accessing the protected data outside the package");
		TestAccessDemo3 t3 = new TestAccessDemo3();
		System.out.println(t3.id4);
		System.out.println(t3.name4);
		t3.method4();

//		Even though your class and Constructor is public, your class data members are default.
//		default data members, we cannot access outside of the packages.
//		System.out.println(t1.id2);
//		System.out.println(t1.name2);
//		t1.method2();

	}

}

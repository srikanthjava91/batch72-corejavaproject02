package in.langfun;

import java.util.Scanner;
import java.lang.System;
import java.lang.String;

import com.javaintroduction.Cricketer;

 class TestDemo2 {

	 int age = 56;

	void getInfo() {
		System.out.println("Age is: " + this.age);
	}

	public static void main(String[] args) {

		TestDemo2 t = new TestDemo2();
		t.getInfo();

		Scanner sc = new Scanner(System.in);

		var age = 22;
		var height = 5.9F;

		Cricketer c1 = new Cricketer();
		Cricketer c2 = new Cricketer();
		Cricketer c3 = new Cricketer();
		Cricketer c4 = new Cricketer();
		Cricketer c5 = new Cricketer();

		System.out.println(age);
		System.out.println(height);

		return;

	}

}

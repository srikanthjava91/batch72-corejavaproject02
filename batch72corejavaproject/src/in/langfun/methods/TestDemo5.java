package in.langfun.methods;

import java.util.Scanner;

//WAP to work with Balance Withdraw And Deposit like Banking functionalities in a program.?
public class TestDemo5 {

	double balance = 10000.00;

	void deposit(double amount) {
		System.out.println("Deposit method called ");
		balance = balance + amount;
		System.out.println("Total Balance is : " + balance);

	}

	void withdraw(double amount) {
		System.out.println("withdraw method called ");
		balance = balance - amount;
		System.out.println("Remianing Balance is : " + balance);
	}

	void getBalanace() {
		System.out.println("Final Balance is : " + balance);
	}

	public static void main(String[] args) {
		System.out.println("main method strted ");

		TestDemo5 t = new TestDemo5();
		System.out.println("Current balanace is : " + t.balance);

		Scanner sc = new Scanner(System.in);
		System.out.println("How much you want to Deposit ..? ");
		double amount = sc.nextDouble();
		t.deposit(amount);

		System.out.println("Enter the Amount which you want to WIthdraw..? ");
		double amount1 = sc.nextDouble();
		t.withdraw(amount1);

		t.getBalanace();
		System.out.println("main method ended ");
	}

}

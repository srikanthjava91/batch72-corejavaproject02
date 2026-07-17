package com.oops.inheritance;

//Child-class or Sub-class or Derived class
public class PersonalLoan extends LoanImpl {

	void getPersonalLoanDocInfo() {
		System.out.println("All Personal Loan documents submitted successfully !!");
	}

	@Override
	public double getROI() {
		return 8.5;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		System.out.println("Welcome to Vcube Personal Loan Banking ");

//		The Below scenario is working based Up-casting: 
//		Child Object with Parent reference, we can call only Parent functionalities
//		But, If the child class Override the Parent class functionalities, 
//		even though we use parent reference, child class functionalities will executes is process of 
//		Dynamic Method Dispatching.
		LoanImpl l2 = new PersonalLoan();
		System.out.println(l2.getROI());

//		Scenario-1 : Child Object & Child Reference 
//		By using Child Object with Child Reference, 
//		We can access both Parent & child class Functionalities.
		PersonalLoan pl = new PersonalLoan();

//		Scenario-2 : Parent Object & Parent reference 
//		By using Parent Object with Parent Reference,
//		We can access only Parent class functionalities 
//		but not child class functionalities.

		Loan l1 = new LoanImpl();

//		Q) Can we store Child Object in Parent Reference ..? Yes 
//		Scenario-3 : Child Object & Parent reference 
//		By using Child Object with Parent Reference,
//		We can access only Parent class Functionalities.
//		This process will consider as Up-casting,
//		Up-casting means : Storing Child Object into Parent reference.
//		By using Up-casting, we can achieve Abstraction through interfaces.

		LoanImpl l3 = new PersonalLoan();

//		Q) Can we store Parent Object into Child class Reference .,? No 
//		Scenario-4: Parent Object & Child Reference
//		By using Parent Object with Child Reference,
//		
//		Type mismatch: cannot convert from LoanImpl to PersonalLoan
//		Down-casting is not possible directly with Classes like below.
//		Namesake, We Can cast to to Child, But We will get Runtime Exception Saying 
//		ClassCastException 
//		 java.lang.ClassCastException
//		PersonalLoan pl2 = new LoanImpl();
//		PersonalLoan pl2 = (PersonalLoan) new LoanImpl();

		if (pl.isPhoneValid() && pl.isAadharValid() && pl.isPANValid()) {

			double income = pl.getCustomerSalary();
			int cibil = pl.getCibiScore();
			int age = pl.ageInfo();

			if ((age > 22 && age <= 60) && income >= 50000.00 && cibil > 300 && cibil <= 900) {
				System.out.println("Congrtuations !! You are Eligible for Personal Loan ");

				double roi = pl.getROI();

				if (cibil >= 300 && cibil <= 600) {
					System.out.println("Poor Score ");
					roi = roi + 3.5;
				} else if (cibil > 600 && cibil < 700) {
					System.out.println("Fair Score");
					roi = roi + 2.5;
				} else if (cibil >= 700 && cibil < 750) {
					System.out.println("Good Score");
					roi = roi + 1.5;
				} else {
					roi = roi - 1.0;
				}

				System.out.println("Your Rate of intereset is : " + roi);

				System.out.println("As you entered your address details are : " + pl.getAddressDetails());
				pl.getPersonalLoanDocInfo();
			} else {
				System.out.println("Sorry !! Focus on Carrer first ");
			}
		} else {
			System.out.println("Something Went wrong with Personal Deatils Chack and re-enter : ");
		}

	}

}

package com.oops.inheritance;

public class HomeLoan extends LoanImpl {

	void getAllHomLoanDocInfo() {
		System.out.println("DHome Loan Documents have been submitted successfully !!");
	}

//	Rules to follow method Overriding 
//	1) Method signature must be same (method signature = method name + arguments )
//	Note : Method return type is not part of Method signature.

//	2) Method return type must be same until 1.5 version, 
//	After 1.5 onwards Java Introduced co-varient return types.

//	Even after 1.5, 

//	If the Parent class method return type is Primitive 
//	the child class method must need to be primitive.

//	But, If the Parent class method Return type is Object Data Type 
//	from 1.5 onwards child class method return type can be "co-varient return type".

//	co-varient return types : If the Parent class method returns Object data types 
//	the child class method must return Same Object data type or it's sub type.

//	ex: P ---> Number 	---> C ---> Number/Integer/Double/....
//		P ---> String   ---> C ---> String 
//	    P ---> Integer   ---> C---> Number ---> Invalid
//	    P ----> Object   ----> C ---> Object/ Number/ String / Any object ...

//	3) Method scope Should not be reduced. : private < default < protected < public 
//	  If the 
//		Parent -->  public : Child -->  public 
//	    Parent -->  protected : Child --> protected/ public 
//	    Parent -->  default : Child ---> default / protected /public 
//	    Parent -->  private :  We cannot Override the private methods. 

//	CE : Cannot reduce the visibility of the inherited method from LoanImpl

//	4) private methods we cannot Override, Because the scope of private is within the class only.
//	But, the same method we can write it in child class independently.
//	it's looks like method overriding but not MOR. 
//	If we try to give @Override annotation, We will get Compile time Error.
//	CE : The method method1() of type HomeLoan must override or implement a supertype method.

//	5) static methods we cannot override.
//	Because, static methods are loading whenever the class loads to the memory. 
//	But method Overriding is depends on Objects loading to the memory.
//	If we write same static method from Parent to children, 
//	we will not get any CE until we use @Overrride.
//	Such methods will consider as "Method Hiding"
//	CE : The method method2() of type HomeLoan must override or implement a supertype method

//	6) final methods: we cannot override.
//	If a class is a final, all methods from that class also final.
//	If a class is a final, all variables inside that class is not final.
//	Can we access final methods in Different class ..? Yes !!
	
//	Exception Related 
//	7) If the Parent class method throws any Exception, The child class no need to throws any Exception.
//	But, If the child class throws any Exception, The Parent class must throws the same Exception or it's Parent Exception.
	
//	8) abstract method must be Override.
//	Scenario1: If the Parent type is interface or abstract, 
//	it may contains abstract methods,
//	Whenever the class implements interface or extends abstract class 
//	The child class must Override all abstract methods from Parent 
//	to child with implementations.
//	
//	Scenario2: If the class have Implemented method and the class using 
//	abstract child class, can we override Parent class normal method as abstract method in child ..? Yes
//	So, Normal Method from Parent can override as abstract methods if the child class is abstract.
	
	public static void method2() {
		System.out.println("Helo static from P-LOAN IMPL");
	}

	private void method1() {
		System.out.println("Hello P-Loan IMPL");
	}

	@Override
	public double getROI() {
		return 8.0;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		System.out.println("Welcome to Vcube Home Loan Banking ");

		HomeLoan hl = new HomeLoan();

		System.out.println(hl.getROI());

		if (hl.isPhoneValid() && hl.isAadharValid() && hl.isPANValid()) {

			double income = hl.getCustomerSalary();
			int cibil = hl.getCibiScore();
			int age = hl.ageInfo();

			if ((age > 18 && age <= 75) && income >= 30000.00 && cibil > 300 && cibil <= 900) {
				System.out.println("Congrtuations !! You are Eligible for Home Loan ");

				double roi = hl.getROI();

				if (cibil >= 300 && cibil <= 600) {
					System.out.println("Poor Score ");
					roi = roi + 1.5;
				} else if (cibil > 600 && cibil < 700) {
					System.out.println("Fair Score");
					roi = roi + 1.0;
				} else if (cibil >= 700 && cibil < 750) {
					System.out.println("Good Score");
					roi = roi + 0.5;
				} else {
					roi = roi - 2.0;
				}

				System.out.println("Your Rate of intereset is : " + roi);

				System.out.println("As you entered your address details are : " + hl.getAddressDetails());
			} else {
				System.out.println("Sorry !! Focus on Carrer first ");
			}
		} else {
			System.out.println("Something Went wrong with Personal Deatils Chack and re-enter : ");
		}
	}

}

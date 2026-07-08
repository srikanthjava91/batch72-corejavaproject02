package com.oops.inheritance;

//interface : SRS document 
//SRS means : Service or Software Requirement Specification 
//By default all methods from interface public & abstract
public interface Loan {
	
	String getAddressDetails();
	
	boolean isPhoneValid();
	
	boolean isAadharValid();
	
	boolean isPANValid();
	
	double getCustomerSalary();
	
	int getCibiScore();
	
	int ageInfo();
	
	double getROI();

}

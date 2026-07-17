package com.oops.inheritance;

//interface : SRS document 
//SRS means : Service or Software Requirement Specification 
//By default all methods from interface public & abstract
public interface Loan {

	public abstract String getAddressDetails();

	public abstract boolean isPhoneValid();

	public abstract boolean isAadharValid();

	public abstract boolean isPANValid();

	public abstract double getCustomerSalary();

	public abstract int getCibiScore();

	public abstract int ageInfo();

	public abstract double getROI();

}

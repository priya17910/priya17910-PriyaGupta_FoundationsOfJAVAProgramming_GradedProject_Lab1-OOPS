package com.company.employee;

public class Employee {
	
	// VARIABLE DECLARATION
	private String firstName;
	private String lastName;
	
	
	// EMPLOYEE CLASS PARAMETERIZED CONSTRUCTOR
	public Employee (String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	// GETTER FOR FIRST NAME
	public String getFirstName() {
		return firstName;
	}
	
	
	// GETTER FOR LAST NAME
	public String getLastName() {
		return lastName;
	}
}

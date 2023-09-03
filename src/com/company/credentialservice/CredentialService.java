package com.company.credentialservice;


import com.company.employee.Employee;

public class CredentialService implements CredentialServiceInterface {
	
	// VARIABLE DECLARATIONS
	private String company;
	
	
	// CREDENTIAL SERVICE CLASS PARAMETERIZED CONSTRUCTOR
	public CredentialService(String company)
	{
		this.company = company;
	}
	
	
	// GENERATE EMAIL METHOD IN CREDENTIAL SERVICE CLASS
	@Override
	public String generateEmail(Employee employee, String department)
	{
		String email = employee.getFirstName().toLowerCase().replaceAll(" ", "") + 
					   employee.getLastName().toLowerCase().replaceAll(" ", "") + 
					   "@" + 
					   department.toLowerCase() + 
					   "." + 
					   company.toLowerCase() + 
					   ".com";
		return email;
	}
	
	
	
	// SHOW CREDENTIAL METHOD IN CREDENTIAL SERVICE CLASS
	@Override
	public void showCredentials(Employee employee, String department)
	{
		
		// PASSWORD GENERATOR CLASS OBJECT
		PasswordGenerator passwordGenerator = new PasswordGenerator();
		
		// CALLING GENERATE EMAIL METHOD
		String email = generateEmail(employee, department);
		
		// CALLING GENERATE PASSWORD METHOD
		String password = passwordGenerator.generatePassword();
		
		
		// PRINTING OF GENERATED EMAIL AND PASSWORDS ALONG WITH FIRST NAME AND LAST NAME
		System.out.println("Employee Name: " + employee.getFirstName() + " " + employee.getLastName());
		System.out.println("Your Email Address: " + email);
		System.out.println("Your Password: " + password);
	}
}

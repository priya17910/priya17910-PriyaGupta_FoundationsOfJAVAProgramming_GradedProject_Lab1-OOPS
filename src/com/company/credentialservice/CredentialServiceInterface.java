package com.company.credentialservice;

import com.company.employee.Employee;

public interface CredentialServiceInterface {
	public String generateEmail(Employee employee, String department);
	
	public void showCredentials(Employee employee, String department);
}

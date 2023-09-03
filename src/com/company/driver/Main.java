package com.company.driver;
import java.util.Scanner;

import com.company.credentialservice.CredentialService;
import com.company.credentialservice.CredentialServiceInterface;
import com.company.department.Department;
import com.company.employee.Employee;

public class Main {

	public static void main(String[] args) {
		String company = "GreatLearning";
		String firstName;
		String lastName;
		
		
		// PASSING VALUES FOR DIFFERENT DEPARTMENTS IN DEPARTMENT CLASS CONSTRUCTOR
		Department[] departments = {
				new Department(1, "Technical", "tech"),
				new Department(2, "Admin", "admin"),
				new Department(3, "Human Resources", "hr"),
				new Department(4, "Legal", "legal")
		};
		
		
		// SCANNER CLASS TO TAKE USER INPUT
		Scanner sc = new Scanner(System.in);
		
		
		// TAKE INPUT VALUES OF FIRST NAME AND LAST NAME FROM USER
		System.out.println("Enter First Name : ");
		do
		{
			firstName = sc.nextLine().trim();
		} while (firstName.isEmpty());
		
		System.out.println("Enter Last Name : ");
		do
		{
			lastName = sc.nextLine().trim();
		} while (lastName.isEmpty());
		
		
		// DISPLAYING DEPARTMENT DETAILS TO LET USER INPUT THE DESIRED DEPARTMENT ID
		System.out.println("Please enter the department ID from following : ");
		for (Department department : departments)
		{
			System.out.println(department.getId() + " ---> " + department.getName());
		}
		
		System.out.println("Department ID should be like 1 for Teechnical, 2 for Admin, 3 for Human Resource, 4 for Legal\n");
		
		
		// ASK USER TO INPUT HIS/HER CHOICE OF DEPARTMENT
		System.out.println("Enter the department ID : ");
		int choice = sc.nextInt();
		Department selectedDept = null;
		
		
		// CLOSING THE SCANNER CLASS OBJECT
		sc.close();
		
		
		// GET SELECTED DEPARTMENT CODE FROM THE ID GIVEN BY THE USER
		for (Department department : departments)
		{
			if (department.getId() == choice)
			{
				selectedDept = department;
				break;
			}
		}
		
		
		// MAKING SURE ENTERed DEPARTMENT IS NOT NULL
		if (selectedDept == null)
		{
			System.out.println("Invalid Department Choice.....");
			return;
		}
		
		
		// USING EMPLOYEE CLASS PARAMETERIZED CONSTRUCTOR TO PASS THE FIRST NAME AND LAST NAME AS ENTERED BY THE USER
		Employee employee = new Employee(firstName, lastName);
		
		
		// CEDENTIAL SERVICE CONSTRUCTOR TO PASS COMPANY NAME
		CredentialServiceInterface credential = new CredentialService(company);
		
		
		// USING CREDENTIAL CLASS OBJECT TO USE ITS SHOW CREDENTIAL METHOD TO DISPLAY THE DETAILS
		credential.showCredentials(employee, selectedDept.getCode());
	}

}

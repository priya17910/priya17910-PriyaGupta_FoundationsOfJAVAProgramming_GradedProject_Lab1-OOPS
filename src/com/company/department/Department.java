package com.company.department;

public class Department {
	
	// VARIABLE DECLARATIONS
	private int id;
	private String name;
	private String code;
	
	
	// DEPARTMENT CLASS PARAMETERIZED CONSTRUCTOR
	public Department(int id, String name, String code)
	{
		this.id = id;
		this.name = name;
		this.code = code;
	}
	
	
	// GETTER FOR ID
	public int getId() {
		return id;
	}
	
	
	// GETTER FOR NAME
	public String getName() {
		return name;
	}
	
	
	// GETTER FOR DEPARTMENT CODE
	public String getCode() {
		return code;
	}
}

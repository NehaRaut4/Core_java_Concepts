package com.app;

public class Employee {
	private int id;
	private String name;
	private int salary;
	private static int nextId=1; //static-shared among all objects
	//Parameterized constructor
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
		this.id = nextId++;//to autogenerate employee id
	}
	//method to display employee details
	public void show()
	{
		System.out.println("ID - "+id+" Name - "+name+" Salary - "+salary);
	}
	//method to show what next id will be
	public void showNextId()
	{
		System.out.println("Next employee Id will be - "+nextId);
	}
	
}

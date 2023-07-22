package com.app;

public class Employee {
	private int id;
	private String name;
	private int salary;
	private static int nextId=1;
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
		this.id = nextId++;
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
	//overriding finalize() method
	public void finalize()
	{
		--nextId;
		//gc will call finalize()
		//for two times for two objects e4 and e5
	}
}

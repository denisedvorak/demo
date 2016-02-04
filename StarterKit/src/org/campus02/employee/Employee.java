package org.campus02.employee;

public class Employee {

	private String name;
	private int number;
	
	
	
	public Employee(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void print()
	{
		System.out.println(name + " " + number);
	}
	
}

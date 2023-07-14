package com.vastpro.corejavalabassignmentmodel;

public class Person {
	private String name;
	private int age;
	private String address;
	private int empId;
	private double empSalary;
	public static int count = 0;

	public Person() {
		super();
	}

	public Person(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		count += 1;
	}
	
	

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

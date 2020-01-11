package com.singh.springrest.demo.model;

public class Student {
	
	private String firstName;
	private String lasName;
	
	public Student() {
	}
	
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lasName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLasName() {
		return lasName;
	}

	public void setLasName(String lasName) {
		this.lasName = lasName;
	}
	
	
}

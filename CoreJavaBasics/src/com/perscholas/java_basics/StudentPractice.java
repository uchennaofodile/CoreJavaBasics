package com.perscholas.java_basics;

public class StudentPractice {

	private String studentId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber; 

	public StudentPractice() {
		//Only necessary when giving initial values other than default
		//this("", "", "", "", "");
	}

	public StudentPractice(String studentId, String firstName, String lastName, String email, String phoneNumber) {
		this.studentId= studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void display() {
		System.out.printf("%s %s%n Student ID:  %5s%n Student Email: %10s%n Student Phone Number: %10s\n", this.firstName, this.lastName, this.studentId,this.email, this.phoneNumber);
	}

}

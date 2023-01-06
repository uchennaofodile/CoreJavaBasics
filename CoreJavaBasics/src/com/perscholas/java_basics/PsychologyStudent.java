package com.perscholas.java_basics;

public class PsychologyStudent extends StudentPractice {

	private int psychId;
	private String psychCode;

	public PsychologyStudent(String studentId, String firstName, String lastName, String email, String phoneNumber, int psychId, String psychCode) {
		super(studentId, firstName, lastName, email, phoneNumber);
		this.psychId = psychId;
		this.psychCode = psychCode;
	}

	public PsychologyStudent() {
		super();//calls default constructor
		psychId = 0;
		psychCode = "";
	}


	
	public int getPsychId() {
		return psychId;
	}

	public void setPsychId(int psychId) {
		this.psychId = psychId;
	}

	public String getPsychCode() {
		return psychCode;
	}

	public void setPsychCode(String psychCode) {
		this.psychCode = psychCode;
	}

	@Override
	public void display() {
		//super.display();
		System.out.println("psychId: "+ this.getPsychId()+ " "+ "psychCode: "+ this.getPsychCode());
	}

	
	
}

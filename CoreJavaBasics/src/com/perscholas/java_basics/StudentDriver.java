package com.perscholas.java_basics;

public class StudentDriver {

	public static void main(String[] args) {
		StudentPractice student1 = new StudentPractice("0001", "Michael", "Gabriel", "mgabirel@perscholas.org", "123-456-7890");
		StudentPractice student2 = new StudentPractice("0002", "Bairon", "Vasquez", "bvasquezl@perscholas.org", "123-456-7891");
		StudentPractice student3 = new StudentPractice();
		student3.setFirstName("Uchenna");
		student3.setLastName("Ofodile");
		student3.setPhoneNumber("212-212-1289");
		student3.setEmail("uo@gmail.com");
		student3.setStudentId("1214");
		
//		student1.display();
//		//System.out.println();
//		student2.display();
//		student3.display();
		
		PsychologyStudent ps = new PsychologyStudent();
		System.out.println(ps.getFirstName());
		ps.setFirstName("Ada");
		System.out.println(ps.getFirstName());
		ps.display();

	}

}

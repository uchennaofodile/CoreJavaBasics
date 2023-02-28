package jpa.service;

import java.util.ArrayList;
import java.util.List;

import jpa.dao.StudentDAOImpl;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

public class StudentService {

	private StudentDAOImpl sd;

	public StudentService() {};

	//Returns a student given an email
	public List<Student> getStudentByEmail(String email) {
		sd = new StudentDAOImpl();
		Student student = sd.getStudentByEmail(email);
		List<Student> students = new ArrayList<>();
		students.add(student);
		return students;
	}
	//Returns the student courses
	public List<Course> getStudentCourses(String email) {
		sd = new StudentDAOImpl();
		List<Course>courses = sd.getStudentCourses(email);
		return courses;
	}
	//Registers a student to a given course
//	public void registerStudentToCourse(String getsEmail, Course newCourse) {
//		sd = new StudentDAOImpl();
//		sd.registerStudentToCourse(getsEmail, newCourse);
//
//
//	}
	public boolean registerStudentToCourse(String getsEmail, Course newCourse) {
		sd = new StudentDAOImpl();
	boolean result =	sd.registerStudentToCourse(getsEmail, newCourse);
return result;

	}

}

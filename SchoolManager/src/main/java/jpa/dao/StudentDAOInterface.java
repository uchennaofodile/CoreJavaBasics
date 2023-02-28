package jpa.dao;

import java.util.List;

import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

public interface StudentDAOInterface {
	
	
List<Student>getAllStudents();

Student getStudentByEmail(String email);

boolean validateStudent(String email, String password);

boolean registerStudentToCourse(String email, Course course);

List<Course> getStudentCourses(String email);



}

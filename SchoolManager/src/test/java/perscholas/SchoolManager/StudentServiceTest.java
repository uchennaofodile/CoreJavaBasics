package perscholas.SchoolManager;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import jpa.service.StudentService;

class StudentServiceTest {

private StudentService sc;
private Student student;
private List<Course> courses;

	
@BeforeEach
public void setUp() throws Exception {
	student = new Student();
	sc = new StudentService();
	courses = new ArrayList<>();
	student.setsName("Alexandra Iannitti");
	student.setsEmail("aiannitti7@is.gd");
	student.setsPass("TWP4hf5j");
	Course course1 = new Course(1, "English", "Anderea Scamaden");
	courses.add(course1);
	Course course2 = new Course(2, "Mathematics", "Eustace Niemetz" );
	courses.add(course2);
	Course course3 = new Course(3, "Anatomy", "Reynolds Pastor" );
	courses.add(course3);
	student.setsCourses(courses);
	
}
	

	//Tests to make sure the student with the given email exists
	@Test
	public void testGetStudentByEmail(){
		assertNotNull(sc.getStudentByEmail(student.getsEmail()));
	}

	//Tests to make sure the student has courses
	@Test
	public void testGetStudentCourses() {
		
		assertNotNull(sc.getStudentCourses(student.getsEmail()));
	}


	//Tests that student service method is returning a course list equal to created student
	@Test
	public void testGetStudentCourseTestForOneStudent() {
	
	assertEquals(student.getsCourses(), sc.getStudentCourses(student.getsEmail()));
	assertTrue(student.getsCourses().equals(sc.getStudentCourses(student.getsEmail())));
		
	}


}

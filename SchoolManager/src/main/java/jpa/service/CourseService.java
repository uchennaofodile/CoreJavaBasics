package jpa.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jpa.dao.CourseDAOImpl;
import jpa.dao.CourseDAOInterface;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

public class CourseService {
	CourseDAOImpl cd;
	
	public CourseService() {};
	
	//Returns all the available courses
	public List<Course> getAllCourses() {
		cd = new CourseDAOImpl();
		List<Course> courses = cd.getAllCourses();
		return courses;
	}

	//Gets a course based the course id
	public List<Course> GetCourseById(int number) {
			Transaction transaction = null;
			SessionFactory factory = new Configuration().configure().buildSessionFactory();
			Session session = factory.openSession();
			transaction = session.beginTransaction();
			cd = new CourseDAOImpl();
			List<Course> course = cd.getAllCourses();
			List<Course> courseFinder = new ArrayList<>();
			for(int i=0; i<course.size(); i++) {
				if(course.get(i).getcId()==number) {
					courseFinder.add(course.get(i));
				}
			}
		
			transaction.commit();
			session.close();
			factory.close();
		
return courseFinder;
		
	}

	
}

package jpa.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


import jpa.entitymodels.Course;

public class StudentCourseService {
	public StudentCourseService() {};

	//Gets all the courses that the student is registered to
	public List<Course> getAllStudentCourses(String getsEmail) {
			Transaction transaction = null;
			SessionFactory factory = new Configuration().configure().buildSessionFactory();
			Session session = factory.openSession();
			transaction = session.beginTransaction(); 
			String q = "FROM Course c JOIN StudentCourse s ON c.id = s.cId WHERE s.sEmail = :email";
			Query<Course> query = session.createQuery(q,Course.class);
			query.setParameter("email", getsEmail);
			List<Course> courses = query.list();
//			for(Course course: courses) {
//				System.out.println(course);
//			}
			return courses;
			
	}
}

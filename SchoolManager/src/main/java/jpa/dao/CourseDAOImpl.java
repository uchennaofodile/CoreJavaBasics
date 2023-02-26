package jpa.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


import jpa.entitymodels.Course;

public class CourseDAOImpl implements CourseDAOInterface {

	private SessionFactory factory;
	private Session session;
	private Transaction transaction;
	
	public CourseDAOImpl() {}
	@Override
	public List<Course> getAllCourses() {
		factory = new Configuration().configure().buildSessionFactory();
		session = factory.openSession();
		transaction = session.beginTransaction();
		String hql = "From Course";
		Query<Course> query = session.createQuery(hql, Course.class);
		List<Course> courses = query.getResultList();
//		for(Course course: courses) {
//			System.out.println(course);
//		}
		return courses;
	}

}

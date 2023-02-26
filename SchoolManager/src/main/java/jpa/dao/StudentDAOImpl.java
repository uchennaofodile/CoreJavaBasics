package jpa.dao;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import jpa.entitymodels.StudentCourse;

public class StudentDAOImpl implements StudentDAOInterface {
	
	private SessionFactory factory;
	private Session session;
	private Transaction transaction;
	
	public StudentDAOImpl() {}

	@Override
	public List<Student> getAllStudents() {
		factory = new Configuration().configure().buildSessionFactory();
		session = factory.openSession();
		transaction = session.beginTransaction();
		String hql = "from Student";
		Query<Student> query =  session.createQuery(hql, Student.class);
		List<Student> students = query.list();
		transaction.commit();
		session.close();
		factory.close();
		return students;
		
		
	}

	@Override
	public Student getStudentByEmail(String email) {
		factory = new Configuration().configure().buildSessionFactory();
		session = factory.openSession();
		transaction = session.beginTransaction();
		Query<Student> query = session.createQuery("From Student s Where s.sEmail=:email", Student.class);
		query.setParameter("email", email);
		Student student = query.getSingleResult();
		System.out.println(student.getsName());
		transaction.commit();
		factory.close();
		session.close();
		return student;
	}

	@Override
	public boolean validateStudent(String email, String password) {
		try{factory = new Configuration().configure().buildSessionFactory();
		session = factory.openSession();
		transaction = session.beginTransaction();
		Query <Student> query = session.createQuery("select s from Student s where email=:email && password=:password", Student.class);
		query.setParameter("email", email);
		query.setParameter("password", password);
		List<Student> students = query.getResultList();
		if(students.isEmpty()) {
			 System.out.println("User not found");
			   transaction.commit();
			   session.close();
			   factory.close();
			   return false;
		}
		for(Student student: students) {
			System.out.println(student);
		}
		transaction.commit();
		session.close();
		factory.close();
		return true;
		}
		catch(Exception e) {
			System.out.println("User not found");
			System.out.println(e.getMessage());
			e.printStackTrace();
			transaction.commit();
			session.close();
			factory.close();
			return false;
		}
	
		
		
		
	}

	@Override
	public boolean registerStudentToCourse(String email, Course course) {
		factory = new Configuration().configure().buildSessionFactory();
		session = factory.openSession();
		transaction = session.beginTransaction();
		// Check if the student is already registered for the course
	    Query<StudentCourse> query = session.createQuery("from StudentCourse where sEmail = :email and cId = :courseId", StudentCourse.class);
	    query.setParameter("email", email);
	    query.setParameter("courseId", course.getcId());
	    List<StudentCourse> studentCourses = query.list();
	    if (!studentCourses.isEmpty()) {
	        // The student is already registered for the course
	    	System.out.println("The student is already registed in: " + course);
	        transaction.rollback();
	        session.close();
	        factory.close();
	        return false;
	    }
		StudentCourse sc = new StudentCourse();
		sc.setsEmail(email);
		sc.setcId(course.getcId());
		session.persist(sc);
		transaction.commit();
		session.close();
		factory.close();
		return true;
	}

	@Override
	public List<Course> getStudentCourses(String email) {
		factory = new Configuration().configure().buildSessionFactory();
		session = factory.openSession();
		transaction = session.beginTransaction();
		String hql = "From Student Where sEmail=:email";
		//String hql2 = "From StudentCourse WHERE sEmail=:email";
		//Query<Course> query = session.createQuery(hql2, Course.class).setParameter("email", email);
		
		//List<Course> courses = query.getResultList();
		//Query<Student> query = session.createQuery(hql2, Student.class);
		Query<Student> query = session.createQuery(hql, Student.class);
		query.setParameter("email", email);
		Student student = query.getSingleResult();
		Hibernate.initialize(student.getsCourses()); 
		List<Course> courses = student.getsCourses();
//		for(Course course: courses) {
//			System.out.println(course);
//		}
		transaction.commit();
		session.close();
		factory.close();
		
		return courses;
	}


}

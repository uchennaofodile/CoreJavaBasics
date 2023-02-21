package com.perscholas.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

import org.hibernate.Transaction;

public class UserDAO {
//private final SessionFactory sessionFactory;
//private final Session session;
//
//public UserDAO(SessionFactory sessionFactory, Session session) {
//	this.sessionFactory = sessionFactory;
//	this.session = session;
//}
public User saveUser(User user) {
	Transaction transaction = null;
	try {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		transaction = session.beginTransaction();
		session.persist(user);
		transaction.commit();
	return user;
	}
	catch(Exception e) {
		if(transaction !=null) {
			transaction.rollback();
		}
		System.out.println(e.getMessage());
		e.printStackTrace();
		return null;
	}
}

public boolean login(String email, String password) {
	Transaction transaction = null;
	try {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		transaction = session.beginTransaction(); 
	String hql = "FROM User WHERE email =:email AND password =:password";
Query<User> query =session.createQuery(hql, User.class);
	 query.setParameter("email", email);
	 query.setParameter("password", password);
	List<User>users = query.getResultList();
	for(User user: users) {
		System.out.println(user);
	}
	return true;
	}
	catch(Exception e) {
		if(transaction !=null) {
			transaction.rollback();
		}
		System.out.println(e.getMessage());
		e.printStackTrace();
		return false;
	}
	

}

public User findByEmail(String email) {

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();
	Transaction transaction = session.beginTransaction();
	String q = "FROM User WHERE email = :email";
	User user = new User();
	Query<User> query = session.createQuery(q, User.class).setParameter("email", email);
	user = query.getSingleResult();
	System.out.println(user);
	transaction.commit();
	factory.close();
	session.close();
	return user;
}

//public User findByEmail(User user) {
//	Transaction transaction = null;
//	SessionFactory factory = new Configuration().configure().buildSessionFactory();
//	Session session = factory.openSession();
//	try {
//		transaction = session.getTransaction();
//	String email = user.getEmail();
//	user = session.bySimpleNaturalId(User.class).load(email);
//	System.out.println(user);
//	transaction.commit();
//	session.close();
//	
//	return user;
//	}
//	catch(Exception e) {
//		if(transaction != null) {
//		transaction.rollback();
//	}
//	System.out.println(e.getMessage());
//	e.printStackTrace();
//	session.close();
//	return null;
//	}
//
//	
//
//}

public List<User> findUsersByZip(String zipcode) {
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();
	String q = "FROM User WHERE zipcode = :zipcode";
	//User user = new User();
	
	Query<User> query = session.createQuery(q, User.class);
	query.setParameter("zipcode", zipcode);
	List<User> users = query.getResultList();
	for(User user: users) {
		System.out.println(user);
	}
	return users;
	
	
	
	
	
}

//public List<User> getUsersByZipCode(String zipCode) {
//    SessionFactory factory = new Configuration().configure().buildSessionFactory();
//    		Session session = factory.openSession(); 
//        CriteriaBuilder builder = session.getCriteriaBuilder();
//        CriteriaQuery<User> query = builder.createQuery(User.class);
//        Root<User> root = query.from(User.class);
//        query.select(root).where(builder.equal(root.get("zipcode"), zipCode));
//        Query<User> q = session.createQuery(query);
//        List<User> users =   q.getResultList();
//        for(User user: users) {
//       	 System.out.println(user.toString());
//        }
//        return q.getResultList();
//    }
}



	
	


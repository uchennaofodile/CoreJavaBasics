package com.test.hib.controller;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.test.hib.model.Department;

public class CreateDepartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//how to insert a record into the table using Hibernate
		//Session steps
		//Create a new configuration as a SessionFactory
		//openSession()
		//beginTransaction()
		//do stuff
		//when done
		//use session.persist(obj)
		//commit the transaction
		//close the session, session.close()
		//1. create a table object
		//2. use your setters to insert a new row
		//3. each object is a new row and needs to be set or use the constructor
		//to create the record
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		Department d1 = new Department();
		d1.setName("The Undertaker");
		d1.setState("Texas");
		
		Department d2 = new Department();
		d2.setName("Rey Mysterio");
		d2.setState("California");
		
		Department d3 = new Department();
		d3.setName("Ember Moon");
		d3.setState("Texas");
		
		Department d4 = new Department("The Lucha Brothers", "Mexico City");
		
		Department d5 = new Department("The Usos", "California");
		
		session.persist(d1);
		session.persist(d2);
		session.persist(d3);
		session.persist(d4);
		session.persist(d5);
		t.commit();
		session.close();
		
		
	}

}

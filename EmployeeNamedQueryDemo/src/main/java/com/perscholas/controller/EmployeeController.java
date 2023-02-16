package com.perscholas.controller;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.perscholas.model.Employee;

import jakarta.persistence.TypedQuery;
public class EmployeeController {
	public void createEmployeeTable()
	{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Transaction t = session.beginTransaction();   
		//Table already created
		Employee uone = new Employee();
		t.commit();
		System.out.println("Successfully saved");  
		factory.close();  
		session.close();   

	}

	public void findEmployeeByName() {
		//--------------------Hibernate Named Query----------------//
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		TypedQuery query = session.createNamedQuery("findEmployeeByName", Object[].class);
		query.setParameter("name", "Tom Thele");
		List<Object[]> employees = query.getResultList();
		for(Object[] o: employees) {
			System.out.println("Employee Name: "+o[0]+ " | Employee Salary: "+o[1]+ 
					" | Employee Job Title: "+ o[2] );
		}
		factory.close();
		session.close();
 

	}

	public void findEmployeeById()
	{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		//------------  Hibernate Named Query   ------------- 
		TypedQuery query = session.getNamedQuery("get_Emp_name_by_id");
		query.setParameter("id", 3);
		List<Object[]> emName = query.getResultList();
		for(Object[] o: emName) {
			System.out.println("Employee Name: "+o[0]+ " | Employee Salary: "+o[1]+ 
					" | Employee Job Title: "+ o[2] );
		}
		factory.close();
		session.close();


	}


	public void ShowOfficeCodesAsDepartment() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		//-------------Hibernate Named Query----------------

		TypedQuery query =	session.getNamedQuery("empDepAlias");
		List<Object[]> rows = query.getResultList();
		for(Object [] column: rows) {
			System.out.println("OfficeCode: "+ column[1]+ " | Department Name: "+ column[3]+" | Employee Name: " + column[2]);
		}

		factory.close();
		session.close();
	}

}




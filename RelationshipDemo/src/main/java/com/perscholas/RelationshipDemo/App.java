package com.perscholas.RelationshipDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.perscholas.model.Department;
import com.perscholas.model.Teacher;
import com.perscholas.model.Teacher1;
import com.perscholas.model.Department1;
import com.perscholas.model.Address;
import com.perscholas.model.Person;
import com.perscholas.model.Cohort;


public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction t = session.beginTransaction();
    	
//    	Department dep = new Department();
//    	dep.setDname("IT");
//    	
//    	Department dep2= new Department();
//    	dep2.setDname("HR");
//    	
//    	Teacher t1 = new Teacher();
//    	t1.setDep(dep);
//    	t1.setSalary("1000");
//    	t1.setTeachername("MHaseeb");
//    	
//    	Teacher t2 = new Teacher();
//    	t2.setDep(dep);
//    	t2.setSalary("2220");
//    	t2.setTeachername("Shahparan");
//    	
//    	Teacher t3 = new Teacher();
//    	t3.setDep(dep);
//    	t3.setSalary("30000");
//    	t3.setTeachername("James");
//    	
//    	Teacher t4 = new Teacher();
//    	t4.setDep(dep2);
//    	t4.setSalary("40000");
//    	t4.setTeachername("Joseph");
//    	
    	
    	
// New Mapping
//    	Teacher1 t11 = new Teacher1();
//		t11.setTeacher1name("Haseeb");
//		t11.setSalary("100");
//
//		Teacher1 t21 = new Teacher1();
//		t21.setTeacher1name("Jenny Finch");
//		t21.setSalary("10000");
//	
//		Teacher1 t31 = new Teacher1();
//		t31.setTeacher1name("James");
//		t31.setSalary("25000");
//	
//		Teacher1 t41 = new Teacher1();
//		t41.setTeacher1name("SID ROSE");
//		t41.setSalary("3000");
//		
//		Teacher1 t51 = new Teacher1();
//		t51.setSalary("200");
//		t51.setTeacher1name("Ali");
//		   
//	  //Add teacher entity object to the list
//	   List<Teacher1> teachlist = new ArrayList();
//	   teachlist.add(t11);
//	   teachlist.add(t21);
//	   teachlist.add(t31);
//	   teachlist.add(t41);
//	   teachlist.add(t51);
//	   session.persist(t11);
//	   session.persist(t21);
//	   session.persist(t31);
//	   session.persist(t41);
//	   session.persist(t51);
//	   //Create Department 
// 	   Department1 department = new Department1();
//	   department.setDname("Development");
//	   department.setTeacherList(teachlist);
//		   
//	   //Store Department
//	    session.persist(department);
//		

    	
//    	session.persist(dep);
//    	session.persist(dep2);
//    	session.persist(t1);
//    	session.persist(t2);
//    	session.persist(t3);
//    	session.persist(t4);
    	
//    	Address a1 = new Address();
//		a1.setCity("nyc");
//		a1.setState("NY");
//		a1.setStreet("27th street");
//		a1.setZipcode(11103);
//		
//		Address a2 = new Address();
//		a2.setCity("Buffalo");
//		a2.setState("NY");
//		a2.setStreet("28th street");
//		a2.setZipcode(15803);
//		
//		Person p1 = new Person();
//    	p1.setAge(25);
//    	p1.setEmail("e.jon@email.com");
//    	p1.setName("elbert Adam");
//    	p1.setAdress(a1);
//    	
//    	Person p2 = new Person();
//    	p2.setAge(45);
//    	p2.setEmail("ch.fink@email.com");
//    	p2.setName("Christ fink");
//    	p2.setAdress(a2);
//				
//		session.persist(p1);
//		session.persist(p2);
//		session.persist(a1);
//		session.persist(a2);
    	
    	//----Create Cohort/class Entity set one----
    	Cohort Class1 = new Cohort("Java Developer", "14 weeks");
		Cohort Class2 = new Cohort("FullStack Developer", "7 Weeks");
		Cohort Class3 = new Cohort("Python Developer", "12 Weeks");
		//------  Store Cohort  / Class  --------
		session.persist(Class1);
		session.persist(Class2);
		session.persist(Class3);
	
		//-----Create Cohort one / Class one --------
		Set<Cohort> ClassSet1 = new HashSet<Cohort>();
		ClassSet1.add(Class1);
		ClassSet1.add(Class2);
		ClassSet1.add(Class3);
		//-----Create Cohort two / Class two --------
		Set<Cohort> ClassSet2 = new HashSet<Cohort>();
		ClassSet2.add(Class2);
		ClassSet2.add(Class3);
		ClassSet2.add(Class1);
		//-----Create Cohort Three / Class Three --------
		Set<Cohort> ClassSet3 = new HashSet<Cohort>();
		ClassSet3.add(Class3);
		ClassSet3.add(Class1);
		ClassSet3.add(Class2);
		
		Teacher t12 = new Teacher("100", "Haseeb", ClassSet1);
		Teacher t22 = new Teacher("200", "Jenny", ClassSet2);
		Teacher t32 = new Teacher("200", "Charlie", ClassSet3);
				
		session.persist(t12);
		session.persist(t22);
		session.persist(t32);


    	t.commit();	
    	}
}
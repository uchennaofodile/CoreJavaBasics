package com.perscholas.UserTestDemo;

import static org.junit.Assert.*;

import java.util.*;

import com.perscholas.model.User;
import com.perscholas.model.UserDAO;

import jakarta.persistence.PersistenceException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class UserTest {
	User user1;
	User user2;
	User user3;
	UserDAO dao;
	List<User> users = new ArrayList<User>();

	@Before
	public void setUp() throws Exception {
		user1 = new User("uo1@gmail.com", "Uchenna Ofodile", "123", "742 Evergreen Terrace", "FL", "78926");
		user2 = new User("uo2@gmail.com", "Mike", "123", "742 Evergreen Terrace", "FL", "78926");
		user3 =  new User("obi@gmail.com", "Obi Ofodile", "123", "742 Evergreen Terrace", "FL", "78926");
		//users.clear();
		users.add(user1);
		users.add(user2);
		users.add(user3);
		dao = new UserDAO();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLogin() {
		//use assertEquals: used to describe if the login will return true
		assertEquals(true, dao.login(user1.getEmail(), user1.getPassword()));
	}

	@Test
	public void testFindByEmailString() {
		/*assertEquals: Asserts that two objects are equal.
assertSame: Asserts that two objects refer to the same object.
assertEquals uses equals()
assertSame uses == operator
assertSame same object name
		 */
		assertEquals(user2, dao.findByEmail(user2.getEmail()));
		//assertSame(true, dao.login(user1.getEmail(), user1.getPassword()));
	}

	@Test
	public void testFindUsersByZip() {
		assertEquals(users, dao.findUsersByZip(user2.getZipcode()));
		//assertArrayEquals(users.toArray(), dao.findUsersByZip(user2.getZipcode()).toArray());
	}
	
//	@Test
//	public void testSaveDuplicate() throws PersistenceException {
//		
//	}


}

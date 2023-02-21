package com.perscholas.UserTestDemo;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.ArgumentAccessException;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.CsvSource;

import com.perscholas.model.User;
import com.perscholas.model.UserDAO;

class JUnitP2 {
private static UserDAO userDAO=null;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		userDAO = new UserDAO();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}


	@ParameterizedTest
	@CsvSource({
		"uo1@gmail.com,Uchenna Ofodile, 123, 742 Evergreen Terrace, FL,78926",
		"uo2@gmail.com,Mike,123,742 Evergreen Terrace,FL,78926"
	})
	void testGetUserById(ArgumentsAccessor arguments) throws ArgumentAccessException, SQLException {
		System.out.println(this.toString());
		User expected = new User(arguments.getString(0),
				arguments.getString(1),
				arguments.getString(2), 
				arguments.getString(3),
				arguments.getString(4),
				arguments.getString(5));
		User actual = userDAO.findByEmail(
				arguments.getString(0));
		assertEquals(expected,actual);
	}

}

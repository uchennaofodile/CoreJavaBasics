import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.ArgumentAccessException;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.programming.techie.ContactManager;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ContactManagerTest {
	ContactManager contactManager;

	
	@BeforeAll
	public void setUpAll() {
		System.out.println("Should Print Before All Tests");
	}
	@BeforeEach
	public void setUp() throws Exception {
		System.out.println("Executing before each test");
		contactManager = new ContactManager();
		
		
	}



	@Test
	void shouldCreateContact() {
		contactManager.addContact("Anthony", "Onwuzu", "0178516712");
		Assertions.assertFalse(contactManager.getAllContacts().isEmpty());
		Assertions.assertEquals(1, contactManager.getAllContacts().size());
		Assertions.assertTrue(contactManager.getAllContacts().size()==1);
	}

	@Test
	@DisplayName("Should Not Create Contact Name When First Name is Null")
	public void shouldThrowRuntimeExceptionWhenFirstNameIsNull() {
		Assertions.assertThrows(RuntimeException.class, ()->{
			contactManager.addContact(null, "Ofodile", "4072993467");
		});
	}
	@Test
	@DisplayName("Should Not Create Contact Name When Last Name is Null")
	public void shouldThrowRuntimeExceptionWhenLastNameIsNull() {
		Assertions.assertThrows(RuntimeException.class, ()->{
			contactManager.addContact("Clara", null, "4075629876");
		});
		
	}
	@Test
	@DisplayName("Should not Create Contact Name First Name is Null")
	public void shouldThrowRuntimeExceptionWhenPhoneNumberIsNull() {
		Assertions.assertThrows(RuntimeException.class, ()->{
			contactManager.addContact("Chinwe", "Onwuzu", null);
		});
	}
	
	@DisplayName("Contact Creation using Strings")
	@ParameterizedTest
	@ValueSource(strings = {"0123456789","0123456789","0123456789"})
	public void shouldTestContactCreationUsingValueSource(String phoneNumber) {
		contactManager.addContact("Kid", "Cudi", phoneNumber);
		assertFalse(contactManager.getAllContacts().isEmpty());
		assertTrue(contactManager.getAllContacts().size()==1);	
		assertEquals(1, contactManager.getAllContacts().size());	
	}
	
	@DisplayName("Method Source Case - Phone Number should mathc the required format")
	@ParameterizedTest
	@MethodSource("phoneNumberList")
	public void shouldTestPhoneNumberFormatUsingMethodSource(String phoneNumber) {
		contactManager.addContact("John", "Doe", phoneNumber);
		assertEquals(1, contactManager.getAllContacts().size());
		assertTrue( contactManager.getAllContacts().size()==1);
		assertFalse(contactManager.getAllContacts().isEmpty());
	}
	
	@DisplayName("CSV Source Case - Phone Number should match the required format")
	@ParameterizedTest
	@CsvSource({"0123456789","0123456789","0123456789"})
	public void shouldTestPhoneNumberUsingCsvSource(ArgumentsAccessor arguement) throws ArgumentAccessException, SQLException {
		contactManager.addContact("John", "Doe", arguement.getString(0));
		assertEquals(1, contactManager.getAllContacts().size());
		assertFalse(contactManager.getAllContacts().isEmpty());
		assertTrue(contactManager.getAllContacts().size()==1);
	}
	
	@DisplayName("CSV File Source Case - Phone Numbers should match the required format")
	@ParameterizedTest
	@CsvFileSource(resources = "/data.csv")
	public void shouldTestPhoneNumberUsingCsvFileSource(String phoneNumber) {
		contactManager.addContact("John", "Doe", phoneNumber);
		assertEquals(1, contactManager.getAllContacts().size());
		assertTrue(contactManager.getAllContacts().size()==1);
		assertFalse(contactManager.getAllContacts().isEmpty());
	}
	
	private static List<String> phoneNumberList(){
		return Arrays.asList("0123456789", "0123456789", "0123456789");
	}
	@AfterEach
	public void tearDown() {
		System.out.println("Should execute after each test");
		
	}
	
	@AfterAll
	public void tearDownAll() {
		System.out.println("Should be executed at the end of the Test");
	}
}

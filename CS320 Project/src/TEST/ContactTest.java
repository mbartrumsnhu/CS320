package TEST;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

import Main.Contact;

class ContactTest {
// These are the test for Contact. 
	@Test
	void testContact() {
		Contact Contact = new Contact("mBartrum", "Matthew",  "Bartrum", 
				"8888675309", "8049BishopAveWakefieldMA01880");
		assertTrue(Contact.getId().equals("mBartrum"));
		assertTrue(Contact.getFirstName().equals("Matthew"));
		assertTrue(Contact.getLastName().equals("Bartrum"));
		assertTrue(Contact.getPhone().equals("8888675309"));
		assertTrue(Contact.getAddress().equals("8049BishopAveWakefieldMA01880"));
	}

	@Test
	void testNullID() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact(null, "Matthew",  "Bartrum", 
				"8888675309", "8049BishopAveWakefieldMA01880");
	});
	}
	@Test
	void testLongID() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("8000000000000", "Matthew",  "Bartrum", 
				"8888675309", "8049BishopAveWakefieldMA01880");
	});
	}
	@Test
	void testNullFirstName() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("mBartrum", null,  "Bartrum", 
				"8888675309", "8049BishopAveWakefieldMA01880");
	});
	}
	@Test
	void testLongFirstName() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("mBartrum", "verylongnamedude",  "Bartrum", 
				"8888675309", "8049BishopAveWakefieldMA01880");
	});
	}
	@Test
	void testLongLastName() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("mBartrum", "Matthew",  "BartrumLongName", 
				"8888675309", "8049BishopAveWakefieldMA01880");
	});
	}
	@Test
	void testNullPhone() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("mBartrum", "Matthew",  "Bartrum", 
				null, "8049BishopAveWakefieldMA01880");
	});
	}
	@Test
	void testLongPhone() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("mBartrum", "Matthew",  "Bartrum", 
				"888867530910", "8049BishopAveWakefieldMA01880");
	});
	}
	@Test
	void testNullAdress() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("mBartrum", "Matthew",  "Bartrum", 
				"8888675309", null);
	});
	}
	@Test
	void testLongAdress() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("mBartrum", "Matthew",  "Bartrum", 
				"8888675309", "8049BishopAveWakefieldMA01880LONG");
	});
	}
}

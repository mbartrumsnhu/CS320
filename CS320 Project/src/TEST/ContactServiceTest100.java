package TEST;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Main.Contact;
import Main.ContactService;

class ContactServiceTest100 {

	// these are the test for the ContactService.
	@Test
	void testAddContact() {
		Contact contact = new Contact("800", "Matthew",  "Bartrum", 
				"8888675309", "8049BishopAveWakefieldMA01880");
		ContactService cs = new ContactService();
		assertTrue(cs.addContact(contact,"800"));
}
	void testDeleteContact() {
		Contact Contact = new Contact("900", "Matthew",  "Bartrum", 
				"8888675309", "8049BishopAveWakefieldMA01880");
		ContactService cs = new ContactService();
		cs.addContact(Contact,"900");
      assertTrue(cs.deleteContact("900"));
	}
	@Test
	void testUpdateFirstName() {
		Contact contact = new Contact("700", "Matthew",  "Bartrum", 
				"8888675309", "8049BishopAveWakefieldMA01880");
		ContactService cs = new ContactService();
		cs.addContact(contact,"800");
      assertTrue(cs.updateFirstName("700","Bob"));
    }
	@Test
	void testUpdateLastName() {
		Contact contact = new Contact("700", "Matthew",  "Bartrum", 
				"8888675309", "8049BishopAveWakefieldMA01880");
		ContactService cs = new ContactService();
		cs.addContact(contact,"800");
      assertTrue(cs.updateLastName("700","Kirkwood"));
    }
	@Test
	void testUpdatePhone() {
		Contact contact = new Contact("900", "Matthew",  "Bartrum", 
				"8888675309", "8049BishopAveWakefieldMA01880");
		ContactService cs = new ContactService();
		cs.addContact(contact,"900");
      assertTrue(cs.updateNumber("900","8888675307"));
    }
	@Test
	void testUpdateAddress() {
		Contact contact = new Contact("900", "Matthew",  "Bartrum", 
				"8888675309", "8049BishopAveWakefieldMA01880");
		ContactService cs = new ContactService();
		cs.addContact(contact,"900");
      assertTrue(cs.updateAddress("900","8000BishopAveWakefieldMA01880"));
    }
}

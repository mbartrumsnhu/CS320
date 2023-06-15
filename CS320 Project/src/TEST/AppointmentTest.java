package TEST;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Main.Appointment;

class AppointmentTest {
	/// the test for the appointments
	@Test
	void testAppointment() {

	   Date date = new Date(2024,12,18);

			Appointment appointment = new Appointment("500",date,"Meeting with Pam") ;
				assertTrue(appointment.getAppointmentID().equals("500"));
				assertTrue(appointment.getDate().equals(date));
				assertTrue(appointment.getDescription().equals("Meeting with Pam"));


				
			
	}
	@Test
	void testPastDate() {
		   Date date = new Date(2000,12,18);

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("500",date,"Meeting with Pam");
		});
}
	
	

	@Test
	void testNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(null,null,null);
		});
}
	@Test
	void testTooLong() {
		   Date date = new Date(2024,12,18);

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("500000000000",date,"Meeting with Pam000000000000000000000000"
					+ "00000000000000000000000000000000000000000000000000");
		});
}
}


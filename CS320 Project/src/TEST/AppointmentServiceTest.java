package TEST;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

import Main.Appointment;
import Main.AppointmentService;

class AppointmentServiceTest {
	// test of the appointments

	@Test
	void testAddContact() {
		 Date date = new Date(2024,12,18);
			Appointment appointment = new Appointment("500",date,"Meeting with Pam") ;
		AppointmentService as = new AppointmentService();
		assertTrue(as.addAppointment(appointment));

}
	@Test
	void testDeleteContact() {
		 Date date = new Date(2024,12,18);
			Appointment appointment = new Appointment("500",date,"Meeting with Pam") ;

			AppointmentService as = new AppointmentService();
		as.addAppointment(appointment);
		assertTrue(as.deleteAppointment(appointment));

}

}

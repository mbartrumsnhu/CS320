package Main;
import java.util.ArrayList;
public class AppointmentService {
	static ArrayList<Appointment> list = new ArrayList<Appointment>();
	// this adds appointments the list
	public boolean addAppointment(Appointment appointment){
		// checks to see if anything is in the list
		   if(list.size() == 0){
		          
	           list.add(appointment);
	           return true;
	             
	         }
		   //checks to see if it's already in the list
		   else if (list.contains(appointment)) {
				throw new IllegalArgumentException("Invalid");
			
			}
			else  {
				// this add it the list  
				list.add(appointment);
				return true;
				  }
}
	// delete the appointment from the list
	public boolean deleteAppointment (Appointment appointmentID){
		// checks the list
		if(list.contains(appointmentID)) {
			list.remove(appointmentID);
			return true;
		}
		

	  return false;
}
}

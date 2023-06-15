package Main;
import java.util.Date;
public class Appointment {
private String appointmentID;
Date date = new Date();
private String description;
// This setup appointments and checks for what is valid and not for inputs
 public Appointment(String appointmentID, Date date, String description){
	 if(appointmentID == null || appointmentID.length() > 10) {
		 throw new IllegalArgumentException("Invalid");
	 }
	 if(description == null || description.length() > 50) {
		 throw new IllegalArgumentException("Invalid");
	 }
	 // i put in a basic date for this test. In reality you would let this be.
	 // for this test I wanted something that I could see while doing the test.
	 if(date == null || date.before(new Date(2023,05,24)) ) {
		 throw new IllegalArgumentException("Invalid");
	 }
	 this.appointmentID=appointmentID;
	 this.description=description;
	 this.date=date;
 }
 
 // these are the getters and setters
  public String getAppointmentID() {
	  return appointmentID;
  }
  public String getDescription() {
	  return description;
  }
  public void setdescription(String description) {
	  this.description=description;
  }
  public Date getDate() {
	  return date;
  }
  public void setDate(Date date) {
	  this.date=date;
  }
  
}

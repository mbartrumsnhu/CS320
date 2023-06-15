package Main;
import java.util.ArrayList;

public class ContactService {
	// This is the start of array list called list forour contacts. 
	static ArrayList<Contact> list = new ArrayList<Contact>();
	

// The add contact that will go through and add a contact.
	// it also checks to see if the id is in the system. 
	public boolean addContact(Contact contact, String uniqueID){
		   if(list.size() == 0){
		          
	           list.add(contact);
	           return true;
	             
	         }
		  for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId().equals(uniqueID)) {
				throw new IllegalArgumentException("Invalid id");
			
			}
			else {
				list.add(contact);
				return true;
				  }
     }
		  
		return false;  
	}
	// this removes the contact from the list.
	public boolean deleteContact (String uniqueID){
		  for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getId().equals(uniqueID)) {
				list.remove(i);
				return true;
			}
        }
		  return false;
      }
				
	
// these update certain areas of the the contact. 
	public boolean updateFirstName (String uniqueID, String firstName){
		  for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getId().equals(uniqueID)) {
              list.get(i).setFirstName(firstName);
              return true;
			}
        }
		  return false;
	}
	public boolean updateLastName (String uniqueID, String lastName){
		  for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getId().equals(uniqueID)) {
            list.get(i).setLastName(lastName);
            return true;
			}
      }
		  return false;
	}
	public boolean updateNumber (String uniqueID, String number){
		  for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getId().equals(uniqueID)) {
            list.get(i).setPhone(number);
            return true;
			}
      }
		  return false;
	}
	public boolean updateAddress (String uniqueID, String address){
		  for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getId().equals(uniqueID)) {
            list.get(i).setAddress(address);
            return true;
			}
      }
		  return false;
	}
	
	
}
		
	
	
	


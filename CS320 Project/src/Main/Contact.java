package Main;
public class Contact {
// This shows everything that is in the contact class. We also have 
	// information on what is not legal as well.
	private String id;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	public Contact(String id, String firstName, 
			String lastName, String phone, String address){
		if(id == null || id.length()>10) {
			throw new IllegalArgumentException("Invalid id");
		}
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		if(phone == null || phone.length()!=10) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		if(address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid last name");
		}
		this.id= id;
		this.firstName= firstName;
		this.lastName= lastName;
		this.phone= phone;
		this.address= address;
		
		
		}
	// these are the getters and setters for the contact class
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
		
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}

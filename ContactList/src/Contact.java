
public class Contact {
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	
	//getters n setters
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public static void displayContact(String firstName, String lastName, String email, String phone) {
		System.out.println("--------------------------------------------\r\n" + 
				"---- Current Contact -----------------------\r\n" + 
				"--------------------------------------------");
		System.out.println("First Name" + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Email: " + email);
		System.out.println("Phone" + phone);
		System.out.println("--------------------------------------------");
	}
}


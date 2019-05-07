
public class Person {
	public class Customer {

	}

	protected String firstName;
	protected String lastName;
	
	Person(){
		firstName = "";
		lastName = "";
	}
	
	Person(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName() {
		firstName = Console.getString("Enter First Name: ");
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName() {
		lastName = Console.getString("Enter Last Name: ");
	}

	@Override
	public String toString() {
		String nameFormat =  "Name: " + firstName + lastName;
		return nameFormat;
	}
	
	
	
	
}

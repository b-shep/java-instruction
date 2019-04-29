
public class Customer extends Person{
	
	private String number;
	
	Customer(){
		number = "";
	}
	
	Customer(String firstName, String lastName, String number){
		this.firstName = firstName;
		this.lastName = lastName;
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber() {
		number = Console.getString("Enter Number: ");
	}

	@Override
	public String toString() {
		return "Name: " + firstName + " " + lastName + "\n" + "Customer Number: " + number;
	}
	
	
	
	
	

}


public class Employee extends Person{
	private String ssn;
	
	
	Employee(){
		ssn = "";
	}
	
	Employee(String firstName, String lastName, String ssn){
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
		
	}

	public String getSsn() {
		char[] ssnChars = ssn.toCharArray();
		for (int i = 0; i < 7; i++) {
			if (ssnChars[i] != '-'){
				ssnChars[i] = 'x';
			}
		}
		return String.valueOf(ssnChars);
		
	}

	public void setSsn() {
		ssn = Console.getString("Enter ssn: ");
	}
	
	public String toString() {
		return "Name: " + firstName + " " + lastName + "\n" + "SSN: " + getSsn();
		
	}
	
	
}


public class Grade {
	private String letter;
	private int number;
	
	public Grade() {
		letter = "";
		number = 0; 
		
	}
	
	public Grade(int number) {
		this.number = number;
	}
	
	
//	get/sets for letter and number

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getLetter(int number) {
		if (number <= 100 && number > 87) {
			letter = "A";
		} else if (number < 88 && number > 79) {
			letter = "B";
		} else if (number < 80 && number > 66) {
			letter = "C";
		} else if (number < 67 && number > 59) {
			letter = "D";
		} else {
			letter = "F";
		}
		return letter;
	}
	
	
}

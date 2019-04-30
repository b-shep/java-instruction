
public class GradeCurve {
	private int numberOfPersons;
	public int getNumberOfPersons() {
		return numberOfPersons;
	}
	public void setNumberOfPersons(int numberOfPersons) {
		this.numberOfPersons = numberOfPersons;
	}
	
	public void addPerson(GradeCurve gradecurve) {
		gradecurve.numberOfPersons++;
	}
}

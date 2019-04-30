
public class sandboxApp {

	public static void main(String[] args) {
		GradeCurve curve = new GradeCurve();
		curve.setNumberOfPersons(5);
		curve.addPerson(curve);
		System.out.println(curve.getNumberOfPersons());
	}

}

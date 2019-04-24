import java.text.NumberFormat;
import java.util.Scanner;


public class TemperatureConverter {

	public static void main(String[] args) {
		System.out.println("Welcome to Farenheit Converter");
		Scanner sc = new Scanner(System.in);
		String cont = "y";
		while (cont.equalsIgnoreCase("y")) {
			double tempF;
			System.out.print("Enter Temperature in Farenheit: ");
			tempF = sc.nextDouble();
			double tempC = (tempF - 32) * 5/9;
			double tempConvert = tempC * 100;
			int tempFinal = (int) tempConvert / 100;
			System.out.println("Degrees in Celsius: " + tempFinal);
			
			System.out.print("Continue? (y/n)");
			cont = sc.next();
			
		}
	}
}

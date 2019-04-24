import java.util.Scanner;



public class TravelTime {

	public static void main(String[] args) {
		System.out.println("Welcome to Travel Time Converter");
		Scanner sc = new Scanner(System.in);
		String cont = "y";
		while (cont.equalsIgnoreCase("y")) {
			System.out.print("Enter Miles: ");
			double miles = sc.nextDouble();
			System.out.print("Enter Miles per Hour: ");
			double mph = sc.nextDouble();
			
			double hours = miles / mph;
			int hoursInt = (int) hours;
			double rem = miles % mph;
			double minutes = (60 * rem) / mph;
			int minutesInt = (int) minutes;
			System.out.println("Travel time is " + hoursInt + " hours and " + minutesInt + " minutes.");

			System.out.println();
			System.out.print("Continue? (y/n)");
			cont = sc.next();
		}
	}

}

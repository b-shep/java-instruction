import java.math.BigDecimal;
import java.util.Scanner;

public class ContactListApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Contact List Application");
		Scanner sc = new Scanner(System.in);
		
	
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			
			String firstName = Console.getString("Enter first name: ");
			String lastName = Console.getString("Enter last name: ");
			String email = Console.getString("Enter email: ");
			String phone = Console.getString("Enter phone: ");
			
			Contact.displayContact(firstName, lastName, email, phone);
			System.out.print("Continue(y/n)?");
			choice = sc.next();
			
		}
	}
		
}

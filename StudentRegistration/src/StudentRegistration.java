import java.util.Scanner;

public class StudentRegistration {

	public static void main(String[] args) {
		System.out.println("Student Registration Form");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Name: ");
		String firstName = sc.next();
		System.out.print("Enter Last Name: ");
		String lastName = sc.next();
		System.out.print("Enter Year of Birth: ");
		int yob = sc.nextInt(); 
		
		System.out.println("Welcome " + firstName + " "+ lastName + "!");
		System.out.println("Your Registration is Complete");
		System.out.println("Your temporary password is " + firstName + "*" + yob);

	}

}
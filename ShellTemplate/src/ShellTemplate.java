import java.util.Scanner;

public class ShellTemplate {

	public static void main(String[] args) {
		System.out.println("Welcome to");
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
			
			
			System.out.print("Continue(y/n)?");
			choice = sc.next();
			
		}
	}
		

}

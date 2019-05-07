
public class NumberCheckerApp {
	public static void main(String[] args) {
		System.out.println("Welcome to Even/Odd Checker!");
		String choice = "y";
		MyConsole console = new MyConsole();
		
		while (choice.equals("y")) {
			int userNumber = console.getInt("Enter Integer: ");
			if (userNumber % 2 == 0) {
				System.out.println("Your Number " + userNumber + " is Even!");
			} else {
				System.out.println("Your Number " + userNumber + " is Odd!");
			}
			
			choice = console.getString("Continue? (y/n)", "");
		}
		
		System.out.println("bye!");
	}
}

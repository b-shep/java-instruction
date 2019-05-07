import java.util.Scanner;

public class PersonManagerApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			String personType = Console.getString("Create Customer or Employee?", "c", "e");
			if (personType.equalsIgnoreCase("c")) {
				Customer c = new Customer();
				c.setFirstName();
				c.setLastName();
				c.setNumber();
				System.out.println(c.toString());
			} else if (personType.equalsIgnoreCase("e")) {
				Employee e = new Employee();
				e.setFirstName();
				e.setLastName();
				e.setSsn();
				System.out.println(e.toString());
			}
			choice = Console.getString("Continue? (y/n) ", "y", "n");
			
			
			
		}
		
		
		
	}

}

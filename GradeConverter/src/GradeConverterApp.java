import java.util.Scanner;

public class GradeConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Grade Converter!");
		Scanner sc = new Scanner(System.in);
		String cont = "y";
		
		while (cont.equalsIgnoreCase("y")) {
		
			int userGrade = Console.getInt("Enter Numeric Grade: ", 0, 100);
			
			Grade letterGrade = new Grade(userGrade);
			
			System.out.println("Letter Grade: " + letterGrade.getLetter(userGrade));
			
			cont=Console.getString("Continue? (y/n)", "y", "n");
		}
		
	}

}

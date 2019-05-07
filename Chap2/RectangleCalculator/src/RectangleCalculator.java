import java.util.Scanner;

public class RectangleCalculator {

	public static void main(String[] args) {
		String cont = "y";
		Scanner sc = new Scanner(System.in);
		System.out.println("Area and Perimeter of Rectangle");
		
		while (cont.equalsIgnoreCase("y")) {
			System.out.print("Enter Width: ");
			double length = sc.nextDouble();
			System.out.print("Enter Length: ");
			double width = sc.nextDouble();
			
			double area = length * width;
			double perimeter = 2* length + 2* width;
			
			System.out.println("Length: " + length);
			System.out.println("Width: " + width);
			System.out.println("Area: " + area);
			System.out.println("Perimeter: " + perimeter);
			
			System.out.println("Continue? (y/n)");
			cont = sc.next();
			System.out.println();
			}
		System.out.println("bye");
		}
}

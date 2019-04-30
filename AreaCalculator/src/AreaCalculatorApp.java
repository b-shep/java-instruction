import java.util.Scanner;

public class AreaCalculatorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			String shape = Console.getString("Choose c (circle), s (square), or r (rectangle): ", "c", "s", "r");
			if (shape.equalsIgnoreCase("c")) {
				Circle c = new Circle();
				c.setRadius("Enter Radius: ");
				System.out.println("The area of a circle with a radious of " + c.getRadius() +" is " + c.getArea());
				
			} else if(shape.equalsIgnoreCase("s")) {
				Square sq = new Square();
				sq.setSide("Enter Side Length: ");
				System.out.println("The area of a square with a side length of " + sq.getSide() + " is " + sq.getArea());
				
			} else if(shape.equalsIgnoreCase("r")) {
				Rectangle r = new Rectangle();
				r.setLength("Enter Length: ");
				r.setWidth("Enter Width: ");
				System.out.println("The are of a rectangle with the length of " + r.getLength() + " and width of " + r.getWidth() + " is " + r.getArea());
			}
			
			choice = Console.getString("Continue? (y/n) ", "y", "n", "quit");
			
		}
		System.out.println("Bye!");
	}

}

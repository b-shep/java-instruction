import java.math.BigDecimal;
import java.util.Scanner;

public class ShellTemplate {

	public static void main(String[] args) {
		System.out.println("Welcome to");
		Scanner sc = new Scanner(System.in);
		
	
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			double subtotal = 23.65;
			BigDecimal decimalSubtotal = new BigDecimal(Double.toString(subtotal)); 
			System.out.println(decimalSubtotal);
			
			
			System.out.print("Continue(y/n)?");
			choice = sc.next();
			
		}
	}
		

}

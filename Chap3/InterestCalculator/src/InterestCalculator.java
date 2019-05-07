import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;


public class InterestCalculator {

	public static void main(String[] args) {
	System.out.println("Wlecome to the Interest Calculator");
	Scanner sc = new Scanner(System.in);
	
	String cont = "y";
	while (cont.equalsIgnoreCase("y")) {
		System.out.print("Enter Loan Amount: ");
		BigDecimal loan = sc.nextBigDecimal();
		System.out.print("Enter Interest Rate: ");
		BigDecimal interestRate = sc.nextBigDecimal();
		

		
		BigDecimal interestAmount = loan.multiply(interestRate)
				.setScale(2, RoundingMode.HALF_UP);
		
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		NumberFormat pf = NumberFormat.getPercentInstance( );
		
		System.out.println("Loan: " + cf.format(loan));
		System.out.println("Interest Rate: " + pf.format(interestRate));
		System.out.println("Interest: " + cf.format(interestAmount));
		
		System.out.print("Continue? (y/n)");
		cont = sc.next();
		}
	System.out.println("Bye!");
	}
}

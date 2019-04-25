import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class TipCalculator {
	public static void main(String[] args) {
		System.out.println("Welcome to Tip Calculator");
		Scanner sc = new Scanner(System.in);
		
		//add header
		String table = "";
		String headerRow = "Tip%		Amount		Total";
		table += headerRow + "\n";
		
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Cost of meal: ");
			BigDecimal cost = sc.nextBigDecimal();
			String amount = "Amount		";
			for (int i = 15; i <=25; i+=5) {
				table += i + "%		";
				BigDecimal iConvert = new BigDecimal(i);
				BigDecimal hundred = new BigDecimal("100");
				BigDecimal pct = iConvert.divide(hundred);
				BigDecimal tipAmount = pct.multiply(cost);
				NumberFormat cf = NumberFormat.getCurrencyInstance();
				cf.setRoundingMode(RoundingMode.HALF_UP);
				table += cf.format(tipAmount) + "		";
				BigDecimal total = cost.add(tipAmount);
				table += cf.format(total) + "\n";
			}
			System.out.println(table);
			System.out.print("Continue(y/n)?");
			choice = sc.next();
		}
	}
}

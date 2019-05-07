package UI;

import java.text.NumberFormat;

public class BattingStatisticsApp {

	public static void main(String[] args) {
	Console console = new Console();
	System.out.println("Welcome to Batting Statistics!");
		
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")) {
			System.out.println("\n0 = out, 1 = single, 2 = double, 3 = triple, 4 = home");
			double counter = 0;
			double sum = 0;
			double nonZero = 0;
			
			int[] atBat = new int[console.getInt("\nEnter Number of Times at Bat: ", 0, 30)];
			
			for (int i = 0; i < atBat.length; i++) {
				atBat[i] = console.getInt("Result for at bat " + (i + 1) + ": ", 0, 4);
				counter++;
				sum += atBat[i];
				if(atBat[i] != 0) {
					nonZero++;
				}
			}
			
			double average = nonZero / counter;
			double slug = sum / counter;
			NumberFormat number = NumberFormat.getNumberInstance();
			number.setMaximumFractionDigits(3);
			number.setMinimumFractionDigits(3);
			
			System.out.println("\nBatting Percentage: " + number.format(average));
			System.out.println("Slugging Percent: " + number.format(slug));
			
			choice = console.getString("Continue (y/n)?", "y", "n");
		}
		


	}
	

}

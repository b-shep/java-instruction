import java.util.Scanner;

public class TableOfPowers {

	public static void main(String[] args) {
		System.out.println("Welcome to the Table of Powers");
		Scanner sc = new Scanner(System.in);
		
		//calc values and append to table
		
		String cont = "y";
		while (cont.equalsIgnoreCase("y")) {

			//get user input
			System.out.print("Enter Number: ");
			int userNumber = sc.nextInt();
			
			//build table
			String table = "";
			String headerRow = "Number		Squared		Cubed";
			String headerRow2 = "======		=======		======";
			table += headerRow + "\n";
			table += headerRow2 + "\n" +"\n";
			
			//create rows and append to table
			for (int row = 1; row <= userNumber; row++) {
				String rowDisp = row + "		";
				
				//calc values for squared and cubed columns
				int squared = row * row;
				int cubed = row * row * row;
				rowDisp += squared + "		" + cubed;
					
				table += rowDisp + "\n";
			}
			System.out.println(table);
			System.out.print("Continue(y/n)?");
			cont = sc.next(); 
		}
	}

}




//			//build table
//			String table = "";
//			String headerRow = "Number		Squared		Cubed";
//			String headerRow2 = "======		=======		======";
//			table += headerRow + "\n";
//			table += headerRow2 + "\n" +"\n";
//			
//			//create rows and append to table
//			for (int row = 1; row <= userNumber; row++) {
//				String rowDisp = row + "		";
//				
//				//calc values for squared and cubed columns
//				int squared = row * row;
//				int cubed = row * row * row;
//				rowDisp += squared + "		" + cubed;
//					
//				table += rowDisp + "\n";

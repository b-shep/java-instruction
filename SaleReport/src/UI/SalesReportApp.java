package UI;

public class SalesReportApp {

	public static void main(String[] args) {
		
		int counter = 0;
		double [][] sales = {
				{1540.0, 2010.0, 2450.0, 1845.0}, 
				{1130.0, 1168.0, 1847.0, 1491.0},
				{1580.0, 2305.0, 2710.0, 1284.0}, 
				{1105.0, 4102.0, 2391.0, 1576.0}};
		System.out.println("");
		System.out.println("_________________________________________________________________________");
		System.out.println("|Region	Q1		Q2		Q3		Q4		|");
		for (int i = 0; i < sales.length; i++) {
			counter++;
			System.out.print("|" +counter + "	");
			for(int j = 0; j < sales[i].length; j++) {
				System.out.print(sales[i][j] + "		");
			}
			System.out.print("|");
			System.out.println();
		}
		System.out.println("|_______________________________________________________________________|");

		for(int i = 0; i < sales.length; i++) {
			double sum = 0;
			for (int j = 0; j < sales[i].length; j++) {
				sum += sales[i][j];
			}
			System.out.println(sum);
		}
		System.out.println();
		System.out.println();
		
		double sumQ1 = 0;
		double sumQ2 = 0;
		double sumQ3 = 0;
		double sumQ4 = 0;
		
		for(int i = 0; i < sales.length; i++) {
			for (int j = 0; j < sales[i].length; j += 4) {
				sumQ1 += sales[i][j];
				sumQ2 += sales[i][j+1];
				sumQ3 += sales[i][j+2];
				sumQ4 += sales[i][j+3];
				}
			}
		System.out.println(sumQ1 + "\n" + sumQ2 + "\n" + sumQ3 + "\n" + sumQ4);
		
		
	}

}

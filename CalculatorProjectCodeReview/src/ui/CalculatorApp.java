

//NEXT STEPS: 
//Integrate modulus operator
//Get user input as one long string
//	remove spaces
//	utilize exception handling or split() to distinguish numbers from operators


package ui;

import java.math.BigDecimal;
import java.util.ArrayList;

import logic.Calculator;
import util.Console;

public class CalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Calculator!");
		
		
		
		ArrayList<String> numberList = new ArrayList<>();
		Calculator calculator = new Calculator(numberList);
		
		String thisCalculation = "y";
		while(thisCalculation.equals("y")) {

			Double firstNumber = Console.getDouble("Enter 1st number: ");
			String firstNumberString = Double.toString(firstNumber);
			numberList.add(firstNumberString);
			System.out.println("Available Operators: '+', '-', '*', '/'");
 
			 
			String choice = "y";
			do {
				
				String stringOperator = Console.getString("Enter Operator: ", "+", "-", "*", "/");
				numberList.add(stringOperator);
				
				Double nextNumber = Console.getDouble("Enter next number: ");
				String nextNumberString = Double.toString(nextNumber);
				numberList.add(nextNumberString);
		
				System.out.println("Your expression is: " + String.join(" ", numberList));
				choice = Console.getString("Add more operations to expression? (y/n)", "y", "n"); 
				
			}
			while (choice.equals("y"));
			
			System.out.println(numberList);
			System.out.println("The expression" + String.join(" ",  numberList ) + "equals" + calculator.calculate(numberList));
			
			calculator.reset();
			Console.getString("Calculate another expression?");
		}
		
		
		
		
			
	}
}

//Calculator Project:
//Allows user to enter expression to be calculated
//Expression can be of any length
//Calculation will adhere to correct order of operations.

package ui;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import logic.Calculator;
import util.Console;

public class CalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Calculator!\n");
		
		
		ArrayList<String> numberList = new ArrayList<>();
		Calculator calculator = new Calculator(numberList);
		System.out.println("Available Operators:\n'+': addition\n'-': subtraction\n'*': multiplication\n'/': division\n'%': remainder\n");
		
		String thisCalculation = "y";
		while(thisCalculation.equals("y")) {

			
			Double firstNumber = Console.getDouble("Enter 1st number: ");
			String firstNumberString = Double.toString(firstNumber);
			numberList.add(firstNumberString);
 
			 
			String anotherOperator = "y";
			do {
				
				String stringOperator = Console.getString("Enter Operator: ", "+", "-", "*", "/", "%");
				numberList.add(stringOperator);
				
				Double nextNumber = Console.getDouble("Enter next number: ");
				String nextNumberString = Double.toString(nextNumber);
				numberList.add(nextNumberString);
		
				System.out.println("Your expression is: " + String.join(" ", numberList));
				anotherOperator = Console.getString("Add more operations to expression? (y/n)", "y", "n"); 
				
			}
			while (anotherOperator.equals("y"));
			System.out.println();
			
			guiAnimation(3);
			System.out.println("Answer Calculated!\n");
			System.out.println("Expression: \t" + String.join(" ",  numberList));
			System.out.println("Answer: \t" + calculator.calculate(numberList) + "\n");
			
			calculator.reset();
			Console.getString("Calculate another expression? (y/n)");
		}			
	}
	//provide animation when calculating
	public static void guiAnimation(int number){
		System.out.print("Calculating");
		for (int i = 0; i < number; i++) {
			for (int j =0; j < 2; j++) {
				System.out.print(".");
				try {
					TimeUnit.MILLISECONDS.sleep(350);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(".");
			try {
				TimeUnit.MILLISECONDS.sleep(800);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}

//NEXT STEPS: 
//Get user input as one long string to avoid having to hit enter so much
//	remove spaces
//	utilize exception handling or split() to distinguish numbers from operators

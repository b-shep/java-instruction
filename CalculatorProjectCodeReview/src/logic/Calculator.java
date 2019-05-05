package logic;
import java.math.BigDecimal;
import java.util.ArrayList;

public class Calculator {
	
	private ArrayList<String> numberList;
	
	public Calculator(ArrayList<String> numberList) {
		super();
		this.numberList = numberList;
	}
	
	
	//calculate multiplication and division before addition and subtraction;
	public static String calculate(ArrayList<String>numberList){
		ArrayList<String> shortList = new ArrayList<>(); //array of */ expressions to be calculated before +-
		ArrayList<String> finalList = new ArrayList<>(); //array of +- expressions including collapsed */ expressions
		String finalNumber = "to be determined";
		for (int i = 1; i < numberList.size(); i += 2) {
//check
			System.out.println("i in calculatio forloop is " + i);
			if (checkOperator(numberList.get(i)).equals("+or-")) {
				if (shortList.size() > 0) {
//check					
					System.out.println("shortList at +- add calculation > 0 = " + shortList + " for " + i );
					finalList.add(performCalculation(shortList, finalNumber));
					shortList.clear();
				}
				System.out.println("+- called at" + i);

				finalList.add(numberList.get(i));
				//add next number to final list only if it is not part of a */ expression
				if (i > numberList.size() - 2 || checkOperator(numberList.get(i+2)).equals("+or-")) {
					finalList.add(numberList.get(i-1));
					finalList.add(numberList.get(i+1));
				}
				System.out.println("finalList after +- is " + finalList);
			} else if (checkOperator(numberList.get(i)).equals("*or/")){
				shortList.clear();
//check				
				System.out.println("*or/ called");

				shortList.add(numberList.get(i-1));
				shortList.add(numberList.get(i));
				shortList.add(numberList.get(i+1));
//check
				System.out.println("shortList of */ is " + shortList);
			}
			
		}
		if (shortList.size() > 1) {
			finalList.add(performCalculation(shortList, finalNumber));
		}
//check
		System.out.println("shortList before finalList calculated ");
		System.out.println("final list before consolidated calculation: " + finalList);
		
		String consolidated = performCalculation(finalList, finalNumber);
		return consolidated;
	}
	
	
	//take an array with either all +- or */ calculations and recursively collapse it into one number
	public static String performCalculation(ArrayList<String>shortList, String finalNumber) {

		if(shortList.size() > 1) {
			System.out.println("recursion called: shortList is  " + shortList);
			for (int i = 1; i < 3; i += 2) {
				System.out.println("shortlist called in forloop performCalc" + shortList);
				if (shortList.get(i).equals(("+"))) {
					System.out.println("addition selected");
					//ArrayList<String> newList = new ArrayList<>();  
					//newList = collapse(shortList, "add");
					BigDecimal number = new BigDecimal(shortList.get(i-1));
					BigDecimal nextNumber = new BigDecimal(shortList.get(i+1));
					BigDecimal newNumber = number.add(nextNumber);
					String newNumberString = newNumber.toString();
					shortList.set(2, newNumberString);
					shortList.remove(0);
					shortList.remove(0);
					finalNumber = shortList.get(0);
					performCalculation(shortList, finalNumber);
					
				} else if(shortList.get(i).equals(("-"))){
					System.out.println("subtraction selected");
					
					BigDecimal number = new BigDecimal(shortList.get(i-1));
					BigDecimal nextNumber = new BigDecimal(shortList.get(i+1));
					BigDecimal newNumber = number.subtract(nextNumber);
					String newNumberString = newNumber.toString();
					shortList.set(2, newNumberString);
					shortList.remove(0);
					shortList.remove(0);
					System.out.println("abridged shortlist is " + shortList);
					finalNumber = shortList.get(0);
					performCalculation(shortList, finalNumber);
				} else if(shortList.get(i).equals(("*"))) {
					System.out.println("multiplication selected");

					BigDecimal number = new BigDecimal(shortList.get(i-1));
					BigDecimal nextNumber = new BigDecimal(shortList.get(i+1));
					BigDecimal newNumber = number.multiply(nextNumber);
					String newNumberString = newNumber.toString();
//check					
					shortList.set(2, newNumberString);
//check				
					shortList.remove(0);
					shortList.remove(0);
//check
					System.out.println("abridged shortlist is " + shortList);
					finalNumber = shortList.get(0);
					performCalculation(shortList, finalNumber);
					
				} else {
					System.out.println("division selected");


					BigDecimal number = new BigDecimal(shortList.get(i-1));
					BigDecimal nextNumber = new BigDecimal(shortList.get(i+1));
					BigDecimal newNumber = number.divide(nextNumber);
					String newNumberString = newNumber.toString();
					shortList.set(2, newNumberString);
					shortList.remove(0);
					shortList.remove(0);
					System.out.println("abridged shortlist is " + shortList);
					finalNumber = shortList.get(0);
					performCalculation(shortList, finalNumber);
				}
			}
		} 
		System.out.println("final number returned for performCalc is " + finalNumber);
		return finalNumber;
	}
		

	//determine +- or */
	public static String checkOperator(String operator) {
		if (operator.equals("+") || operator.contentEquals("-")) {
			return "+or-";
		} else {
			return "*or/";
		}
	}
	
	public void reset() {
		numberList.clear();
	}







}



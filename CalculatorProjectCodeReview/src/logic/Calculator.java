package logic;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Calculator {
	
	private ArrayList<String> numberList;
	
	public Calculator(ArrayList<String> numberList) {
		super();
		this.numberList = numberList;
	}
	
	
	//calculate multiplication and division before addition and subtraction;
	public String calculate(ArrayList<String>numberList){
		ArrayList<String> shortList = new ArrayList<>(); //array of */ expressions to be evaluated at each +- iteration to be added to finalList
		ArrayList<String> finalList = new ArrayList<>(); //array of +- expressions including evaluated */ expressions
		String finalNumber = ""; //placeholder for results of performCalculation()
		
		//iterate over each operator to build arrays based on order of operations
		for (int i = 1; i < numberList.size(); i += 2) {
			if (checkOperator(numberList.get(i)).equals("+or-")) {
				if (shortList.size() > 0) {
					//will only occur if operator before i is *or/
					shortList.add(numberList.get(i-1));
					//i-1 must be calculated to be included in +- expression
					numberList.set(i-1, performCalculation(shortList, finalNumber));
					shortList.clear();
				}
				finalList.add(numberList.get(i-1));
				finalList.add(numberList.get(i));
				
			} else if (checkOperator(numberList.get(i)).equals("*or/")) {
				shortList.add(numberList.get(i-1));
				shortList.add(numberList.get(i));
			}
			
			//determine what to with last number in numberList
			if (i > numberList.size() - 3) {
				if (checkOperator(numberList.get(i)).equals("+or-")) {
					finalList.add(numberList.get(i+1));
				} else if (checkOperator(numberList.get(i)).equals("*or/")) {
					shortList.add(numberList.get(i+1));
				}
			}
		}
		
		//evaluate shortList if final operator in numList was *or/
		if (shortList.size() > 0) {
			finalList.add(performCalculation(shortList, finalNumber));
		}
		return performCalculation(finalList, finalNumber);
	}
		
	
	//take an array with either all +- or */ calculations and recursively evaluate it until one number remains
	public static String performCalculation(ArrayList<String>list, String finalNumber) {
		if(list.size() > 1) {
			//create array for first expression in list
			ArrayList<String> triptych = new ArrayList<>();
			for (int i = 0; i < 3; i++) {
				triptych.add(list.get(i));
			}
			//replace first 3 places of list with their calculated value
			list.set(2, evaluateTriptych(triptych));
			list.remove(0);
			list.remove(0);
			performCalculation(list, finalNumber);		
		}
		
		finalNumber = list.get(0);
		return finalNumber;
	}
	
	
	//evaluate expression consisting of number operator number
	public static String evaluateTriptych(ArrayList<String> triptych) {
		BigDecimal number = new BigDecimal(triptych.get(0));
		BigDecimal nextNumber = new BigDecimal(triptych.get(2));
		BigDecimal newNumber = new BigDecimal("1"); 
		
		if (triptych.get(1).equals("+")) {
			newNumber = number.add(nextNumber);
		} else if (triptych.get(1).equals("-")) {
			newNumber = number.subtract(nextNumber);
		} else if (triptych.get(1).equals("*")) {
			newNumber = number.multiply(nextNumber);
		} else if (triptych.get(1).equals("/")) {
			newNumber = number.divide(nextNumber, 3, RoundingMode.HALF_UP);
		} else if (triptych.get(1).contentEquals("%")) {
			newNumber = number.remainder(nextNumber);
		}

		String newNumberString = newNumber.toString();
		return newNumberString;
		
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



package app;

import animals.Alligator;
import animals.Sheep;
import interfaces.Countable;

public class AnimalCounterApp {	
	public static void main(String[] args) {
		Alligator alligator = new Alligator();
		count(alligator, 2);
		try {
			Sheep sheep = new Sheep();
			Sheep sheep2 = (Sheep) sheep.clone();
			
		}
		catch (CloneNotSupportedException ex){
			System.out.println(ex);
		}
		
		
		
	}
	
	public static void count(Countable c, int maxCount) {
		String name = c.toString();
		System.out.println("Counting " + name + "s...");
		for (int i = 0; i < maxCount; i++) {
			c.incrementCount();
			System.out.println(c.getCountString());
		}
		c.resetCount();
	}


}

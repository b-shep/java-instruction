package ui;

import java.util.ArrayList;
import java.util.List;

import logic.Animal;
import logic.Cat;
import logic.Dog;
import logic.Turtle;
import util.Console;

public class AnimalListApp {

	public static void main(String[] args) {
			
		System.out.println("Welcom to Animal List App: Define an animal and watch them speak!");
		
		String choice = "y";
		List<Animal> animals = new ArrayList<>();
		
		while(choice.equals("y")) {
			displayMenu();
			int selectAnimal = Console.getInt("Choose animal type: ", 1, 3);
			String name = Console.getString("Enter name: ");
			if (selectAnimal == 1) {
				Animal dog = new Dog(name);
				System.out.println("dog name is " + dog.getName());
				animals.add(dog);
			} else if(selectAnimal == 2) {
				Animal cat = new Cat(name);
				animals.add(cat);
			} else {
				Animal turtle = new Turtle(name);
				animals.add(turtle);
			}
			
			
			
			
			choice = Console.getString("Add another animal? (y/n)", "y", "n");
		}
		for (Animal a: animals) {
			a.speak();
		}
			
	}
	
	public static void displayMenu() {
		
		System.out.println(
				"Types of animal: \n1 - Dog\n2 - Cat\n3 - Turtle" );
	}

}

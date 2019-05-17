package logic;

import java.util.List;

public class Turtle extends Animal{
	List<Animal> animals;

	public Turtle(String name) {
		super(name);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speak() {
		speak(t -> System.out.println(t.getNameAndType() + " waves! (turtles don't have vocal cords)"));
	}

	@Override
	public String toString() {
		return "Turtle";
	}

	
}

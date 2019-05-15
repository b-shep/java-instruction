package logic;

public class Turtle extends Animal{

	public Turtle(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speak() {
		speak(t -> System.out.println(t.getNameAndType() + " waves! (turtles don't have vocal cords"));
	}

}

package logic;

public class Cat extends Animal{

	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speak() {
		speak(d  -> System.out.println(d.getNameAndType() + " says 'Meow'!"));
		
	}

}

package logic;

public class Dog extends Animal{
	String name;
	
	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speak() {
		speak(d  -> System.out.println(d.getNameAndType() + " says 'Woof'!"));
		
	}
	
	
	

}

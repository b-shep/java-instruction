package logic;

import java.util.function.Consumer;

public abstract class Animal {
	
	private String name;
	
	
	public Animal (String name) {
		this.name = name;		 
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getNameAndType() {
		return name + " the " + this.getClass();
	}
	
	public abstract void speak();
	
	protected void speak (Consumer<Animal> consumer) {
		
	}
	
	
}

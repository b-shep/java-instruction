package animals;

import interfaces.Countable;

public abstract class Animal implements Countable{
	protected int count;
	
	public String toString() {
		String s = this.getClass().getSimpleName();
		return s;
	};

}

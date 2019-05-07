package animals;

public class Alligator extends Animal {
	
	@Override
	public void incrementCount() {
		count++;
		
	}

	@Override
	public void resetCount() {
		count = 0;
		
	}

	@Override
	public int getCount() {
		return count;
	}

	@Override
	public String getCountString() {
		return count + " alligator";
	}

}

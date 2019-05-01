package animals;

public class Sheep extends Animal implements Cloneable{
	private String name;
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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
		return count + " " + name;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}

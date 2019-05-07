
public class Square extends Shape {
	private double side;
	
	Square(){
		side = 0;
	}
	
	Square(double side){
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(String prompt) {
		side = Console.getDouble(prompt);
	}

	@Override
	public Double getArea() {
		return side * side;
	}
	
	
}


public class Rectangle extends Shape {
	private double length;
	private double width;
	
	public Rectangle(){
		length = 0;
		width = 0;
	}
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(String prompt) {
		length = Console.getDouble(prompt);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(String prompt) {
		width = Console.getDouble(prompt);
	}

	@Override
	public Double getArea() {
		return length * width;
	}
	
	
}

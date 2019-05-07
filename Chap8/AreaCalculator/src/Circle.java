
public class Circle extends Shape{
	private double radius;
	
	Circle(){
		radius = 0;
	}
	
	Circle(double radius){
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(String prompt) {
		radius = Console.getDouble(prompt);
	}

	@Override
	public Double getArea() {
		return radius * 2 * Math.PI;
	}
	
	
	
	
	
}

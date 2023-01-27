
public class Circle extends Shape 
	implements Comparable<Circle> {
	private double radius;
	
	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public double area() {
		
		return 0;
	}

	@Override
	public int compareTo(Circle o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}

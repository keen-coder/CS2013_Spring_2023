public class Foo {
	private String color;
	private int intValue;
	private double dblValue;
	
	public Foo(String color, int intValue, double dblValue) {
		this.color = color;
		this.intValue = intValue;
		this.dblValue = dblValue;
	}

	
	
	public String getColor() {
		return color;
	}



	public int getIntValue() {
		return intValue;
	}



	public double getDblValue() {
		return dblValue;
	}



	@Override
	public String toString() {
		return "Foo(color=" + color + ", x=" + intValue + ", y=" + dblValue + ")";
	}	
}
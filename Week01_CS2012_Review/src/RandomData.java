public class RandomData implements Comparable<RandomData> {
	private String color;
	private int randInt;
	private double randDouble;
	
	public RandomData(String color, int randInt, 
			double randDouble) {
		this.color = color;
		this.randInt = randInt;
		this.randDouble = randDouble;
	}
	
	@Override
	public String toString() {
		String result = "";
		
		result += "Color: " + this.color + "\n";
		result += "Int: " + this.randInt + "\n";
		result += "Double: " + this.randDouble;
		
		return result;
		
	}

	@Override
	public int compareTo(RandomData o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

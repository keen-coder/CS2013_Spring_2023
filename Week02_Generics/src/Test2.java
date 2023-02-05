
public class Test2 {

	public static void main(String[] args) {
		MyClass1<String> mc1 = 
				new MyClass1<>("java", "python", 56);
		
		MyClass1<Double> mc2 =
				new MyClass1<>(4.5, 6.7, 23);
		
		MyClass1<Person> mc3 =
				new MyClass1<>(new Person(), new Person(), 23);

		MyClass2<String, Integer> mc4 =
				new MyClass2<>("python", 4);
		
	}

}

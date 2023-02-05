import java.util.ArrayList;

public class Test<E extends Comparable<E>> {
	
	static E something;
	
	Math
	Test<Integer> test1 = new Test();
	Test<String> test2 = new Test();
	
	Comparable[] data =  (E[])(new Comparable[10]);
	
	
	public static void main(String[] args) {
		
		
		
		
		ArrayList<Circle> list1 = new ArrayList<>();
		ArrayList<Triangle> list2 = new ArrayList<>();
		
		printAreas(list1);
		printAreas(list2);
		
		m(new MyClass1<Integer>());
	}
	
	public static void m (MyClass1<? extends Number> mc) {
		
	}
	
	
	public static void method1(ArrayList<? extends Number> list1) {
		
	}
	
	
	
	
	
	

}

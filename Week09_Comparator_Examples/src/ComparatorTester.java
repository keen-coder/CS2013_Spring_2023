import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorTester {
	
	public static void main(String[]  args) {
		Foo f1 = new Foo("blue", 7, 42.96);
		Foo f2 = new Foo("red", 10, 8.74);
		Foo f3 = new Foo("green", 2, 2.346);
		Foo f4 = new Foo("orange", 39, 27.38);
		
//		System.out.println(max(f1, f2, new FooColorComparator()));
//		System.out.println(max(f1, f2, new FooIntComparator()));
//		System.out.println(max(f1, f2, new FooDblComparator()));
		
		ArrayList<Foo> stuff = new ArrayList<>();
		
		stuff.add(f1);
		stuff.add(f2);
		stuff.add(f3);
		stuff.add(f4);
		
		print(stuff);
		
		System.out.println();
		
		Collections.sort(stuff, new FooDblComparator());
		
		print(stuff);
		
		System.out.println();
		
	}
	
	public static Foo max(Foo f1, Foo f2, Comparator<Foo> c) {
		int result = c.compare(f1, f2);
		
		if (result == 0) {
			return f1;
		}
		else if(result < 0) {
			return f2;
		}
		else {
			return f1;
		}
		
	}
	
	public static void print(ArrayList<Foo> list) {
		for (Foo f : list) {
			System.out.println(f);
		}
	}
	
	
}

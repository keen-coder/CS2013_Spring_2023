import java.util.Comparator;

public class FooColorComparator implements Comparator<Foo> {

	
	public FooColorComparator() {}
	
	//	Foo o1;
	//	Foo o2;
	//	compare(o1, o2);
	// if result is 0, then o1.color == o2.color;
	// if result is < 0, then o1.color < o2.color;
	// if result > 0, then o1.color > o2.color;
	@Override
	public int compare(Foo o1, Foo o2) {
		return o1.getColor().compareTo(o2.getColor());
	}

}

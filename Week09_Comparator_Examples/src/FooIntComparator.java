import java.util.Comparator;

public class FooIntComparator implements Comparator<Foo> {

	public FooIntComparator() {
		
	}
	
	@Override
	public int compare(Foo o1, Foo o2) {
		if (o1.getIntValue() == o2.getIntValue()) {
			return 0;
		}
		else if (o1.getIntValue() < o2.getIntValue()) {
			return -1;
		}
		else {
			return 1;
		}
	}

}

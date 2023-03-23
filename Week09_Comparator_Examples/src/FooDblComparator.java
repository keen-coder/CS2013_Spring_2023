import java.util.Comparator;

public class FooDblComparator implements Comparator<Foo>{

	public FooDblComparator() {
		
	}
	
	@Override
	public int compare(Foo o1, Foo o2) {
		if (o1.getDblValue() == o2.getDblValue()) {
			return 0;
		}
		else if (o1.getDblValue() < o2.getDblValue()) {
			return -1;
		}
		else {
			return 1;
		}
	}

}

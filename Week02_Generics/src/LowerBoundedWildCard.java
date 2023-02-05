import java.util.ArrayList;

public class LowerBoundedWildCard {

	public static void main(String[] args) {
		ArrayList<Circle> list1 = new ArrayList<>();
		ArrayList<GeometricObject> list2 = new ArrayList<>();
		ArrayList<Object> list3 = new ArrayList<>();
		m(list1);
		m(list2);
		m(list3);
	}
	
	public static void m2(ArrayList<?> list) {
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.println(list.get(i));
		}
		
		Object o = list.get(0);
	}
	
	public static void m(ArrayList<? super Circle> list) {
		GeometricObject geo1 = new Circle();
		
		
		list.add(new Circle());
		list.add(geo1);
		
		
	}

}

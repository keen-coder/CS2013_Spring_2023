import java.util.ArrayList;

public class UpperBoundedWildCard {
	public static void main(String[] args) {
		//ArrayList<Circle> list1 = new ArrayList<>();
		ArrayList<Triangle> list2 = new ArrayList<>();
		
		//printAreas(list1);
		printAreas(list2);
		
//		ArrayList<Object> list3 = new ArrayList<>();
//		printAreas(list3);
	}
	
	public static void printAreas(ArrayList<? extends GeometricObject> list) {
		GeometricObject geo1 = list.get(0);
		
		list.add(new Circle());
		
		
		for (GeometricObject geo : list) {
			System.out.println(geo.getArea());
		}
	}
	
}


public class LinkedListTester {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.addFirst(40);
		list.addFirst(50);
		
		
//		list.addLast(10);
//		list.addLast(20);
//		list.addLast(30);
//		list.addLast(40);
//		list.addLast(50);
//		list.addLast(60);
//		list.addLast(70);
//		list.addLast(80);
//		list.addLast(90);
//		list.addLast(100);
		
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(list.size() - 1));
		try {
			System.out.println(list.get(100));
		}
		catch (IndexOutOfBoundsException ex) {
			System.out.println("ERROR OUT OF BOUNDS");
		}
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		
		
	}

}

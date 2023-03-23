
public class NodeTester {
	public static void main(String[] args) {
		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		Node<Integer> n4 = new Node<>(40);
		Node<Integer> n5 = new Node<>(50);
		Node<Integer> n6 = new Node<>(60);
		
		Node<Integer> head = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		
		System.out.println("n1 addr = " + n1 + "\t\tn1.next addr = " + n1.next);
		System.out.println("n2 addr = " + n2 + "\t\tn2.next addr = " + n2.next);
		System.out.println("n3 addr = " + n3 + "\t\tn3.next addr = " + n3.next);
		System.out.println("n4 addr = " + n4 + "\t\tn4.next addr = " + n4.next);
		System.out.println("n5 addr = " + n5 + "\t\tn5.next addr = " + n5.next);
		System.out.println("n6 addr = " + n6 + "\t\tn6.next addr = " + n6.next);

		System.out.println();
		
		
		Node<Integer> curr = head;
		
		while(curr != null) {
			System.out.println("curr addr = " + curr + "\tcurr.next addr = " + curr.next);
			curr = curr.next;
		}
		
		
		
		
		
		
		
	}
}

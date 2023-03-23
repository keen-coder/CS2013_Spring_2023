
public class Node<E> {
	protected E data;
	protected Node<E> next;
	
	public Node(E data) {
		this.data = data;
		this.next = null;
	}
	
	public String toString() {
		return this.data.toString();
	}
}
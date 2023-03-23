
public class LinkedList<E> {
	private Node<E> head;
	private Node<E> tail;
	
	private int size;
	
	public LinkedList() {
		this.head = this.tail = null;
		this.size = 0;
	}
	
	public E delete(int index) {
		if (this.isEmpty()) {
			throw new IllegalStateException("List already empty, nothing to delete.");
		}
		
		if (index < 0 || index >= this.size()) {
			throw new IndexOutOfBoundsException("index " + index + " out of bounds.");
		}
		
		if (index == 0) {
			return deleteFirst();
		}
		else if (index == this.size() - 1) {
			return deleteLast();
		}
		else {
			Node<E> current = this.head;
			
			int count = 0;
			
			while (count < index - 1) {
				current = current.next;
				count++;
			}
			E deletedValue = current.next.data;
			current.next = current.next.next;
			this.size--;
			
			return deletedValue;
		}
	}
	
	public E deleteLast() {
		if (this.isEmpty() || this.size() == 1) {
			return deleteFirst();
		}
	
		Node<E> current = this.head;
	
		// Multiple ways to get to the before last index.
		
		// Option 1: Count
		// 	 int count = 0;
		//	 while (count < this.size() - 2) {
		//		 current = current.next;
		//	 }
		
		// Option 2: Use two reference hopping variables.
		//	 Node<E> previous = this.head;
		//	 while (current.next != null) {
		//	     previous = current;
		//       current = current.next;	
		//   }
		
		// Option 3: Iterate until current.next == tail.
		while (current.next != tail) {
			current = current.next;
		}
		E deletedValue = this.tail.data;
		this.tail = current;
		this.tail.next = null;
		
		this.size--;
		
		return deletedValue;
	}
	
	public E deleteFirst() {
		if (this.isEmpty()) {
			throw new IllegalStateException("List already empty, nothing to delete.");
		}
		
		E deletedValue = this.head.data;
		
		if (this.size() == 1) {
			this.head = this.tail = null;
		}
		else {
			this.head = this.head.next;
		}
		
		this.size--;
		
		return deletedValue;
		
//		if (this.isEmpty()) {
//			throw new IllegalStateException("List already empty, nothing to delete.");
//		}
//		else if (this.size() == 1) {
//			E deletedValue = this.head.data;
//			this.head = this.tail = null;
//			this.size--;
//			return deletedValue;
//		}
//		else {
//			E deletedValue = this.head.data;
//			this.head = this.head.next;
//			this.size--;
//			return deletedValue;
//		}
	}
	
	public void addFirst(E data) {
		Node<E> temp = new Node<>(data);
		
		if (this.isEmpty()) {
			this.head = temp;
			this.tail = temp;
		}
		else {
			temp.next = this.head;
			this.head = temp;
		}
		
		this.size++;
	}
	
	public void addLast(E data) {
		Node<E> temp = new Node<>(data);
		
		if (this.isEmpty()) {
			this.head = temp;
			this.tail = temp;
		}
		else {
			this.tail.next = temp;
			this.tail = temp; //OR this.tail = this.tail.next
		}
		
		this.size++;
	}
	
	public void insert(int index, E data) {
		if (index < 0 || index > this.size()) {
			throw new IndexOutOfBoundsException("index " + index + " out of bounds.");
		}
		
		if (index == 0) {
			this.addFirst(data);
		}
		else if(index == (this.size())) {
			this.addLast(data);
		}
		else {
			int count = 0;
			
			Node<E> current = this.head;
			Node<E> temp = new Node<>(data);
			
			while (count < index - 1) {
				current = current.next;
				count++;
			}
			
			temp.next = current.next;
			current.next = temp;
			
			this.size++;
		}
	}

	public E get(int index) {
		
		if (index < 0 || index >= this.size()) {
			throw new IndexOutOfBoundsException("index " + index + " out of bounds.");
		}
		
		if (index == this.size() - 1) {
			return this.tail.data;
		}
		
		int count = 0;
		
		Node<E> current = this.head;
		
		while (count < index) {
			current = current.next;
			count++;
		}
		
		return current.data;
	}
	
	public int size() {
		return this.size;
	}
	
	public boolean isEmpty() {
		return (this.size == 0) && 
			   (this.head == null) && 
			   (this.tail == null);
	}
	
	public String toString() {
		if (this.isEmpty()) {
			return "[]";
		}
		
		String result = "[";
		Node<E> current = this.head;
		
		result += current;
		current = current.next;
		
		while(current != null) {
			result += ", " + current;
			current = current.next;
		}
		
		result += "]";
		return result;
	}
}

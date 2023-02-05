
public class GenericStackTest {

	public static void main(String[] args) {
		GenericStack<Double> stack = new GenericStack<>();
		
		stack.push(5.4);
		stack.push(3.8);
		stack.push(90.34);
		
		System.out.println(stack);
		
		double x = stack.pop();
		
		System.out.println(x);
		
		System.out.println(stack);
		

	}

}

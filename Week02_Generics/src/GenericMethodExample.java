
public class GenericMethodExample {

	public static void main(String[] args) {
		Integer[] data1 = {1, 2, 3, 4, 5};
		Double[] data2 = {3.4, 2.5, 6.7};
		String[] data3 = {"java", "python", "c++"};
		
		printData(data1);
		printData(data2);
		printData(data3);
		

	}
	
	public static <E> void printData(E[] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	

	

	
	
	
	
	
}

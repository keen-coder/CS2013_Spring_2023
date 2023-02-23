package lecture_examples;

public class PrintArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		printArrRec(arr, 0);
	}
	
	public static void printArrRec(int[] arr, int index) { 
//		if(arr.length != index) {
//			System.out.print(arr[index] + " ");
//			printArrRec(arr, index + 1);
//		}
		if(arr.length == index) {
			return;
		}
		else {
			System.out.print(arr[index] + " ");
			printArrRec(arr, index + 1);
		}
	}
	
	public static void printArrLoop(int[] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i] + " ");
		}
	}
	

}

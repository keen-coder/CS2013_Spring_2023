
public class Test3 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5}
	}
	
	public static void print(int[] arr, int index) {
		if (index == arr.length) {
			return;
		}
		else {
			System.out.println(arr[index]);
			print(arr, index+1);
		}
		//Haskell
	}
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(new File(""));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//try {
			int[] data = {1, 2, 3, 4, 5};
			System.out.println(data[100]);
//		}
//		catch(ArrayIndexOutOfBoundsException ex) {
//			System.out.println(ex.getMessage());
//		}
		
		System.out.println("Program continues...");
	}

}

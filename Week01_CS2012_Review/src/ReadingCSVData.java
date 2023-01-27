import java.io.File;
import java.util.ArrayList;

public class ReadingCSVData {

	public static void main(String[] args) {
		File data = new File("src/files/output.txt");
		
		ArrayList<RandomData> list = DataReader.readFile(data);

		for(RandomData rd : list) {
			System.out.println(rd);
			
			System.out.println();
		}
		
		ArrayList<Comparable> list2 = new ArrayList<>();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

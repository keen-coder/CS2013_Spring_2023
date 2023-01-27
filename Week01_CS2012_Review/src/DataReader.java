import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataReader {
	
	private DataReader() { }
	
	public static ArrayList<RandomData> readFile(File inFile) {
		ArrayList<RandomData> list = new ArrayList<>();
		try {
			Scanner reader = new Scanner(inFile);
				
			while(reader.hasNextLine()) {
				String currLine = reader.nextLine();
				String[] splitData = currLine.split(",");
				
				int splitDataInt = Integer.parseInt(splitData[1]);
				double splitDataDoub = Double.parseDouble(splitData[2]);
				RandomData rd = new RandomData(splitData[0], 
						splitDataInt, splitDataDoub);
				
				list.add(rd);
				
			}	
		}
		catch(FileNotFoundException ex) {
			System.out.println("File not found.");
		}
		
		
		return list;
	}
	
}

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class FileIOReview {

	public static void main(String[] args) {
		
		Random rand = new Random();
		//Reading file data
		// Use Scanner
		
		//Writing to files
		//PrintWriter
		
		String[] colors = {"blue", "red", "green", "orange"};
		
		File outFile = new File("src/files/output.txt");
		
		
		PrintWriter pw = null;
		
		try {
			pw = new PrintWriter(outFile);
		}
		catch(FileNotFoundException ex) {
			System.out.println("Output file not found.");
		}
		
		for (int i = 1 ; i <= 10 ; i++) {
			int randIndex = rand.nextInt(colors.length);
			String randomColor = colors[randIndex];
			int randInt = rand.nextInt(1000000);
			double randDouble = rand.nextDouble(20);
			
			pw.println(randomColor + "," + randInt + "," + randDouble);
		}
		
		pw.flush();
		pw.close();
		
		File inFile = new File("src/files/output.txt");
		
			
			
		

	}

}

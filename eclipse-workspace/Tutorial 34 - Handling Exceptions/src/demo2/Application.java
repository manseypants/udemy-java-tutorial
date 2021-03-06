package demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Application {

	public static void main(String[] args) {

		File file = new File("Test.txt");

		try {
			FileReader fr = new FileReader(file);
			//This will not be executed if an exception is thrown.
			System.out.println("Contiuing...");
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + file.toString());
		}

		System.out.println("Finished");
	}

}

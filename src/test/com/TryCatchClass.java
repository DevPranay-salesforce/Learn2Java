package test.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryCatchClass {

	public static void main(String[] args) {

		try {
			File file = new File("input.txt1");
		Scanner scanner = new Scanner(file);
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			System.out.println(line);
		}
		scanner.close();
	} catch (FileNotFoundException e) {
		System.out.println("File not found: " + e.getMessage());
		}
	}

}

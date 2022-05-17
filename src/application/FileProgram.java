package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileProgram {

	public static void main(String[] args) {

		File file = new File("/Users/moiss/Documents/Java/Files_Source_Studying/temp_files/in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}

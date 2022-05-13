package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProgramTryResources {

	public static void main(String[] args) {
		String path = "/Users/moiss/Documents/Java/Files_Source_Studying/temp_files/in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

}
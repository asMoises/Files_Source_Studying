package application;

import java.io.BufferedWriter;
import java.io.IOException;

public class FileWriter {
	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good Morning","Good Afternoon", "Good Night"};
		String path = "/Users/moiss/Documents/Java/Files_Source_Studying/temp_files/fileWrite.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new java.io.FileWriter(path))){
			for (String line:lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Done!!");
		}
	}
}
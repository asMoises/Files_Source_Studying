package application;

import java.io.File;
import java.util.Scanner;

public class PathInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		sc.close();

		File path = new File(strPath);
		System.out.println("getName:" + path.getName());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getPath: " + path.getPath());
	}
}

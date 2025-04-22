package day16;

import java.io.File;
import java.io.IOException;

public class createFileIfNotExists {
	public static void main(String[] args) {
		String path = "C:\\Users\\raikw\\IdeaProjects\\untitled\\src\\Streams\\New folder\\New folder1\\New Text Document.txt";
		File file = new File(path);

		if (!file.exists()) {
			try {
				if (file.createNewFile()) {
					System.out.println("File created");
				} else {
					System.out.println("could not create the file");

				}
			} catch (IOException e) {
				System.out.println("Error : " + e.getMessage());
			}
		}else {
			System.out.println("File already exists.");
		}
	}
}

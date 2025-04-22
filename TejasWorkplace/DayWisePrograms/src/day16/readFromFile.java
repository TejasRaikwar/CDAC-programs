package day16;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readFromFile {
	public static void main(String[] args){
		String path = "C:\\\\Users\\\\raikw\\\\IdeaProjects\\\\untitled\\\\src\\\\Streams\\\\New folder\\\\New folder1\\\\New Text Document.txt";

		try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
			String line;
			System.out.println("File contents : ");
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("Error reading file : " + e.getMessage());
		}
	}
}

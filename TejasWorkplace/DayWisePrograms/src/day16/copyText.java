package day16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class copyText {
	public static void main(String[] args) {
		String ipFile = "C:\\Users\\raikw\\Documents\\GitHub\\CDAC-programs\\TejasWorkplace\\DayWisePrograms\\src\\day16\\input.txt";
		String opFile = "C:\\Users\\raikw\\Documents\\GitHub\\CDAC-programs\\TejasWorkplace\\DayWisePrograms\\src\\day16\\output.txt";

		try (BufferedReader reader = new BufferedReader(new FileReader(ipFile));
				FileWriter fw = new FileWriter(opFile);
				BufferedWriter writer = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(writer);) {
			String line;
			
			while((line = reader.readLine()) != null) {
				pw.println(line);
			}
			System.out.println("Text copied.");
		}catch(IOException e) {
			System.out.println("Error "+e.getMessage());
		}

	}
}

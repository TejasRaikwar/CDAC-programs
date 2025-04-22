package day16;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class checkFileOrDirectory {
	public static void main(String[] args) {
		String path = "C:\\Users\\raikw\\IdeaProjects\\untitled\\src\\Streams\\New Folder";
        File file = new File(path);

        if(file.exists()){
			if (file.isDirectory()) {
				System.out.println("It is a directory. Contents : ");
				String[] contents = file.list();
				if (contents != null) {
					Arrays.stream(contents).forEach(c -> System.out.println(c));
				} else if (file.isFile()) {
					System.out.println("it is a file : " + file.getName());
				} else {
					System.out.println("File or directory does not Exitst");
				}
			}
		}
	}
}

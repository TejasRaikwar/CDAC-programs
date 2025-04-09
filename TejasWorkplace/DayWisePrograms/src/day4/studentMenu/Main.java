package day4.studentMenu;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter strength of Class : ");
		int size = sc.nextInt();
		
		Student[] sArr = new Student[size];
		
		int choice = 0;

		do {
			System.out.println("1. Add Student\n" + "2. print Student by roll No.\n"
					+ "3. print all students sorted by marks\n" + "0. exit");

			System.out.println("Enter choice : ");
			 choice = sc.nextInt();
			switch (choice) {
			case 1:
				if (Student.getCount() < sArr.length) {
					System.out.println("Enter name : ");
					String name = sc.next();
					System.out.println("Enter course");
					String course = sc.next();
					System.out.println("Enter marks");
					float marks = sc.nextFloat();
					sArr[Student.getCount()] = new Student(name, course, marks);
				} else {
					System.out.println("Array is full!");
				}
				break;
			case 2:
				Student[] tempStud = Arrays.stream(sArr).filter(s -> s != null).toArray(Student[]::new);
				Arrays.stream(tempStud).forEach(s -> System.out.println(s.toString()));
				break;
			case 3:
				Student[] tempStud1 = Arrays.stream(sArr).filter(s -> s != null).toArray(Student[]::new);
				Arrays.sort(tempStud1, (s1, s2) -> Float.compare(s1.getMarks(), s2.getMarks()));
				Arrays.stream(tempStud1).forEach(s -> System.out.println(s.toString()));
				break;
			case 0 : 
				System.exit(0);
			default:
				System.out.println("Please Enter valid choice !");
			}
		} while (choice != 0);

	}
}

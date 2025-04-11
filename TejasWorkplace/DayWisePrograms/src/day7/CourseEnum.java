package day7;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Comparator;

enum Course {
	DAC, DESD, DVLSI
}

class Student {
	private String name;
	private LocalDate dateOfBirth;
	private Course course;

	public Student(String name, LocalDate dateOfBirth, Course course) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.course = course;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	@Override
	public String toString() {
		return "Student{" + "name='" + name + '\'' + ", dateOfBirth=" + dateOfBirth + ", course=" + course + '}';
	}
}

class CourseEnum {
	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[0] = new Student("Tejas", LocalDate.of(2001, 02, 12), Course.DAC);
		students[1] = new Student("Harsh", LocalDate.of(2003, 01, 04), Course.DESD);
		students[2] = new Student("Alice", LocalDate.of(2008, 12, 20), Course.DVLSI);

		// sorting using Comparator
		Arrays.sort(students, Comparator.comparing(Student::getDateOfBirth));
		Arrays.stream(students).forEach(s -> System.out.println(s.toString()));

		// Sorting using ananymous comparator
		Arrays.sort(students, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				if (s1.getDateOfBirth().isBefore(s2.getDateOfBirth())) {
					return -1;
				} else if (s1.getDateOfBirth().isAfter(s2.getDateOfBirth())) {
					return 1;
				}
				return 0;
			}
		});

		System.out.println("\n\nStudents sorted by date of birth : ");
		for (Student s : students)
			System.out.println(s);

		System.out.println("\nNumber of students: " + students.length);
		System.out.println("First student: " + students[0]);
		System.out.println("Last student: " + students[students.length - 1]);
	}

}

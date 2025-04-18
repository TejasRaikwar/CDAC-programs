package com.cdac.school.tester;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import com.cdac.library.objects.Book;
import com.cdac.library.utils.DateUtils;
import com.cdac.school.objects.Student;
import com.cdac.school.uniquekey.StudentKey;


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SchoolAppTester {
    // Change HashMap to TreeMap
    private static Map<StudentKey, Student> studentMap = new TreeMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- School Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Find Student");
            System.out.println("3. Print All Students");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> addStudent(sc);
                case 2 -> findStudent(sc);
                case 3 -> printAllStudents();
                case 4 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }

    private static void addStudent(Scanner sc) {
        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Standard: ");
        String standard = sc.nextLine();
        System.out.print("Enter Division: ");
        String division = sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        StudentKey key = new StudentKey(standard, division, rollNo);
        Student student = new Student(rollNo, standard, division, name);
        studentMap.put(key, student);
        System.out.println("Student added successfully!");
    }

    private static void findStudent(Scanner sc) {
        System.out.print("Enter Standard: ");
        String standard = sc.next();
        System.out.print("Enter Division: ");
        String division = sc.next();
        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();

        StudentKey key = new StudentKey(standard, division, rollNo);
        Student student = studentMap.get(key);

        if (student != null) {
            System.out.println("Student Found: " + student);
        } else {
            System.out.println("Student not found.");
        }
    }

    private static void printAllStudents() {
        if (studentMap.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("All Students:");
            for (Map.Entry<StudentKey, Student> entry : studentMap.entrySet()) {
                System.out.println("Key: " + entry.getKey() + " -> " + entry.getValue());
            }
        }
    }
}

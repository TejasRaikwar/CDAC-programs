package day12.Fruit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Fruit> fruitList = new ArrayList<>();

		boolean running = true;

		while (running) {
			System.out.println("\n=== Fruit Menu ===");
			System.out.println("1. Add fruit");
			System.out.println("2. Sort fruits by color");
			System.out.println("3. Sort fruits by quantity");
			System.out.println("4. Sort fruits by price");
			System.out.println("5. Remove fruit by index");
			System.out.println("6. Display all fruits");
			System.out.println("0. Exit");
			System.out.print("Choose: ");
			int choice = sc.nextInt();
			sc.nextLine(); // consume newline

			switch (choice) {
			case 1:
				System.out.print("Enter name: ");
				String name = sc.nextLine();
				System.out.print("Enter color: ");
				String color = sc.nextLine();
				System.out.print("Enter price: ");
				double price = sc.nextDouble();
				System.out.print("Enter quantity: ");
				int quantity = sc.nextInt();
				fruitList.add(new Fruit(name, color, price, quantity));
				break;

			case 2:
				Collections.sort(fruitList); // natural order = color
				System.out.println("Sorted by color.");
				break;

			case 3:
				fruitList.sort(Comparator.comparingInt(Fruit::getQuantity));
				System.out.println("Sorted by quantity.");
				break;

			case 4:
				fruitList.sort(Comparator.comparingDouble(Fruit::getPrice));
				System.out.println("Sorted by price.");
				break;
			case 5:
				System.out.print("Enter index to remove: ");
				int index = sc.nextInt();
				if (index >= 0 && index < fruitList.size()) {
					fruitList.remove(index);
					System.out.println("Fruit removed.");
				} else {
					System.out.println("Invalid index.");
				}
				break;

			case 6:
				System.out.println("\n--- Fruit List ---");
				for (int i = 0; i < fruitList.size(); i++) {
					System.out.println(i + ": " + fruitList.get(i));
				}
				break;

			case 0:
				running = false;
				System.out.println("Exiting program.");
				break;

			default:
				System.out.println("Invalid choice. Try again.");

			}

		}
		sc.close();

	}
}

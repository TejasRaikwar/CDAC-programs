package day13.Accounts;

import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class App {
	static Scanner sc = new Scanner(System.in);
	static CopyOnWriteArrayList<Account> accountList = new CopyOnWriteArrayList<>();

	public static void main(String[] args) {
		int choice;
		do {
			System.out.println(
					"\nMenus\n1. Accept A/C details from user\n2. Display all Accounts\n3. Search by A/C No\n4. Fund Transfer\n5. Remove A/C\n6. Apply Interest\n7. Sort by A/C No\n8. Sort by Opening Date\n9. Exit");
			System.out.print("Enter choice: ");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				addAccount();
				break;
			case 2:
				displayAll();
				break;
			case 3:
				searchAccount();
				break;
			case 4:
				fundTransfer();
				break;
			case 5:
				removeAccount();
				break;
			case 6:
				applyInterest();
				break;
			case 7:
				sortByAccNo();
				break;
			case 8:
				sortByDate();
				break;
			case 9:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice!");
			}

		} while (choice != 9);

	}

	private static void sortByDate() {
		
		
	}

	private static void sortByAccNo() {
		// TODO Auto-generated method stub
		
	}

	private static void applyInterest() {
		// TODO Auto-generated method stub
		
	}

	private static void fundTransfer() {
		// TODO Auto-generated method stub
		
	}

	private static void displayAll() {
		// TODO Auto-generated method stub
		
	}

	private static void addAccount() {
		System.out.println();
		
	}
}

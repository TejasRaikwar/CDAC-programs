package day13.Accounts;

import java.util.Comparator;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class App {
	static Scanner sc = new Scanner(System.in);
	static CopyOnWriteArrayList<Account> accountList = new CopyOnWriteArrayList<>();

	public static void main(String[] args) throws AccountNotFoundException {
		int choice;
		do {
			System.out.println(
					"\nMenus\n1. Accept A/C details from user\n2. Display all Accounts\n3. Search by A/C No\n4. Fund Transfer\n5. Remove A/C\n6. Apply Interest\n7. Sort by A/C No\n8. Sort by Opening Date\n9. Exit");
			System.out.print("Enter choice: ");

			choice = getIntInput("Enter choice : ");
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

	private static void searchAccount() throws AccountNotFoundException {
		long accNo = getLongInput("Enter account number to search : ");
		boolean found = false;

		for (Account account : accountList) {
			if (accNo == account.getAccNo()) {
				System.out.println("Account found : " + account);
				found = true;
				break;
			}
		}

		if (!found) {
			throw new AccountNotFoundException("Account Not Found");
		}
	}

	private static void removeAccount() throws AccountNotFoundException {
		long accNo = getLongInput("Enter account number to remove ");
		boolean isRemoved = false;

		for (Account account : accountList) {
			if (account.getAccNo() == accNo) {
				accountList.remove(account);
				System.out.println("Account Deleted");
				isRemoved = true;
				break;
			}
		}
		if (!isRemoved) {
			throw new AccountNotFoundException("Account Not Found");
		}
	}

	private static void sortByDate() {

	}

	private static void sortByAccNo() {
		if(accountList.isEmpty()) {
			System.out.println("No accounts available!");
			return;
		}
		accountList.sort(Comparator.comparingLong(Account::getAccNo));
		displayAll();
	}

	private static void applyInterest() {
		// TODO Auto-generated method stub

	}

	private static void fundTransfer() {
		// TODO Auto-generated method stub

	}

	private static void displayAll() {
		if (accountList.isEmpty()) {
			System.out.println("No accounts available.");
			return;
		}
		System.out.println("All accounts : ");
		for (Account account : accountList) {
			System.out.println(account);
		}
	}

	private static void addAccount() {
		try {
			String Name = getStringInput("Enter account holder name : ");
			double balance = getDoubleInput("Enter Account balance : ");

			Account account = new Account(Name, balance);
			accountList.add(account);
			System.out.println(account);
		} catch (IllegalArgumentException e) {
			System.out.println("Account Creation failed!");
		}

	}

	private static String getStringInput(String prompt) {
		while (true) {
			System.out.println(prompt);
			String input = sc.nextLine().trim();
			if (!input.isEmpty())
				return input;
			System.out.println("Input cannot be empty. please try again.");
		}
	}

	private static int getIntInput(String prompt) {
		while (true) {
			try {
				System.out.println(prompt);
				return Integer.parseInt(sc.nextLine());
			} catch (IllegalArgumentException e) {
				System.out.println("Invalid input!");
			}
		}
	}

	private static double getDoubleInput(String prompt) {
		while (true) {
			try {
				System.out.println(prompt);
				double value = Double.parseDouble(sc.nextLine());
				if (value <= 1000) {
					System.out.println("Balance must be greater than 1000");
					continue;
				}
				return value;
			} catch (IllegalArgumentException e) {
				System.out.println("Invalid Input");
			}
		}
	}

	private static long getLongInput(String prompt) {
		while (true) {
			try {
				System.out.println(prompt);
				return Long.parseLong(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Invalid Input!");
			}
		}
	}
}

package day12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static final List<Account> accounts = new ArrayList<>();
	private static final Scanner sc = new Scanner(System.in);

	private static void printMenu() {
		System.out.println("\nMenu:");
		System.out.println("1. Add account");
		System.out.println("2. Print all accounts");
		System.out.println("3. Sort by account no (descending)");
		System.out.println("4. Sort by account name");
		System.out.println("5. Sort by date of opening");
		System.out.println("6. Sort by balance (descending)");
		System.out.println("7. Exit");
	}

	private static void addAccount() {
		try {
			String accName = getStringInput("Enter account holder name : ");
			double balance = getDoubleInput("Enter initial balance (>1000) : ");

			Account account = new Account(accName, balance);
			accounts.add(account);
			System.out.println("Account created successfully!");
			System.out.println(account);
		} catch (IllegalArgumentException e) {
			System.out.println("Account creation failed : " + e.getMessage());
		}
	}

	private static void printAllAccounts() {
		if (accounts.isEmpty()) {
			System.out.println("No accounts available");
			return;
		}
		System.out.println("\nAll Accounts : ");
		System.out.println("----------------------------------------------------------------");
		System.out.printf("%-12s %-20s %-15s %12s%n", "Account No", "Name", "Opening Date", "Balance");
		System.out.println("----------------------------------------------------------------");

		for (Account account : accounts) {
			System.out.printf("%-12d %-20s %-15s %,12.2f%n", account.getAccNum(), account.getAccName(),
					account.getDateOfOpening(), account.getBalance());
		}
	}

	private static void sortByAccountNoDesc() {
		accounts.sort(Comparator.comparingLong(Account::getAccNum).reversed());
		System.out.println("\nAccounts sorted by account number (descending):");
		printAllAccounts();
	}

	private static void sortByAccName() {
		accounts.sort(Comparator.comparing(Account::getAccName));
		System.out.println("\nAccount sorted by account name : ");
		printAllAccounts();
	}

	private static void sortByDateOfOpening() {
		accounts.sort(Comparator.comparing(Account::getDateOfOpening));
		System.out.println("\nAccounts sorted by opening date:");
		printAllAccounts();
	}

	private static void sortedByBalanceDesc() {
		accounts.sort(Comparator.comparingDouble(Account::getBalance).reversed());
		System.out.println("\nAccounts sorted by balance date:");
		printAllAccounts();
	}

	private static double getDoubleInput(String promt) {
		while (true) {
			try {
				System.out.println(promt);
				double value = Double.parseDouble(sc.nextLine());
				if (value <= 1000) {
					System.out.println("Balance must be greater than 1000. Please Enter Amount again.");
					continue;
				}
				return value;
			} catch (NumberFormatException e) {
				System.out.println("Invalid input. please enter a valid number.");
			}
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
				System.out.print(prompt);
				return Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Invalid input. Please enter a valid integer.");
			}
		}
	}

	public static void main(String[] args) {
		while (true) {
			try {
				printMenu();
				int choice = getIntInput("Enter your choice (1-7) : ");

				switch (choice) {
				case 1 -> addAccount();
				case 2 -> printAllAccounts();
				case 3 -> sortByAccountNoDesc();
				case 4 -> sortByAccName();
				case 5 -> sortByDateOfOpening();
				case 6 -> sortedByBalanceDesc();
				case 7 -> {
					System.out.println("Exiting the program. Goodbye!");
					System.exit(0);
				}
				default -> System.out.println("Invalid choice. Please enter 1-7.");
				}
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
	}
}

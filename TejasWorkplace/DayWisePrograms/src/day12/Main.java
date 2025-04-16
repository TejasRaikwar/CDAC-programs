package day12;

import java.util.ArrayList;
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

	public static void main(String[] args) {

	}
}

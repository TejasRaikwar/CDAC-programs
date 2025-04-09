package day5.itemsMenu;

import java.util.Scanner;

class Account {
	private static int nextAccNo = 1001;
	int accNo;
	String name;
	double balance;

	Account(String name, double balance) {
		this.accNo = nextAccNo++;
		this.name = name;
		this.balance = balance;
	}

	Account() {
		this("Default", 0);
	}

	void displayBalance() {
		System.out.println(this);
	}

	boolean withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
			return true;
		} else {
			return false;
		}
	}

	void deposit(double amount) {
		balance += amount;
	}

	@Override
	public String toString() {
		return "Account{" + "Account No=" + accNo + ", Name='" + name + '\'' + ", Balance=₹" + balance + '}';
	}
}

public class BankMenu {
	static Account[] accounts = new Account[10];
	static int count = 0;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int choice;

		do {
			System.out.println("\n--- Bank Menu ---");
			System.out.println("1. Add Account");
			System.out.println("2. Display Balance of Particular Account");
			System.out.println("3. Withdraw");
			System.out.println("4. Transfer");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				addAccount();
				break;
			case 2:
				displayBalance();
				break;
			case 3:
				withdraw();
				break;
			case 4:
				transfer();
				break;
			case 5:
				System.out.println("Exiting. Thank you!");
				break;
			default:
				System.out.println("Invalid choice.");
			}
		} while (choice != 5);
	}

	static void addAccount() {
		if (count >= accounts.length) {
			System.out.println("Account limit reached.");
			return;
		}

		sc.nextLine(); // Consume leftover newline
		System.out.print("Enter Name: ");
		String name = sc.nextLine();
		System.out.print("Enter Initial Balance: ");
		double balance = sc.nextDouble();

		accounts[count] = new Account(name, balance);
		System.out.println("Account added successfully with Account Number: " + accounts[count].accNo);
		count++;
	}

	static int findAccountIndex(int accNo) {
		for (int i = 0; i < count; i++) {
			if (accounts[i].accNo == accNo) {
				return i;
			}
		}
		return -1;
	}

	static void displayBalance() {
		System.out.print("Enter Account Number: ");
		int accNo = sc.nextInt();
		int index = findAccountIndex(accNo);

		if (index != -1) {
			accounts[index].displayBalance();
		} else {
			System.out.println("Account not found.");
		}
	}

	static void withdraw() {
		System.out.print("Enter Account Number: ");
		int accNo = sc.nextInt();
		int index = findAccountIndex(accNo);

		if (index != -1) {
			System.out.print("Enter amount to withdraw: ");
			double amount = sc.nextDouble();
			if (accounts[index].withdraw(amount)) {
				System.out.println("Withdrawal successful.");
			} else {
				System.out.println("Insufficient balance.");
			}
		} else {
			System.out.println("Account not found.");
		}
	}

	static void transfer() {
		System.out.print("Enter Sender's Account Number: ");
		int fromAcc = sc.nextInt();
		System.out.print("Enter Receiver's Account Number: ");
		int toAcc = sc.nextInt();

		int fromIndex = findAccountIndex(fromAcc);
		int toIndex = findAccountIndex(toAcc);

		if (fromIndex == -1 || toIndex == -1) {
			System.out.println("One or both accounts not found.");
			return;
		}

		System.out.print("Enter amount to transfer: ");
		double amount = sc.nextDouble();

		if (accounts[fromIndex].withdraw(amount)) {
			accounts[toIndex].deposit(amount);
			System.out.println("Transfer successful.");
		} else {
			System.out.println("Insufficient balance in sender's account.");
		}
	}
}

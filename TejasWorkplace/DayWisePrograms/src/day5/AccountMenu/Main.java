package day5.AccountMenu;

import java.util.Scanner;

public class Main {

	public int checkAvailibility(Account[] arr, long accountNum) {
		int index = -1;
		long count = Account.getNoOfAccnts();
		for (int i = 0; i < count; i++) {
			if (accountNum == arr[i].getAccNo()) {
				index = i;
				break;
			}
		}

		if (index == -1) {
			System.out.println("Account not found!");
		}
		return index;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main m = new Main();
		int index;
		Account[] acc = new Account[100];

		acc[0] = new Account("Tejas", 15000);
		acc[1] = new Account("Shilpa", 15000);
		acc[2] = new Account("karan", 15000);
		acc[3] = new Account("Atharv", 12000);
		acc[4] = new Account("Harsh", 5000);
		acc[5] = new Account("Bulbul", 2000);
		acc[6] = new Account("Kushagra", 4321.52);
		acc[7] = new Account("Shivam", 4500);
		acc[8] = new Account("Tanmay", 10000);

		int choice;

		do {
			System.out.println("\n1. Add/Create Account\n" + "2. Display Account balance\n" + "3. Withdraw Money\n"
					+ "4. Deposit Money\n" + "5. Transfer Money\n" + "0. Exit");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				// Add Account
				if (Account.getNoOfAccnts() < acc.length) {
					System.out.println("Enter customer name : ");
					String name = sc.next();
					System.out.println("Enter Balance : ");
					double balance = sc.nextDouble();
					acc[(int) Account.getNoOfAccnts()] = new Account(name, balance);
				}

				break;
			case 2:
				while (true) {
					// print account balance
					System.out.println("Enter Account No. : ");
					long accountNum = sc.nextLong();
					index = m.checkAvailibility(acc, accountNum);
					if (index == -1)
						continue;

					System.out.println(acc[index].getBalance());
					break;

				}

				break;
			case 3:
				// withdraw amount
				while (true) {
					System.out.println("Enter Account No. : ");
					long accountNum = sc.nextLong();
					index = m.checkAvailibility(acc, accountNum);
					if (index == -1)
						continue;

					System.out.println("Enter Amount. : ");
					double amt = sc.nextDouble();
					boolean status = acc[index].Withdraw(amt);
					if (!status)
						continue;
					break;

				}

				break;
			case 4:
				// Deposit amount
				while (true) {
					System.out.println("Enter Account No. : ");
					long accountNum = sc.nextLong();

					index = m.checkAvailibility(acc, accountNum);

					if (index == -1)
						continue;

					System.out.println("Enter Ammount. : ");
					double amt = sc.nextDouble();
					acc[index].Deposit(amt);
					break;

				}

				break;
			case 5:
				// Transfer Ammount
				while (true) {
					System.out.println("Enter your account number : ");
					long sAccntnum = sc.nextLong();
					index = m.checkAvailibility(acc, sAccntnum);
					if (index == -1)
						continue;

					System.out.println("Enter reciever`s Account number : ");
					long rAccntnumber = sc.nextLong();
					int rIndex = m.checkAvailibility(acc, rAccntnumber);
					if (rIndex == -1)
						continue;
					while (true) {
						System.out.println("Enter amount : ");
						double amt = sc.nextDouble();
						boolean status = acc[index].Withdraw(amt);
						if (!status)
							continue;

						acc[rIndex].Deposit(amt);
						break;

					} // end of inner while

					break;
				} // end of outer while

				break;
			case 0:

				break;
			default:
				System.out.println("Invalid Input !");
			}

		} while (choice != 0);
		sc.close();
		System.out.println("Thank you");
	}
}

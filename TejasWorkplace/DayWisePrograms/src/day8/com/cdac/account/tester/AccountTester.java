package day8.com.cdac.account.tester;

import java.util.Scanner;

import day8.com.cdac.account.object.Account;
import day8.com.cdac.account.object.CurrentAccount;
import day8.com.cdac.account.object.DepositAccount;
import day8.com.cdac.account.object.SavingAccount;

/*1. Create Account class with accountNumber, accountName,
dateOfOpening, balcance.
Add below functionality

1. Generate account number on account creation.
2. Add abstract method as double applyInterest() in the
account class
3. Create child classes as SavingAccount,
CurrentAccount, DepositAccount. Override double
applyInterest() in the child classes.
4. Interest percentage of Saving are 3%, Deposit 8%, and
Current as 1%
5. Use upcasting and demonstrate Dynamic method
dispatch.
6. Make is menu driven.*/
public class AccountTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Account acc[] = new Account[20];
		int count = 0;
		int op;
		System.out.println("Welcome to Bank");
		do {
			System.out.println(
					"Enter Option : \n1.Create Savings Account\n2.Create Current Account\n3.Create Deposit Account\n4.Apply Interest to all Accounts\n5.Display All Accounts");
			op = sc.nextInt();
			sc.nextLine();
			switch (op) {

			case 1: {

				if (count == 10) {
					System.out.println("Cannot open any more Accounts");
					break;
				}
				System.out.println("Enter Saving Account details :");
				System.out.println("Enter the Account Name :");
				String name = sc.nextLine();
				System.out.println("Enter the Account dateOfOpening :");
				String doj = sc.nextLine();
				System.out.println("Enter the Account balance :");
				Double balance = sc.nextDouble();
				acc[count++] = new SavingAccount(name, doj, balance);
				System.out.println("Saving Account Created");
				break;
			}
			case 2: {
				if (count == 10) {
					System.out.println("Cannot open any more Accounts");
					break;
				}
				System.out.println("Enter Current Account details :");
				System.out.println("Enter the Account Name :");
				String name = sc.nextLine();
				System.out.println("Enter the Account dateOfOpening :");
				String doj = sc.nextLine();
				System.out.println("Enter the Account balance :");
				Double balance = sc.nextDouble();
				acc[count++] = new day8.com.cdac.account.object.CurrentAccount(name, doj, balance);
				System.out.println("Current Account Created");
				break;
			}
			case 3: {
				if (count == 10) {
					System.out.println("Cannot open any more Accounts");
					break;
				}
				System.out.println("Enter Deposit Account details :");
				System.out.println("Enter the Account Name :");
				String name = sc.nextLine();
				System.out.println("Enter the Account dateOfOpening :");
				String doj = sc.nextLine();
				System.out.println("Enter the Account balance :");
				Double balance = sc.nextDouble();
				acc[count++] = new DepositAccount(name, doj, balance);
				System.out.println("Deposit Account Created");
				break;
			}
			case 4: {
				for (int i = 0; i < count; i++) {
					acc[i].applyInterest();
				}
				System.out.println("Interest Applied to All Accounts in Bank");
				break;
			}
			case 5: {
				for (int i = 0; i < count; i++) {
					System.out.println(acc[i]);
				}
				break;
			}
			case 0: {
				System.out.println("Thank you for Visit");
			}
				break;

			default:
				System.out.println("Invalid Input");
				break;
			}
		} while (op != 0);

	}

}

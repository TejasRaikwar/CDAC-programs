#include <iostream>
#include <limits>
#include"Account.h"

using namespace std;

int main()
{
	int n;
	cout << "Enter the number of accounts to create: ";
	cin >> n;

	Account *accounts = new Account[n];

	for (int i = 0; i < n; i++)
	{
		cout << "\nEnter details for Account " << i + 1 << ":\n";
		accounts[i].Accept();
	}

	int choice;
	do
	{
		cout << "\n==== Bank Account Menu ====\n";
		cout << "1. Deposit Money\n";
		cout << "2. Withdraw Money\n";
		cout << "3. Display All Accounts\n";
		cout << "4. Exit\n";
		cout << "Enter your choice: ";
		cin >> choice;

		switch (choice)
		{
		case 1:
		{
			int accNo;
			double amount;
			cout << "Enter Account Number for Deposit: ";
			cin >> accNo;

			bool found = false;
			for (int i = 0; i < n; i++)
			{
				if (accounts[i].getAccountNumber() == accNo)
				{
					cout << "Enter Amount to Deposit: ";
					cin >> amount;
					accounts[i].Deposit(amount);
					found = true;
					break;
				}
			}

			if (!found)
			{
				cout << "Account not found!" << endl;
			}
			break;
		}
		case 2:
		{
			int accNo;
			double amount;
			cout << "Enter Account Number for Withdrawal: ";
			cin >> accNo;

			bool found = false;
			for (inaccounts = nullptr;break;
				}
			}

			if (!found)
			{
				cout << "Account not found!" << endl;
			}
			break;
		}
		case 3:
			cout << "\nList of Accounts:\n";
			for (int i = 0; i < n; i++)
			{
				accounts[i].Display();
			}
			break;

		case 4:
			cout << "Exiting Program..." << endl;
			break;

		default:
			cout << "Invalid choice! Please try again.\n";
		}
	} while (choice != 4);

	delete[] accounts;
	accounts = nullptr;

	return 0;
}

#include <iostream>
#include <limits>

using namespace std;

class Account
{
private:
	int accountNumber;
	string accountHolder;
	double balance;

public:
	Account() : accountNumber(-1), accountHolder(""), balance(0.0)  
	{
		cout << "Default Constructor Created: " << this << endl;
	}

	Account(int accNo, string accHolder, double bal) : accountNumber(accNo), accountHolder(accHolder), balance(bal)
	{
		cout << "Parameterized Constructor Created: " << this << endl;
	}

	void Accept()
	{
		cout << "Enter Account Number: ";
		cin >> accountNumber;

		cout << "Enter Account Holder Name: ";
		cin >> accountHolder;

		cout << "Enter Initial Balance: ";
		cin >> balance;

		cout << "Account Created at Address: " << this << endl;
	}
 
	void Display() const
	{
		if (accountNumber == -1)
		{
			cout << "No account data available!" << endl;
			return;
		}
		cout << "Account Number: " << accountNumber << ", Name: " << accountHolder << ", Balance: " << balance << endl;
	}

	void Deposit(double amount)
	{
		if (amount > 0)
		{
			balance += amount;
			cout << "Deposited: " << amount << ", New Balance: " << balance << endl;
		}
		else
		{
			cout << "Invalid deposit amount!" << endl;
		}
	}

	void Withdraw(double amount)
	{
		if (amount > 0 && amount <= balance)
		{
			balance -= amount;
			cout << "Withdrawn: " << amount << ", Remaining Balance: " << balance << endl;
		}
		else
		{
			cout << "Invalid Withdrawal amount or Insufficient Balance!" << endl;
		}
	}

	int getAccountNumber() const
	{
		return accountNumber;
	}
};

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
			for (int i = 0; i < n; i++)
			{
				if (accounts[i].getAccountNumber() == accNo)
				{
					cout << "Enter Amount to Withdraw: ";
					cin >> amount;
					accounts[i].Withdraw(amount);
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

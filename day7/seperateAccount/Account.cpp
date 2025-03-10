#include<iostream>
#include"Account.h"
using namespace std;

    Account::Account() : accountNumber(-1), accountHolder(""), balance(0.0)  
	{
		cout << "Default Constructor Created: " << this << endl;
	}

	Account::Account(int accNo, string accHolder, double bal) : accountNumber(accNo), accountHolder(accHolder), balance(bal)
	{
		cout << "Parameterized Constructor Created: " << this << endl;
	}

	void Account::Accept()
	{
		cout << "Enter Account Number: ";
		cin >> accountNumber;

		cout << "Enter Account Holder Name: ";
		cin >> accountHolder;

		cout << "Enter Initial Balance: ";
		cin >> balance;

		cout << "Account Created at Address: " << this << endl;
	}
 
	void Account::Display() const
	{
		if (accountNumber == -1)
		{
			cout << "No account data available!" << endl;
			return;
		}
		cout << "Account Number: " << accountNumber << ", Name: " << accountHolder << ", Balance: " << balance << endl;
	}

	void Account::Deposit(double amount)
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

	void Account::Withdraw(double amount)
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

	int Account::getAccountNumber() const
	{
		return accountNumber;
	} 
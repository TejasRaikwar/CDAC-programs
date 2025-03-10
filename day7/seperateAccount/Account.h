 
#include <iostream>
using namespace std;
class Account
{
private:
	int accountNumber;
	string accountHolder;
	double balance;

public:
	Account() ;

	Account(int accNo, string accHolder, double bal);

	void Accept();
 
	void Display() const;

	void Deposit(double amount);

	void Withdraw(double amount);

	int getAccountNumber() const;
};
 
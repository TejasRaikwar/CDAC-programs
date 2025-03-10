#include<iostream>
#include<string.h>
using namespace std;

class Account{
    private:
        int accountNumber;
        string accHolder;
        double balance;
    public:

       Account();
       Account(int accNum, string accHolder, double balance);
       void accept();
       void display() const;
       void Deposit(double amount);
       void Withdraw(double amount);
       int getAccountNumber() const;
};
#include <iostream>
using namespace std;

class Account
{
private:
    string name;
    long accNum;
    double balance;

public:
    Account();
    Account(long, string, double);
    void Accept();
    void Display() const;
    void Deposit(double amt);
    void Withdraw(double amt);
    long getAccntNum();
};
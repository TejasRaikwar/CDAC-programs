#include "account.h";

Account::Account()
{
    cout << "default constructor called.";
    accNum = 0;
    name = "";
    balance = 0.0;
}

Account::Account(long accNum, string name, double balance) : accNum(accNum), name(name), balance(balance)
{
    cout << "parameterized constructor called.";
}

void Account::Accept()
{
    cout<<"Enter Account details"<<endl;
    cout<<"Enter account number : ";
    cin>>accNum;
}
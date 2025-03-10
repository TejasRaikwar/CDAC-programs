#include<iostream>
#include"Account.h";
using namespace std;

Account::Account():accountNumber(-1), accHolder(""),balance(){
    cout<<"default constructor created";
}

Account::Account(int accNumber, string name, double bal):accountNumber(accNumber),accHolder(name),balance(bal){
    cout<<"Parameterized Constructor created";
}
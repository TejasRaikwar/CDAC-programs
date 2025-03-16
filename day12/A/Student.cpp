#include<iostream>
#include"Address.cpp"
using namespace std;

class Student
{
private:
    int rno;
    string name;
    Address currAddress,permAddress;

public:
    Student(){};
    Student(int roll, string name, Address pAddr, Address cAddr):rno(roll), name(name), currAddress(cAddr), permAddress(pAddr){};

    void AcceptStudent(){
        cout<<"Enter student data :"<<endl;
        cout<<"Enter name : ";cin>>name;
        cout<<"Enter roll : ";cin>>rno;
        cout<<"Enter Current Address :\n";
        currAddress.Accept();
        cout<<"Enter Permanent Address :\n";
        permAddress.Accept();
    }

    void DisplayStudent(){
        cout<<"\nRoll : "<<rno<<", Name : "<<name<<endl ;
        cout<<"current Address : ";currAddress.Display();
        cout<<"\nPermanent Address : ";permAddress.Display();
    }
};


int main(){
    Student s;
    s.AcceptStudent();
    s.DisplayStudent();
    return 0;

}
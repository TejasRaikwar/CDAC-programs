 
#include "Student.h"
 using namespace std;
 
    void Student::enterDetails()
    {
            cout << "enter student rollNo:->" << endl;
            cin >> rollNo;
            cout << "Enter Name: ";
            cin >>name;
            cout << "Enter Age: ";
            cin >>age;
            cout << "Enter Mobile Number: ";
            cin >>phoneNumber;

    }

    void Student::displayDetails()
    {
            cout << "\nDetails of Students:" << endl;
            cout<<"Roll No. : " <<rollNo<<endl;
            cout<<"Name : "<<name<<endl;
            cout<<"Age : "<<age<<endl;
            cout<<"Phone Number : "<<phoneNumber<<endl;

    }

    int Student::getRollNo() const{
        return rollNo;
    }
    string Student::getName() const{
        return name;
    }

    bool Student::compare(const Student &s1, const Student &s2)
    {
        if (s1.getRollNo() != s2.getRollNo())
            return s1.getRollNo() < s2.getRollNo();
        return s1.getName() < s2.getName();
    }
 
 
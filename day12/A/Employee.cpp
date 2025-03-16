#include <iostream>
#include "Address.cpp"
using namespace std;

class Employee
{
    int eid;
    Address address;
    string name;
    double salary;

public:
    Employee() {};
    Employee(int eid, string name, double salary, Address addr) : eid(eid), name(name) {};
    void DisplayEmployee()
    {
        cout << "Employee id : " << eid << ", Name : " << name << ", Salary : " << salary << endl
             << "Address : ";
        address.Display();
    }
    void addRecord()
    {
        cout << "Enter ";
    }
    int getEid()
    {
        return eid;
    }

    // Getters
    string getName() const { return name; }
    void getAddress() const { address.Display(); }
    double getSalary() const { return salary; }

    // Setters
    void setName(string name){
        this->name = name;
    };
    void setSalary(double salary){
        this->salary = salary;
    }
    
};
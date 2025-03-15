

#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

class Employee
{
private:
    string empNo;
    string name;
    double salary;
    string dept;

public:
    void Accept();
    void Display();
    string getEmpNo() const;
    string getName() const;
    double getSalary() const;
    static bool compare(const Employee &e1, const Employee &e2);
};

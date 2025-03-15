#include "Employee.h"

void Employee::Accept()
{
    cout << "Please enter empNo:->";
    cin >> empNo;
    cout << "Please enter employee name:->";
    cin >> name;
    cout << "Please enter employee salary:->";
    cin >> salary;
    cout << "Please enter employee dept:->";
    cin >> dept;
}

void Employee::Display()
{
    cout << "Employee empNo:->" << empNo << endl;
    cout << "Employee name:->" << name << endl;
    cout << "Employee salary:->" << salary << endl;
    cout << "Employee dept:->" << dept << endl;
}

string Employee::getEmpNo() const
{
    return empNo;
}

string Employee::getName() const
{
    return name;
}

double Employee::getSalary() const
{
    return salary;
}

bool Employee::compare(const Employee &e1, const Employee &e2)
{
    if (e1.getEmpNo() != e2.getEmpNo())
    {
        return e1.getEmpNo() < e2.getEmpNo();
    }
    else if (e1.getName() != e2.getName())
    {
        return e1.getName() < e2.getName();
    }
    return e1.getSalary() < e2.getSalary();
}
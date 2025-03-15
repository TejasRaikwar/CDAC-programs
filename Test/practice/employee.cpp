#include "employee.h"

int Employee::getEmpId() const
{
   return empId;
}
string Employee::getName() const
{
   return name;
}
double Employee::getSalary() const
{
   return salary;
}

void Employee::Accept()
{
   cout << "Enter Employee details" << endl;
   cout << "Enter EmpID : ";
   cin >> empId;
   cout << "Enter Employee name : ";
   cin >> name;
   cout << "Enter Salary : ";
   cin >> salary;
}

void Employee::Display()
{
   cout << "Details of the employee are : " << endl;
   cout << "Employee id : " << empId << " name : " << name << " Salary : " << salary << endl;
}

bool Employee::sortEmp(const Employee &e1, const Employee &e2)
{
   if (e1.empId != e2.empId)
   {
      return e1.empId < e2.empId;
   }
   else if (e1.salary != e2.salary)
   {
      return e1.salary < e2.salary;
   }
   else
   {
      return e1.name < e2.name;
   }
}

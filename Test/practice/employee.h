#include <bits/stdc++.h>
#include <string.h>
using namespace std;

class Employee
{
private:
   int empId;
   string name;
   double salary;

public:
   int getEmpId() const;
   string getName() const;
   double getSalary() const;
   void Accept();
   void Display();
   static bool sortEmp(const Employee &e1, const Employee &e2);
};

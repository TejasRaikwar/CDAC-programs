#include"PermEmployee.h"
#include "Employee.h"
PermEmployee::PermEmployee(){
    cout<<"PermEmployee::PermEmployee()";
}

PermEmployee::PermEmployee(int empId, string Name, double salary, int monthsOfExp):Employee(empId, Name, salary), monthsOfExp(monthsOfExp){
    cout<<"PermEmployee::PermEmployee(int , string, double int)"<<this<<endl;
}
 

void PermEmployee::Accept() {
    Employee::Accept();
    cout<<"Enter number of months exp:-->";
    cin>>monthsOfExp;
    
}
double PermEmployee::CalcSalary(){
    return salary += salary*((monthsOfExp/12)*0.1);
}

void PermEmployee::Display(){
    Employee::Display();
    cout<<"Salary wtih bonus:->"<<CalcSalary()<<endl;
}
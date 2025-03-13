#include<iostream>
#include"Employee.h"
using namespace std;
Employee::Employee(){
    cout<<"Employee::Employee";
}

Employee::Employee(int empId,string name,double salary):empId(empId),name(name),salary(salary){
    cout<<"\n Employee::Employee(int string double)"<<endl;
}

void Employee::Accept(){
    cout<<"Enter Employee ID:->";
    cin>>empId;
    cout<<"Enter employee Name:->";
    cin>>name;
    cout<<"Enter Employee Salary:->";
    cin>>salary;
}
void Employee::Display(){
    cout<<"[ "<<"employee ID: "<<empId<<" employee name "<<name<<" employee slary: "<<salary<<" ]"<<endl;
}
 
#ifndef EMPLOYEE_H
#define EMPLOYEE_H
#include <iostream>

using namespace std;

class Employee{
    private:
        int empId;
        string name;
    protected:
        double salary;
    public:
        Employee();
        Employee(int,string,double);
        virtual double CalcSalary() = 0;
        void Accept();
        void Display();
         

};
#endif
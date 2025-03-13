#include"ContractEmployee.h"
#include"Employee.h"

 
        ContractEmployee::ContractEmployee(){
            cout<<"ContractEmployee::ContractEmployee"<<endl;
        }
        ContractEmployee::ContractEmployee(int empId, string name,double salary,int contractMonths):Employee(empId,name,salary),contractMonths(contractMonths){
            cout<<"ContractEmployee::ContractEmployee(int,string,double,int)"<<endl;
        }

     
        void ContractEmployee::Accept(){
            Employee::Accept();
            cout<<"Enter number of months contract:-->";
            cin>>contractMonths;
        }
        double ContractEmployee::CalcSalary(){
            return salary += salary*((contractMonths/9)*0.05);

        }
        void ContractEmployee::Display(){
            Employee::Display();
            cout<<"Salary wtih bonus:->"<<CalcSalary()<<endl;
        }


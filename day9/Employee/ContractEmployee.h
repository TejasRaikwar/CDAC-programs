#include"Employee.h"

class ContractEmployee : public Employee{
    private:
        int contractMonths;
    public:
        ContractEmployee();
        ContractEmployee(int, string,double,int);

        void Display();
        void Accept();
        double CalcSalary();
};

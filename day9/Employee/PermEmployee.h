 
#include"Employee.h"

class PermEmployee : public Employee{
    private:
        int monthsOfExp;
    public:
        PermEmployee();
        PermEmployee(int, string,double,int);

        void Display();
        void Accept ();
        double CalcSalary();
};

